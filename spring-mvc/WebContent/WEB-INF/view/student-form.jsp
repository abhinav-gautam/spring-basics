<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h4>Student Form</h4>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br />
		<br />
		Last Name: <form:input path="lastName" />
		<br />
		<br />
		Country: <form:select path="country">
			<form:options items="${student.countries}" />
		</form:select>
		<br />
		<br />
		Favorite Language:
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		Go <form:radiobutton path="favoriteLanguage" value="Go" />
		Java <form:radiobutton path="favoriteLanguage" value="Java" /> 
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />
		<br />
		<br />
		Known Language:
		Python <form:checkbox path="knownLanguages" value="Python" />
		Go <form:checkbox path="knownLanguages" value="Go" />
		Java <form:checkbox path="knownLanguages" value="Java" /> 
		C++ <form:checkbox path="knownLanguages" value="C++" />
		<br />
		<br />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>