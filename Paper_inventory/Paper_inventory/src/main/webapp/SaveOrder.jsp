<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.text.SimpleDateFormat, java.io.StringWriter, java.io.PrintWriter, java.sql.*, com.mysql.cj.jdbc.Driver"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Order Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	
<%
String[] productIds = request.getParameterValues("productId[]");
String[] unitPrices = request.getParameterValues("unitPrice[]");
String[] quantities = request.getParameterValues("quantity[]");
String[] subtotals = request.getParameterValues("subtotal[]");
String customerName = request.getParameter("customerName");
String retailerParam = request.getParameter("retailerId");

if (retailerParam == null || retailerParam.trim().isEmpty()) {
    out.println("<script>alert('Retailer ID is missing!'); window.history.back();</script>");
    return;
}
int retailerId = Integer.parseInt(retailerParam.trim());

if (productIds == null || productIds.length == 0) {
    out.println("<script>alert('No products selected!'); window.history.back();</script>");
    return;
}

Connection con = null;
PreparedStatement psOrder = null, psOrderItem = null, psUpdateStock = null, psInsertBilling = null, psUpdateBillingId = null, psUpdateTotal = null;
double totalAmount = 0.0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventory", "root", "");
    con.setAutoCommit(false);

    // Insert into orders
    String insertOrderSQL = "INSERT INTO orders (retailer_id, order_date, status, total_amount, billing_id) VALUES (?, NOW(), 'Pending', 0, NULL)";
    psOrder = con.prepareStatement(insertOrderSQL, Statement.RETURN_GENERATED_KEYS);
    psOrder.setInt(1, retailerId);
    psOrder.executeUpdate();

    ResultSet rsOrder = psOrder.getGeneratedKeys();
    int orderId = 0;
    if (rsOrder.next()) {
        orderId = rsOrder.getInt(1);
    }

    // Insert into order_items
    String insertItem = "INSERT INTO order_items (order_id, product_id, quantity, unit_price, subtotal) VALUES (?, ?, ?, ?, ?)";
    psOrderItem = con.prepareStatement(insertItem);
    psUpdateStock = con.prepareStatement("UPDATE products SET quantity_in_stock = quantity_in_stock - ? WHERE product_id = ?");

    for (int i = 0; i < productIds.length; i++) {
        if (productIds[i] == null || productIds[i].trim().isEmpty()) continue;

        int pid = Integer.parseInt(productIds[i].trim());
        int qty = Integer.parseInt(quantities[i].trim());
        double price = Double.parseDouble(unitPrices[i].trim());
        double subtotal = Double.parseDouble(subtotals[i].trim());

        totalAmount += subtotal;

        psOrderItem.setInt(1, orderId);
        psOrderItem.setInt(2, pid);
        psOrderItem.setInt(3, qty);
        psOrderItem.setDouble(4, price);
        psOrderItem.setDouble(5, subtotal);
        psOrderItem.executeUpdate();

        psUpdateStock.setInt(1, qty);
        psUpdateStock.setInt(2, pid);
        psUpdateStock.executeUpdate();
    }

    // Update total_amount in orders table
    psUpdateTotal = con.prepareStatement("UPDATE orders SET total_amount = ? WHERE id = ?");
    psUpdateTotal.setDouble(1, totalAmount);
    psUpdateTotal.setInt(2, orderId);
    psUpdateTotal.executeUpdate();

    // Insert into billing table
    String insertBillingSQL = "INSERT INTO billing (order_id, billing_date, amount) VALUES (?, NOW(), ?)";
    psInsertBilling = con.prepareStatement(insertBillingSQL, Statement.RETURN_GENERATED_KEYS);
    psInsertBilling.setInt(1, orderId);
    psInsertBilling.setDouble(2, totalAmount);
    psInsertBilling.executeUpdate();

    ResultSet rsBilling = psInsertBilling.getGeneratedKeys();
    int billingId = 0;
    if (rsBilling.next()) {
        billingId = rsBilling.getInt(1);
    }

    // Update order with billing_id
    psUpdateBillingId = con.prepareStatement("UPDATE orders SET billing_id = ? WHERE id = ?");
    psUpdateBillingId.setInt(1, billingId);
    psUpdateBillingId.setInt(2, orderId);
    psUpdateBillingId.executeUpdate();

    con.commit();
    out.println("<script>alert('Order and billing processed successfully!'); window.location='Order.jsp';</script>");

} catch (Exception e) {
    if (con != null) try { con.rollback(); } catch (SQLException ex) { out.println("Rollback Error: " + ex.getMessage()); }
    out.println("<pre>Error: " + e.getMessage() + "</pre>");
    e.printStackTrace(new PrintWriter(out));
} finally {
    try {
        if (psOrder != null) psOrder.close();
        if (psOrderItem != null) psOrderItem.close();
        if (psUpdateStock != null) psUpdateStock.close();
        if (psInsertBilling != null) psInsertBilling.close();
        if (psUpdateBillingId != null) psUpdateBillingId.close();
        if (psUpdateTotal != null) psUpdateTotal.close();
        if (con != null) con.close();
    } catch (SQLException ex) {
        out.println("<pre>Error closing resources: " + ex.getMessage() + "</pre>");
    }
}
%>

</body>
</html>