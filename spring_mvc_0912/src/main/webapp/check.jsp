<%--
  Created by IntelliJ IDEA.
  User: gambit
  Date: 2024/9/16
  Time: 下午9:58
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: 小熊
  Date: 2022/3/24
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="">
    <%
        String user=(String)session.getAttribute("user");
        String pass=(String)session.getAttribute("pass");
        String name=request.getParameter("user");
        session.setAttribute("name", name);
        String password1=request.getParameter("pass");
        session.setAttribute("password", password1);
        if(user.equals(name)&&password1.equals(pass))
        { response.sendRedirect("loginsuccess.jsp");}
        else
            response.sendRedirect("loginfail.jsp");
    %>
</form>
</body>
</html>


