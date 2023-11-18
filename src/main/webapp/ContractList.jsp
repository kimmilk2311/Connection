<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<script>
function validatePassword(){
	var password = document.getElementById("pwb")
	var passwordPattern = /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d).{8,}$/;
	
	if (!passwordPattern.test(password)) {
        document.getElementById("password-error").innerHTML = "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.";
        return false;
    }
    return true;
}
</script>
</head>
<body>
<form action="Conform.jsp" method="get" onsubmit="return validatePassword();">
<label for="username">Username:</label><br>
<input type="text" id="username" name="username" required><br>
<label for="pwd">Password:</label><br>
<input type="password" id="pwd" name="pwd">
<span id="password-error" style="color:red;"></span><br>
<br>
<button type="submit">Sign up</button>
</form>
</body>
</html>