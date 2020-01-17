<html>
	<head>
    	<title>Search Here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
    </head>
   <body style="background-image: url('images/1.jpeg');opacity:0.80">
   
  <div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h1 style="text-align:center"><font style="font-family:inherit;color: maroon;">Students Information<center></center> </font></h1>
						</div>	
							<div class="modal-body">
							<form action="admin" method="post">
								<center><input type="text" name="formNo">
								<center><h3  style="color:red;">${msg}</h3></center>
								<a href="admin"><button class="btn btn-success glyphicon glyphicon-search">Search</button></a>
								</form>
								<form action="see_All_generated_IdCards" method="post">
								<br><br><a href="see_All_generated_IdCards"><button  type="button"  class="btn btn-info">Click to See All Auto-genrated ID Cards</button></a>
								</form>
								<form action="see_All_Students" method="post">
								<a href="see_All_Students"><button  type="submit" class="btn btn-warning">Click to See All Registered Students</button></a></center>
								</form>
							</div>
					</div>
					</div>
	</form>
${msg}
</body>
</html>