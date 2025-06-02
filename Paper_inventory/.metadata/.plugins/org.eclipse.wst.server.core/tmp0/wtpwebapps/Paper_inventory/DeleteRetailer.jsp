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
	<%@ page import="java.sql.*"%>
	<%
    String[] selectedIds = request.getParameterValues("selectedIds");
    if (selectedIds != null) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventory", "root", "");
            for (String id : selectedIds) {
                PreparedStatement ps = con.prepareStatement("DELETE FROM retailers WHERE id=?");
                ps.setString(1, id);
                ps.executeUpdate();
            }
            con.close();
            response.sendRedirect("Retailer.jsp?status=success");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    } else {
        response.sendRedirect("Retailer.jsp?status=noneSelected");
    }
%>

</body>
</html>