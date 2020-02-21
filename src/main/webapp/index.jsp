<%--
  Created by IntelliJ IDEA.
  User: Love
  Date: 10.02.2020
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<h2 align="center">Welcome to my Index page of the first exercise PreProject number one :)</h2>
<h2 align="center">From this page you have direct access to <a href="${pageContext.request.contextPath}/list">List of users</a> </h2>
<h2 align="center">or if you want you can create and add <a href="${pageContext.request.contextPath}/add">a new user</a> to our database of users.</h2>
<h2 align="center">Thank you for your attention!</h2>

</body>
</html>