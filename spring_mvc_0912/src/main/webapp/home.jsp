<%--
  Created by IntelliJ IDEA.
  User: gambit
  Date: 2024/9/16
  Time: 下午4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>Login Page</h2>
<%
    String errorMessage = null;
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "password".equals(password)) {
            response.sendRedirect("welcome.jsp"); // Redirect to welcome page
        } else {
            errorMessage = "Invalid username or password";
        }
    }
%>
<% if (errorMessage != null) { %>
<p style="color:red"><%= errorMessage %></p>
<% } %>
<form method="post" action="home.jsp">
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
