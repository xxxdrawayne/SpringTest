<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/12/20
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>展示账户数据列表</h1>
    <table border="1">

        <tr>
            <th>账户id</th>
            <th>账户名称</th>
            <th>账户金额</th>
        </tr>

        <c:forEach items="${accountList}" var="account">
            <tr>
                <th>${account.id}</th>
                <th>${account.name}</th>
                <th>${account.money}</th>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
