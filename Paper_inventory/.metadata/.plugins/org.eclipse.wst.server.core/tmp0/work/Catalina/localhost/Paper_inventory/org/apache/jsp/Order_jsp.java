/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.12
 * Generated at: 2025-06-04 14:18:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.mysql.cj.jdbc.Driver");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Orders</title>\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- Font Awesome for icons -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<style>\r\n");
      out.write("/* Main Layout */\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background-color: #f8f9fa;\r\n");
      out.write("	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dashboard-container {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	min-height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Sidebar Styles */\r\n");
      out.write(".sidebar {\r\n");
      out.write("	width: 240px;\r\n");
      out.write("	background-color: #3b82f6; /* Blue 600 equivalent */\r\n");
      out.write("	color: white;\r\n");
      out.write("	transition: all 0.3s ease-in-out;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar.collapsed {\r\n");
      out.write("	width: 64px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-header {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: space-between;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-title {\r\n");
      out.write("	font-size: 1.25rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-toggle {\r\n");
      out.write("	background: transparent;\r\n");
      out.write("	border: none;\r\n");
      out.write("	color: white;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-toggle:hover {\r\n");
      out.write("	background-color: rgba(255, 255, 255, 0.1);\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-menu {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	padding-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-link {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	padding: 12px 16px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: white;\r\n");
      out.write("	margin: 4px 0;\r\n");
      out.write("	transition: background-color 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-link:hover {\r\n");
      out.write("	background-color: #2563eb; /* Blue 700 equivalent */\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-link.active {\r\n");
      out.write("	background-color: #1d4ed8; /* Blue 800 equivalent */\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-link i {\r\n");
      out.write("	font-size: 1.25rem;\r\n");
      out.write("	width: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-link .link-text {\r\n");
      out.write("	margin-left: 12px;\r\n");
      out.write("	white-space: nowrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar.collapsed .sidebar-title, .sidebar.collapsed .link-text {\r\n");
      out.write("	display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Main Content */\r\n");
      out.write(".main-content {\r\n");
      out.write("	flex: 1;\r\n");
      out.write("	padding: 24px;\r\n");
      out.write("	overflow-y: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Stat Cards */\r\n");
      out.write(".stat-card {\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	border: 1px solid rgba(0, 0, 0, 0.125);\r\n");
      out.write("	box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".stat-icon {\r\n");
      out.write("	font-size: 1.25rem;\r\n");
      out.write("	color: #6b7280; /* Text muted equivalent */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".stat-title {\r\n");
      out.write("	font-size: 0.875rem;\r\n");
      out.write("	color: #6b7280; /* Text muted equivalent */\r\n");
      out.write("	margin-bottom: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".stat-value {\r\n");
      out.write("	font-size: 1.5rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Chart Container */\r\n");
      out.write(".chart-container {\r\n");
      out.write("	height: 320px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Product Visualization */\r\n");
      out.write(".product-visualization {\r\n");
      out.write("	height: 256px;\r\n");
      out.write("	background-color: #312e81; /* Indigo 950 equivalent */\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Status Badges */\r\n");
      out.write(".status {\r\n");
      out.write("	padding: 4px 8px;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	font-size: 0.75rem;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".status.pending {\r\n");
      out.write("	background-color: #fff8e6;\r\n");
      out.write("	color: #d97706; /* Amber 500 equivalent */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".status.urgent {\r\n");
      out.write("	background-color: #fef2f2;\r\n");
      out.write("	color: #ef4444; /* Red 500 equivalent */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".status.completed {\r\n");
      out.write("	background-color: #ecfdf5;\r\n");
      out.write("	color: #10b981; /* Green 500 equivalent */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Orders Page Styles */\r\n");
      out.write(".orders-container {\r\n");
      out.write("	max-width: 100%;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-wrapper {\r\n");
      out.write("	width: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-table {\r\n");
      out.write("	font-size: 0.9rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-table th {\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	color: #4b5563;\r\n");
      out.write("	border-bottom-width: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-table td {\r\n");
      out.write("	vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order-table .form-check {\r\n");
      out.write("	margin: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive Adjustments */\r\n");
      out.write("@media ( max-width : 768px) {\r\n");
      out.write("	.sidebar {\r\n");
      out.write("		width: 64px;\r\n");
      out.write("	}\r\n");
      out.write("	.sidebar .sidebar-title, .sidebar .link-text {\r\n");
      out.write("		display: none;\r\n");
      out.write("	}\r\n");
      out.write("	.main-content {\r\n");
      out.write("		padding: 16px;\r\n");
      out.write("	}\r\n");
      out.write("	.orders-container .btn-group {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("	}\r\n");
      out.write("	.orders-container .btn-group .btn {\r\n");
      out.write("		margin-bottom: 8px;\r\n");
      out.write("		margin-right: 0 !important;\r\n");
      out.write("	}\r\n");
      out.write("	.search-wrapper {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		margin-bottom: 16px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".action-buttons {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	right: 20px;\r\n");
      out.write("	top: 150px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	gap: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width : 992px) {\r\n");
      out.write("	.orders-container .d-flex {\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("	}\r\n");
      out.write("	.orders-container .d-flex .btn {\r\n");
      out.write("		margin-bottom: 8px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card:hover {\r\n");
      out.write("	transform: translateY(-5px);\r\n");
      out.write("	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	transition: 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"dashboard-container\">\r\n");
      out.write("		<!-- Sidebar -->\r\n");
      out.write("		<div class=\"sidebar\" id=\"sidebar\">\r\n");
      out.write("			<div class=\"sidebar-header\">\r\n");
      out.write("				<h2 class=\"sidebar-title\">Dashboard</h2>\r\n");
      out.write("				<button class=\"btn sidebar-toggle\" id=\"sidebarToggle\">\r\n");
      out.write("					<i class=\"fa fa-bars\"></i>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"sidebar-menu\">\r\n");
      out.write("				<a href=\"Home.jsp\" class=\"sidebar-link active\"> <i class=\"fa fa-home\"></i>\r\n");
      out.write("					<span class=\"link-text\">Home</span>\r\n");
      out.write("				</a> <a href=\"\" class=\"sidebar-link\"> <i class=\"fa fa-chart-bar\"></i>\r\n");
      out.write("					<span class=\"link-text\">Supplier</span>\r\n");
      out.write("				</a> <a href=\"Product.jsp\" class=\"sidebar-link\"> <i class=\"fa fa-shopping-bag\"></i>\r\n");
      out.write("					<span class=\"link-text\">Products</span>\r\n");
      out.write("				</a> <a href=\"Retailer.jsp\" class=\"sidebar-link\"> <i class=\"fa fa-users\"></i> <span\r\n");
      out.write("					class=\"link-text\">Retailer</span> \r\n");
      out.write("					<a href=\"Order.jsp\" class=\"sidebar-link\">\r\n");
      out.write("						<i class=\"fa fa-shopping-cart\"></i> <span class=\"link-text\">Orders</span>\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("				</a> <a href=\"Billing.jsp\" class=\"sidebar-link\"> <i class=\"fa fa-file-invoice\"></i>\r\n");
      out.write("					<span class=\"link-text\">Billing</span>\r\n");
      out.write("				</a> <a href=\"Login.html\" class=\"sidebar-link\"> <i\r\n");
      out.write("					class=\"fa fa-sign-out-alt\"></i> <span class=\"link-text\">Logout</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h2>Place Order</h2>\r\n");
      out.write("			<form action=\"SaveOrder.jsp\" method=\"post\" id=\"orderForm\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- Retailer Dropdown -->\r\n");
      out.write("				<div class=\"form-group mb-3\">\r\n");
      out.write("					<label for=\"retailer\">Select Retailer:</label> <select\r\n");
      out.write("						class=\"form-control\" id=\"retailer\" name=\"retailerId\" required\r\n");
      out.write("						onchange=\"setCustomerFromRetailer()\">\r\n");
      out.write("						<option value=\"\" disabled selected>Choose Retailer</option>\r\n");
      out.write("						");

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventory", "root", "");
							Statement stmt = con.createStatement();
							ResultSet rs = stmt.executeQuery("SELECT id, name, contact_name FROM retailers");
							while (rs.next()) {
						
      out.write("\r\n");
      out.write("						<option value=\"");
      out.print(rs.getInt("id"));
      out.write("\"\r\n");
      out.write("							data-contact=\"");
      out.print(rs.getString("contact_name"));
      out.write("\">\r\n");
      out.write("							");
      out.print(rs.getString("name"));
      out.write("\r\n");
      out.write("						</option>\r\n");
      out.write("						");

						}
						con.close();
						} catch (Exception e) {
						out.println("Error loading retailers.");
						}
						
      out.write("\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Auto-filled Customer Contact Name -->\r\n");
      out.write("				<div class=\"form-group mb-3\">\r\n");
      out.write("					<label for=\"customer\">Customer Contact Name:</label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control\" id=\"customer\" name=\"customerName\"\r\n");
      out.write("						readonly />\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Product Dropdown -->\r\n");
      out.write("				<div class=\"form-group mb-3\">\r\n");
      out.write("					<label for=\"product\">Select Product:</label> <select\r\n");
      out.write("						class=\"form-control\" id=\"product\">\r\n");
      out.write("						");

						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventory", "root", "");
							Statement stmt = con.createStatement();
							ResultSet rs = stmt.executeQuery("SELECT product_id, product_name,quantity_in_stock,unit_price FROM products");
							while (rs.next()) {
							 
						
      out.write("\r\n");
      out.write("						<option value=\"");
      out.print(rs.getInt("product_id"));
      out.write("\"\r\n");
      out.write("							data-price=\"");
      out.print(rs.getDouble("unit_price"));
      out.write("\"\r\n");
      out.write("							data-stock=\"");
      out.print(rs.getInt("quantity_in_stock"));
      out.write("\">\r\n");
      out.write("							");
      out.print(rs.getString("product_name"));
      out.write("\r\n");
      out.write("						</option>\r\n");
      out.write("						");

						}
						con.close();
						} catch (Exception e) {
						out.println("Error loading products.");
						}
						
      out.write("\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Price and Quantity Inputs -->\r\n");
      out.write("				<div class=\"form-group mb-3\">\r\n");
      out.write("					<label for=\"price\">Unit Price (with 12% margin):</label> <input\r\n");
      out.write("						type=\"number\" class=\"form-control\" id=\"price\" step=\"0.01\" readonly>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"form-group mb-3\">\r\n");
      out.write("					<label for=\"quantity\">Quantity:</label> <input type=\"number\"\r\n");
      out.write("						class=\"form-control\" id=\"quantity\">\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Add Product -->\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-success mb-3\"\r\n");
      out.write("					onclick=\"addProduct()\">Add Product</button>\r\n");
      out.write("\r\n");
      out.write("				<!-- Product Table -->\r\n");
      out.write("				<table class=\"table table-bordered\" id=\"productTable\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>Product</th>\r\n");
      out.write("							<th>Unit Price</th>\r\n");
      out.write("							<th>Quantity</th>\r\n");
      out.write("							<th>Subtotal</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody></tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("				<!-- Total -->\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<h5>\r\n");
      out.write("						Total: ₹ <span id=\"total\">0.00</span>\r\n");
      out.write("					</h5>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Submit -->\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">Submit Order</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			<div class=\"card\">\r\n");
      out.write("				<div class=\"card-body p-0\">\r\n");
      out.write("					<div class=\"table-responsive\">\r\n");
      out.write("						<table class=\"table customer-table mb-0\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>\r\n");
      out.write("										<div class=\"form-check\">\r\n");
      out.write("											<input class=\"form-check-input\" type=\"checkbox\"\r\n");
      out.write("												id=\"selectAll\"> <label class=\"form-check-label\"\r\n");
      out.write("												for=\"selectAll\"></label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</th>\r\n");
      out.write("									<th>id</th>\r\n");
      out.write("									<th>reatiler_id</th>\r\n");
      out.write("									<th>order_date</th>\r\n");
      out.write("									<th>total_amount</th>\r\n");
      out.write("									<th>Quntity of order</th>\r\n");
      out.write("\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody>\r\n");
      out.write("								");

								Connection conn = null;
								Statement stmt = null;
								ResultSet rs = null;

								String driverNm = "com.mysql.cj.jdbc.Driver";
								String url = "jdbc:mysql://localhost:3307/inventory";

								try {
									Class.forName(driverNm);
									conn = DriverManager.getConnection(url, "root", "");
									stmt = conn.createStatement();
									rs = stmt.executeQuery("SELECT o.*, IFNULL(q.total_quantity, 0) AS total_quantity " + "FROM orders o "
									+ "LEFT JOIN (" + "  SELECT order_id, SUM(quantity) AS total_quantity " + "  FROM order_items "
									+ "  GROUP BY order_id" + ") q ON o.id = q.order_id");

									while (rs.next()) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>\r\n");
      out.write("										<div class=\"form-check\">\r\n");
      out.write("											<input class=\"form-check-input\" type=\"checkbox\">\r\n");
      out.write("										</div>\r\n");
      out.write("									</td>\r\n");
      out.write("									<td>");
      out.print(rs.getString("id"));
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(rs.getString("retailer_id"));
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(rs.getString("order_date"));
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(rs.getInt("total_amount"));
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(rs.getInt("total_quantity"));
      out.write("</td>\r\n");
      out.write("									<td>\r\n");
      out.write("										<form action=\"deleteOrder.jsp\" method=\"post\"\r\n");
      out.write("											onsubmit=\"return confirm('Are you sure you want to delete this order?');\">\r\n");
      out.write("											<input type=\"hidden\" name=\"orderId\"\r\n");
      out.write("												value=\"");
      out.print(rs.getString("id"));
      out.write("\">\r\n");
      out.write("											<button type=\"submit\" class=\"btn btn-danger btn-sm\">Delete</button>\r\n");
      out.write("										</form>\r\n");
      out.write("									</td>\r\n");
      out.write("\r\n");
      out.write("								</tr>\r\n");
      out.write("								");

								}
								} catch (Exception e) {
								out.println("Error: " + e.getMessage());
								} finally {
								try {
								if (rs != null)
									rs.close();
								} catch (Exception e) {
								}
								try {
								if (stmt != null)
									stmt.close();
								} catch (Exception e) {
								}
								try {
								if (conn != null)
									conn.close();
								} catch (Exception e) {
								}
								}
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Bootstrap JS -->\r\n");
      out.write("		<script\r\n");
      out.write("			src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			// Wait for the DOM to be fully loaded\r\n");
      out.write("			document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("				// Sidebar toggle functionality\r\n");
      out.write("				const sidebarToggle = document.getElementById('sidebarToggle');\r\n");
      out.write("				const sidebar = document.getElementById('sidebar');\r\n");
      out.write("\r\n");
      out.write("				sidebarToggle.addEventListener('click', function() {\r\n");
      out.write("					sidebar.classList.toggle('collapsed');\r\n");
      out.write("				});\r\n");
      out.write("\r\n");
      out.write("				// Check if we're on mobile\r\n");
      out.write("				function checkMobile() {\r\n");
      out.write("					if (window.innerWidth < 768) {\r\n");
      out.write("						sidebar.classList.add('collapsed');\r\n");
      out.write("					} else {\r\n");
      out.write("						sidebar.classList.remove('collapsed');\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("				// Initial check\r\n");
      out.write("				checkMobile();\r\n");
      out.write("\r\n");
      out.write("				// Listen for window resize\r\n");
      out.write("				window.addEventListener('resize', checkMobile);\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("			// Set customer input from selected retailer's contact\r\n");
      out.write("			function setCustomerFromRetailer() {\r\n");
      out.write("				var retailerSelect = document.getElementById(\"retailer\");\r\n");
      out.write("				var selectedOption = retailerSelect.options[retailerSelect.selectedIndex];\r\n");
      out.write("				var contactName = selectedOption.getAttribute(\"data-contact\");\r\n");
      out.write("				document.getElementById(\"customer\").value = contactName;\r\n");
      out.write("			}\r\n");
      out.write("		 \r\n");
      out.write("			document.getElementById('product').addEventListener('change', function () {\r\n");
      out.write("				const selectedOption = this.options[this.selectedIndex];\r\n");
      out.write("				const basePrice = parseFloat(selectedOption.getAttribute('data-price'));\r\n");
      out.write("				const stockSize = parseInt(selectedOption.getAttribute('data-stock'));\r\n");
      out.write("\r\n");
      out.write("				if (!isNaN(basePrice) && !isNaN(stockSize) && stockSize > 0) {\r\n");
      out.write("					const totalWithMargin = basePrice + (basePrice * 0.12); // add 12% margin\r\n");
      out.write("					const unitPrice = totalWithMargin / stockSize; // divide by quantity_in_stock\r\n");
      out.write("					const roundedPrice = Math.round(unitPrice); // round to nearest whole number\r\n");
      out.write("					document.getElementById('price').value = roundedPrice;\r\n");
      out.write("				} else {\r\n");
      out.write("					document.getElementById('price').value = '';\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("			let totalAmount = 0;\r\n");
      out.write("\r\n");
      out.write("			function addProduct() {\r\n");
      out.write("				const productDropdown = document.getElementById(\"product\");\r\n");
      out.write("				const selectedOption = productDropdown.options[productDropdown.selectedIndex];\r\n");
      out.write("				const productName = selectedOption.text;\r\n");
      out.write("				const productId = selectedOption.value;\r\n");
      out.write("\r\n");
      out.write("				const priceInput = document.getElementById(\"price\");\r\n");
      out.write("				const quantityInput = document.getElementById(\"quantity\");\r\n");
      out.write("\r\n");
      out.write("				const price = parseFloat(priceInput.value);\r\n");
      out.write("				const quantity = parseInt(quantityInput.value);\r\n");
      out.write("\r\n");
      out.write("				if (!price || !quantity || price <= 0 || quantity <= 0) {\r\n");
      out.write("					alert(\"Please enter valid price and quantity\");\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("				const subtotal = price * quantity;\r\n");
      out.write("				totalAmount += subtotal;\r\n");
      out.write("\r\n");
      out.write("				// Add row to table\r\n");
      out.write("				const tableBody = document.getElementById(\"productTable\")\r\n");
      out.write("						.getElementsByTagName(\"tbody\")[0];\r\n");
      out.write("				const newRow = tableBody.insertRow();\r\n");
      out.write("\r\n");
      out.write("				newRow.insertCell(0).innerText = productName;\r\n");
      out.write("				newRow.insertCell(1).innerText = price.toFixed(2);\r\n");
      out.write("				newRow.insertCell(2).innerText = quantity;\r\n");
      out.write("				newRow.insertCell(3).innerText = subtotal.toFixed(2);\r\n");
      out.write("\r\n");
      out.write("				// Add a remove button\r\n");
      out.write("				const actionCell = newRow.insertCell(4);\r\n");
      out.write("				const removeBtn = document.createElement(\"button\");\r\n");
      out.write("				removeBtn.type = \"button\";\r\n");
      out.write("				removeBtn.className = \"btn btn-danger btn-sm\";\r\n");
      out.write("				removeBtn.innerText = \"Remove\";\r\n");
      out.write("\r\n");
      out.write("				// Append hidden inputs to form for submission\r\n");
      out.write("				const form = document.getElementById(\"orderForm\");\r\n");
      out.write("\r\n");
      out.write("				const hiddenProductId = document.createElement(\"input\");\r\n");
      out.write("				hiddenProductId.type = \"hidden\";\r\n");
      out.write("				hiddenProductId.name = \"productId[]\";\r\n");
      out.write("				hiddenProductId.value = productId;\r\n");
      out.write("				form.appendChild(hiddenProductId);\r\n");
      out.write("\r\n");
      out.write("				const hiddenUnitPrice = document.createElement(\"input\");\r\n");
      out.write("				hiddenUnitPrice.type = \"hidden\";\r\n");
      out.write("				hiddenUnitPrice.name = \"unitPrice[]\";\r\n");
      out.write("				hiddenUnitPrice.value = price.toFixed(2);\r\n");
      out.write("				form.appendChild(hiddenUnitPrice);\r\n");
      out.write("\r\n");
      out.write("				const hiddenQuantity = document.createElement(\"input\");\r\n");
      out.write("				hiddenQuantity.type = \"hidden\";\r\n");
      out.write("				hiddenQuantity.name = \"quantity[]\";\r\n");
      out.write("				hiddenQuantity.value = quantity;\r\n");
      out.write("				form.appendChild(hiddenQuantity);\r\n");
      out.write("\r\n");
      out.write("				const hiddenSubtotal = document.createElement(\"input\");\r\n");
      out.write("				hiddenSubtotal.type = \"hidden\";\r\n");
      out.write("				hiddenSubtotal.name = \"subtotal[]\";\r\n");
      out.write("				hiddenSubtotal.value = subtotal.toFixed(2);\r\n");
      out.write("				form.appendChild(hiddenSubtotal);\r\n");
      out.write("\r\n");
      out.write("				removeBtn.onclick = function() {\r\n");
      out.write("					totalAmount -= subtotal;\r\n");
      out.write("					document.getElementById(\"total\").innerText = totalAmount\r\n");
      out.write("							.toFixed(2);\r\n");
      out.write("					newRow.remove();\r\n");
      out.write("					// Remove corresponding hidden inputs\r\n");
      out.write("					form.removeChild(hiddenProductId);\r\n");
      out.write("					form.removeChild(hiddenUnitPrice);\r\n");
      out.write("					form.removeChild(hiddenQuantity);\r\n");
      out.write("					form.removeChild(hiddenSubtotal);\r\n");
      out.write("				};\r\n");
      out.write("\r\n");
      out.write("				actionCell.appendChild(removeBtn);\r\n");
      out.write("\r\n");
      out.write("				// Update total amount display\r\n");
      out.write("				document.getElementById(\"total\").innerText = totalAmount\r\n");
      out.write("						.toFixed(2);\r\n");
      out.write("\r\n");
      out.write("				// Clear inputs\r\n");
      out.write("				priceInput.value = \"\";\r\n");
      out.write("				quantityInput.value = \"\";\r\n");
      out.write("			}\r\n");
      out.write("		</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
