<%--
  Created by IntelliJ IDEA.
  User: gambit
  Date: 2024/9/16
  Time: 下午9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登入界面</title>
</head>
<body>
<h1>登录界面</h1>
<form method="post" action="check.jsp">
    <input type="text" name="user"><br>
    <input type="password" name="pass"><br>
    <button type="submit" value="login">登入</button>
    <a href="register.jsp">注册</a>
</form>
</body>
</html>


