<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<form action="admin" method="post">

<div class="menu" style="margin-left: 500px; margin-top: 250px">
     <input type="text" name="formNo" class="text" placeholder="Enter ccat form no.">
     <a href="admin"><button class="btn btn-danger">Search</button></a>
     
  </div>
</form>
	${msg}
	
<form action="see_All_generated_IdCards" method="post">
	<a href=see_All_generated_IdCards><button class="btn btn-danger">Click to see All auto-generated IdCards</button></a>
</form>
<br/>	
<form action="see_All_Students" method="post">
	<a href=see_All_Students><button class="btn btn-danger">Click here see All registered Students</button></a>
</form>
</body>
</html>