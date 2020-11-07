<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Tracker</title>
</head>
<body>
	<h4>Customer List</h4>
	<input type="button"
		onclick="window.location.href='addForm'; return false;" value="Add" /><br/><br/>
	<form:form action="search" method="POST">
        Search customer: <input type="text" name="searchName" />

		<input type="submit" value="Search" />
	</form:form>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customer" items="${customers}">
				<c:url var="updateLink" value="/customer/updateForm">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				<tr>
					<td>${customer.id }</td>
					<td>${customer.firstName }</td>
					<td>${customer.lastName }</td>
					<td>${customer.email }</td>
					<td><a href="${updateLink}">Update</a></td>
					<td><a href="${deleteLink}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>