<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/4
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加账户信息表单</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}" method="4">
        账户名称:<input type="text" name="name">
        账户金额:<input type="text" name="money">
        <input type="submit" value="保存">
    </form>


</body>
</html>
