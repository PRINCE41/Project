<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/allids.css">
<meta charset="ISO-8859-1">
<title>All id cads are here</title>

</head>
<body>
	<c:forEach items="${sDetailsSaved}" var="sds">
	<div class="id-card-holder">
		<div class="id-card">
		
			<p><strong>"Ministry of electronics & Information Technology, Govt. of India"</strong></p>
				<p># 68, Electronic City, Bengaluru -560 100, India</p>
				<p>Ph: +91-80-28523300 | Fax; +91-80-28522590</p>
				<hr>
	
			<div class="header">
				CENTRE FOR DEVELOPMENT OF ADVANCED COMPUTING
			</div>
			<div class="photo">
				<img src="">
			</div>
			<h2>Student Name : <b>${sds.name}</b></h2>
			<h2>Student ID No. : ${sds.prnNo}</h2>
			<h2>Valid upto : --- </h2>			
			<h6 style="text-align:left"><small>Authority Signature ----</small></h6>
			
		</div>
	</div>
</c:forEach>




</body>
</html>