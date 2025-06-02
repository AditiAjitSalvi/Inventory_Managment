<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Information</title>
</head>
<body>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    if (email != null && password != null) {
        if (email.equals("aditi@salvi") && password.equals("1234")) {
            RequestDispatcher requ = request.getRequestDispatcher("Home.jsp");
            requ.forward(request, response);
        } else {
%>
            <script>
                alert("Login Failed! Invalid email or password.");
                window.location.href = "Login.html"; 
            </script>
<%
        }
    }
    else {
%>
 <script>
        alert("Login Failed! Invalid email or password.");
        window.location.href = "Login.html"; 
 </script>
 <%} %>
</body>
</html>
