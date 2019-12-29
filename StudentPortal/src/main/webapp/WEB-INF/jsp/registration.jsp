<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>Registration Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<link href="/css/style2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
function success(){
	alert("You have successfully Registered");
}
</script>
</head>
<body style= "background-image: url(images/download.jpg)!important; background-size:cover;">
	
	<div class="signup-form">
    <form action="login" method="post" style="background: rgba(0, 0, 0, 0.71);">
		<h2 style="color: antiquewhite">Register</h2>
		<p class="hint-text" style="color: antiquewhite">Create your account.</p>
        <div class="form-group">
			<div class="row">
				<div class="col-xs-6"><input type="text" class="form-control" name="first_name" placeholder="First Name" required="required"></div>
				<div class="col-xs-6"><input type="text" class="form-control" name="last_name" placeholder="Last Name" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="email" class="form-control" name="email" placeholder="Email" required="required">
        </div>
        <div class="form-group">
        	<input type="text" class="form-control" name="phone" placeholder="Phone" required="required">
        </div>
        <div class="form-group">
        	<input type="text" class="form-control" name="ccat_form_number" placeholder="CCAT Form Number" required="required">
        </div>
        
        
		<div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password" required="required">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="cpassword" placeholder="Confirm Password" required="required">
        </div>        
        
		<div class="form-group">
            <button onClick="success();" type="submit" class="btn btn-success btn-lg btn-block">Register Now</button>
        </div>
    </form>
	<div class="text-center">Already have an account? <a href="alogin">Sign in</a></div>
</div>
	
</body>
</html>