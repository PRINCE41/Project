<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All students</title>
</head>
<body>

<form action="" method="post">
<table border="2">

<tr>
	<td>Course</td>
	<td><input type="radio" name="course" value="dac">Dac</td>
	<td><input type="radio" name="course" value="Ditiss">Ditiss</td>
</tr>

<tr>

	<td>Batch</td>
	<td><input type="radio" name="batch" value="Aug">August</td>
	<td><input type="radio" name="batch" value="Feb">Feb</td>
</tr>


<tr>
	<td>Year</td>
	<td colspan="2"><input type="text" name="year"></td>
	
</tr>




</table>

</form>

<form action="" method="post">
	<ol><c:forEach items="${sDetailsSaved}" var="sds">
	<li>
		${sds.name}
	</li>
	</c:forEach>
	</ul>
</form>



</body>
</html>