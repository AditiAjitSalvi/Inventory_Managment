<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String orderId = request.getParameter("orderId");
if (orderId == null || orderId.trim().isEmpty()) {
    out.println("<script>alert('Order ID missing.'); window.history.back();</script>");
    return;
}

Connection con = null;
PreparedStatement psGetItems = null, psUpdateStock = null;
PreparedStatement psNullifyBilling = null, psDeleteBilling = null;
PreparedStatement psDeleteItems = null, psDeleteOrder = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventory", "root", "");
    con.setAutoCommit(false); // Start transaction

    // Step 1: Restore product stock from order_items
    psGetItems = con.prepareStatement("SELECT product_id, quantity FROM order_items WHERE order_id = ?");
    psGetItems.setString(1, orderId);
    ResultSet rsItems = psGetItems.executeQuery();

    psUpdateStock = con.prepareStatement("UPDATE products SET quantity_in_stock = quantity_in_stock + ? WHERE product_id = ?");
    while (rsItems.next()) {
        int productId = rsItems.getInt("product_id");
        int quantity = rsItems.getInt("quantity");
        psUpdateStock.setInt(1, quantity);
        psUpdateStock.setInt(2, productId);
        psUpdateStock.executeUpdate();
    }

    // Step 2: Nullify billing_id in orders to break foreign key dependency
    psNullifyBilling = con.prepareStatement("UPDATE orders SET billing_id = NULL WHERE id = ?");
    psNullifyBilling.setString(1, orderId);
    psNullifyBilling.executeUpdate();

    // Step 3: Delete from billing
    psDeleteBilling = con.prepareStatement("DELETE FROM billing WHERE order_id = ?");
    psDeleteBilling.setString(1, orderId);
    psDeleteBilling.executeUpdate();

    // Step 4: Delete from order_items
    psDeleteItems = con.prepareStatement("DELETE FROM order_items WHERE order_id = ?");
    psDeleteItems.setString(1, orderId);
    psDeleteItems.executeUpdate();

    // Step 5: Delete from orders
    psDeleteOrder = con.prepareStatement("DELETE FROM orders WHERE id = ?");
    psDeleteOrder.setString(1, orderId);
    psDeleteOrder.executeUpdate();

    con.commit();

    out.println("<script>alert('Order deleted successfully and stock restored.'); window.location='Order.jsp';</script>");

} catch (Exception e) {
    if (con != null) con.rollback();
    out.println("<pre>Error: " + e.getMessage() + "</pre>");
} finally {
    try { if (psGetItems != null) psGetItems.close(); } catch (Exception e) {}
    try { if (psUpdateStock != null) psUpdateStock.close(); } catch (Exception e) {}
    try { if (psNullifyBilling != null) psNullifyBilling.close(); } catch (Exception e) {}
    try { if (psDeleteBilling != null) psDeleteBilling.close(); } catch (Exception e) {}
    try { if (psDeleteItems != null) psDeleteItems.close(); } catch (Exception e) {}
    try { if (psDeleteOrder != null) psDeleteOrder.close(); } catch (Exception e) {}
    try { if (con != null) con.close(); } catch (Exception e) {}
}
%>
</body>
</html>