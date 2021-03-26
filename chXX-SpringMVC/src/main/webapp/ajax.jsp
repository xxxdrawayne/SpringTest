<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/12/18
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
    <script>
        var userList=new Array();
        userList.push({name:"zhangsan",age:19});
        userList.push({name:"lisi",age:23});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick14",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8 "
        })
    </script>
</head>
<body>

</body>
</html>
