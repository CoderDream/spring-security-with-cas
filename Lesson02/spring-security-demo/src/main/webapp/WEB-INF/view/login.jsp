<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>登录</title></head>
<body>
欢迎登录！
<form name='f' action='/login' method='POST'>
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td colspan='2'>
                <div>
                    ${msg}
                </div>
                <input name="submit" type="submit" value="Login"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
