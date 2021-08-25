<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/save_user" method="post">
    <div>
        <label>User name:</label>
        <input type="text" name="username">
    </div>
    <div>
        <label>password:</label>
        <input type="password" name="password">
    </div>
    <div>
        <label>First Name:</label>
        <input type="text" name="fname">
    </div>
    <div>
        <label>Last Name: </label>
        <input type="text" name="lname">
    </div>
    <div>
        <label>Phone:</label>
        <input type="text" name="phone">
    </div>
    <div>
        <label>Email: </label>
        <input type="text" name="email">
    </div>
    
    <div><input type="submit" value="Submit"></div>
</form>
</body>
</html>