<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/12/16
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick13" method="post">
        <br/>
        <input type="text" name="userList[0].name"><br/>
        <input type="text" name="userList[0].age"><br/>
        <input type="text" name="userList[1].name"><br/>
        <input type="text" name="userList[1].age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
