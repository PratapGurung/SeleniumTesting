<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
	<h1>All User</h1>
	<div>
		<c:if test="${not empty users}">
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>User name</th>
						<th>password</th>
						<th>Phone</th>
						<th>email</th>
					
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${users}" var="u">
						<tr>
							<th>${u.id}</th>
							<th>${u.fname}</th>
							<th>${u.lname}</th>
							<th>${u.username}</th>
							<th>${u.password}</th>
							<th>${u.phone}</th>
							<th>${u.email}</th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>