<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
    	<title>All Students</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
    </head>
   <body style="background-image: url('images/1.jpeg');opacity:0.75">
   <div >
  <div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h1><font style="font-family:inherit;color: maroon;"><center>All Students</center> </font></h1>
                                <h1>${msg }</h1>
<a href="addStudents"><button class="btn btn-danger">add</button></a>
<a href="deleteStudents"><button class="btn btn-danger">delete</button></a>

						</div>

				<form role="form" action="">	
				<div class="modal-body">
					<div class="table-responsive">			
						<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed">
								<tr>
									<th><legend>Course</legend></th>
									<td><input type="radio" name="course"/>DAC</td>
									<td><input type="radio" name="course"/>Ditiss</td>
									</tr>
									
								<tr>
									<th><legend>Batch</legend></th>
									<td><input type="radio" name="batch"/>February</td>
									<td><input type="radio" name="batch"/>August</td>
									</tr>	
									
								<tr>
									<th colspan="2"><legend>Year</legend></th>
									<td><input type="text" name=""/></td>
								</tr>
							</table>
							<h3><ol><c:forEach items="${sDetailsSaved}" var="sds">
	<li>
		${sds.name}
	</li>
	
	
        </c:forEach></h3>
						</div>
					</div>
				</div>
			</div>
		</form>
		
		
		
		
		</div>
		</body>
		</html>