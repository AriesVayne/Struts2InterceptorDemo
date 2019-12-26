<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login.jsp</title>
</head>
<body>

<h2>用户登录</h2>
${loginError}
<form action="Login.action" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="登录">

</form>


</body>
</html>
