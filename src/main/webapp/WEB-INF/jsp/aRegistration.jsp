<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
    	<title>Sign Up</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script type="text/javascript">
</script>
	</head>
	<body style="background-image: url('images/1.jpeg');opacity:0.80">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1><font style="font-family:inherit;color: seagreen;"><center>Sign Up</center></font></h1>
				</div>
			<form role="form" method="post" action="aloggedin">	
				<div class="modal-body">
					<div class="table-responsive" >			
						<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed" >


								<tr>
									<th><legend>First Name</legend></th>
									<td><input type="text" name="first_name" required/></td>
									</tr>

								<tr>
										<th><legend>Last Name</legend></th>
										<td><input type="text" name="last_name" required/></td>
									</tr>

								<tr>
										<th><legend>Phone No.</legend></th>
										<td><input type="text" name="phone" required/></td>
									</tr>

								<tr>
										<th><legend>C-CAT Form No.</legend></th>
										<td><input type="text" name="ccat_form_number" required/></td>
									</tr>

								<tr>
									<th><legend>Email</legend></th>
									<td><input type="text" name="email" required/></td>
									</tr>
									
								<tr>
									<th><legend>User Name</legend></th>
									<td><input type="text" name="uname" required/></td>
								</tr>
								
								
									
									
								<tr>
									<th><legend>Password</legend></th>
									<td><input type="password" name="password" required/></td>
									</tr>	
								<tr>
										<th><legend>Confirm Password</legend></th>
										<td><input type="password" name="cpassword" required/></td>
									</tr>
							</table>
						</div>
					</div>
				<center><button type="submit" class="btn btn-info">Sign Up</button></center>
				<div class="modal-footer">
					<a href="alogin"><button  type="button"  class="btn btn-success">Back<<</button></a>
					<a href="/"><button  type="button" class="btn btn-danger">Close</button></a>	
					</div>
				</div>
			</div>
		</form>
		</div>
		</div>
		</div>
		</body>
		</html>