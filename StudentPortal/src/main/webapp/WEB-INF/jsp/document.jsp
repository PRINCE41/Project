<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Document Uploads</title>
</head>
<body>
<h2 style="color:green;">${msg} ${finalMsg} </h2>
<form action="documentUpload" method="post" enctype="multipart/form-data">

<div>Enter CCAT Form No:<input type="text" name="formNo" value="${form}"></div>
<br>
<div>Signature:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" name="signature"></div>
<br>  
<div>Photo    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" name="image"></div>
<br>
<a href="documentUpload"><button type="submit" value="submit">Submit</button></a>
<a href="destroy"><button type="button" value="exit">Exit</button></a>
</form>


</body>
</html>