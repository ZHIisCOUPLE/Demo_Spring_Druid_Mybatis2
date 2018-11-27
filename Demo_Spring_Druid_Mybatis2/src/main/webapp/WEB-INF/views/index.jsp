<%--
  Created by IntelliJ IDEA.
  User: zcy
  Date: 2018/10/14
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    用户名：<input type="text" name="userName"/><br/>
    密码：<input type="password" name="password" /><br/>

    <input type="submit" value="登陆" />
</form>
${user}
</body>
</html>
