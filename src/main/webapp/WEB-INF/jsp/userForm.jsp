<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
    	<title>Personal Details ${username} !</title>
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
								<h1><font style="font-family:inherit;color: maroon;"><center>Personal Details</center> </font></h1>
						</div>

				<form role="form" action="detailsSaved" method="post">	
				<div class="modal-body">
					<div class="table-responsive">			
						<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed">
								<tr>
									<th colspan="2"><legend>Name</legend></th>
									<td><input type="text" name="name"  required / ></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Course Name</legend></th>
									<td><select name="course">
										<option value="" name="adm_course" required>--Select--</option>
										<option value="PG-DAC"/>PG-DAC</option>
										<option value="PG-DITISS"/>PG-DITISS</option></td>
									</tr>
								<tr>
									<th colspan="2"><legend>C-CAT Form No.</legend></th>
									<td><input type="text" name="formNo" required/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Date Of Birth</legend></th>
									<td><input type="Date" name="dob" required/></td>
									</tr>	


								<tr>
									<th colspan="2"><legend>Email</legend></th>
									<td><input type="email" name="email" required/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Contact No.</legend></th>
									<td><input type="text" name="phone" required/></td>
									</tr>
									
									
								<tr>
									<th colspan="2"><legend>Gender</legend></th>
									<td><select name="gender" required>
										<option value="">--Select--</option>
										<option value="Male"/>Male</option>
										<option value="Female"/>Female</option></td></select>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Blood Group</legend></th>
									<td><input type="text" name="blood_gp" required / ></td>
									</tr>


								<tr>
									<th colspan="2"><legend>Father's Name</legend></th>
									<td><input type="text" name="fName" required/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Father's Contact No.</legend></th>
									<td><input type="text" name="fMobile" required/></td>
									</tr>



								<tr>
									<th colspan="2"><legend>Mother's Name</legend></th>
									<td><input type="text" name="mName" required/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Mother's Contact No.</legend></th>
									<td><input type="text" name="mMobile" required/></td>
									</tr>



								<tr>
									<th colspan="2"><legend> Current Address</legend></th>
									<td><input type="textarea" name="cAddress" required/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Permanent Address</legend></th>
									<td><input type="textarea" name="pAddress" required/></td>
									</tr>	
							</table>
						</div>
					</div>
					
				<br><br><br>
				
				<div >
  
						<div class="modal-content">
							<div class="modal-header">
								<h1><font style="font-family:inherit;color: maroon;"><center>Educational Qualifications</center> </font></h1>
						</div>
</div>
					</div>
			
		
				<div class="modal-body">
					<div class="table-responsive">			
						<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed">
								<tr>
									<th><legend>Qualifications</legend></th>
									<th><legend>Degree/PG</legend></th>
									<th><legend>Branch</legend></th>
									<th><legend>Year Of Passing</legend></th>
									<th><legend>University</legend></th>
									<th><legend>%Marks</legend></th>
									</tr>
									
								<tr>
									<th><legend>SSC</legend></th>
									<td>N.A.</td>
									<td>N.A.</td>
									<td><input type="text" name="ssc_year_of_passing" required/></td>
									<td><input type="text" name="ssc_university" required/></td>
									<td><input type="text" name="ssc_marks" required/></td>
									</tr>	
									
									
								<tr>
									<th><legend>HSC</legend></th>
									<td>N.A.</td>
									<td>N.A.</td>
									<td><input type="text" name="hsc_year_of_passing" required/></td>
									<td><input type="text" name="hsc_university" required/></td>
									<td><input type="text" name="hsc_marks" required/></td>
									</tr>
									
								<tr>
									<th><legend>Diploma</legend></th>
									<td>N.A.</td>
									<td><input type="text" name="dip_branch" value="0"/></td>
									<td><input type="text" name="dip_year_of_passing" value="0"/></td>
									<td><input type="text" name="dip_university" value="0"/></td>
									<td><input type="text" name="dip_marks" value="0"/></td>
									</tr>
									
								<tr>
									<th><legend>Graduation</legend></th>
									<td><input type="text" name="deg_name" required/></td>
									<td><input type="text" name="deg_branch" required/></td>
									<td><input type="text" name="deg_year_of_passing" required/></td>
									<td><input type="text" name="deg_university" required/></td>
									<td><input type="text" name="deg_marks" required/></td>
									</tr>
									
								<tr>
									<th><legend>Post Graduation</legend></th>
									<td><input type="text" name="pgdeg_name" value="0"/></td>
									<td><input type="text" name="pgdeg_branch" value="0"/></td>
									<td><input type="text" name="pgdeg_year_of_passing" value="0"/></td>
									<td><input type="text" name="pgdeg_university" value="0"/></td>
									<td><input type="text" name="pgdeg_marks" value="0"/></td>
									</tr>
							</table>
						
				
				
				</div>
			</div>
				
				
				<center><button type="submit" class="btn btn-info">Save & Next</button></center>
				
				<div class="modal-footer">
					<a href=""><button  type="reset" class="btn btn-danger">Reset</button></a>
					</div>
				</div>
			</div>
		</form>
		</div>
		</body>
		</html>