<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Customer Tracker</title>
</head>
<body>
	<h4>Update Customer</h4>
	<form:form action="saveCustomer" modelAttribute="customer"
		method="POST">
		<!-- Need to associate this data with customer id -->
		<form:hidden path="id" />
		
		First Name: <form:input path="firstName" />
		<br />
		<br />
		Last Name: <form:input path="lastName" />
		<br />
		<br />
		Email: <form:input path="email" />
		<br />
		<br />
		<input type="submit" value="Submit" />
	</form:form>
	<a href="${pageContext.request.contextPath}/customer/list">Back</a>
</body>
</html>