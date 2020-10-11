<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	<h4>Student Confirmation</h4>
	Student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Language: ${student.favoriteLanguage}
	<br>
	<br> Known Languages:
	<ul>
		<c:forEach var="lang" items="${student.knownLanguages}">
			<li>${lang}</li>
		</c:forEach>
	</ul>
</body>
</html>