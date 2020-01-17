<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
    	<title>Log In</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
    </head>
   <body style="background-image: url('images/1.jpeg');opacity:0.75">
    
   <div>
  <div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
							
								<h1><font style="font-family:inherit;color: red;"><center>Log In</center> </font></h1>
								<h3  style="color:red;"><center>${msg}
  ${msg2}  ${msg3}</center></h3>
						</div>

				<form role="form" action="adminLanding" method="post" >	
				<div class="modal-body">
					<div class="table-responsive">			
						<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed">
								<tr>
									<th><legend>User Name</legend></th>
									<td><input type="text" name="uId" required/></td>
									</tr>
									
								<tr>
									<th><legend>Password</legend></th>
									<td><input type="password" name="uPassword" required/></td>
									</tr>	
							</table>
						</div>
					</div>
				<center><button class="btn btn-success">Log In</button></center>
				
				<div class="modal-footer">
					<a href="aRegistration"><button  type="button"  class="btn btn-warning" data-dismiss="modal">Sign Up!</button></a>
					<a href="alogin"><button  type="button" class="btn btn-danger" data-dismiss="modal">Forget Password?</button></a>
					</div>
				</div>
			</div>
		</form>
		</div>