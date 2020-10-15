<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Customer Confirmation</title>
</head>
<body>
	<h4>Customer Confirmation</h4>
	Customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br />
	<br /> Free Passes: ${customer.freePasses}
	<br />
	<br /> Postal Code: ${customer.postalCode}
	<br />
	<br /> Course Code: ${customer.courseCode}
</body>
</html>