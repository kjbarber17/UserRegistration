<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users</title>
</head>
<body>
<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Name</td>
				<td>${item.name}</td>
			</tr>
			<tr>
				<td>Last name</td>
				<td>${item.lastname}</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>${item.password}</td>
			</tr>
			<tr>
				<td>Detail</td>
				<td>${item.detail}</td>
			</tr>
			<tr>
				<td>Birth Month</td>
				<td>${item.birthMonth}</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${item.gender}</td>
			</tr>
			<tr>
				<td>Country</td>
				<td>${item.country}</td>
			</tr>
			<tr>
				<td>Non-Smoking</td>
				<td>${item.nonSmoking}</td>
			</tr>

		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="form.mvc">Add a new user</a>

</body>
</html>