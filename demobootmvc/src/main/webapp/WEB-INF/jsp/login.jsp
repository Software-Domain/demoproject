<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<i><font color="red"> ${errorMsg}</font></i> 
	<form action="login" method="post">
		Name <input type="text" name="userid"><br> 
		Password <input	type="password" name="pass"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>