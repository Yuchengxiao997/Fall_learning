<%--
  Created by IntelliJ IDEA.
  User: gambit
  Date: 2024/9/16
  Time: 下午9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="check.jsp">

    <%
        String user = "a";
        String pass = "b";
        if(request.getParameter("user")!=null && request.getParameter("pass") != null)
        {
            user = request.getParameter("user");
            session.setAttribute("user",user);
            pass = request.getParameter("pass");
            session.setAttribute("pass",pass);
        }

    %>
    <h2>恭喜您注册成功！</h2><br>
    您的用户名是：<%=user%> <br>
    您的密码是：<%=pass%>
</form>
<a href="login.jsp">返回登录界面</a>
</body>
</html>


