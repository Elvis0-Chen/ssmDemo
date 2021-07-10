<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/9
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>用户信息</h3>
    <table>
        <tr>
            <td>序号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>生日</td>
            <td>地址</td>
        </tr>
        <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.sex}</td>
            <td>${user.birthday}</td>
            <td>${user.address}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
