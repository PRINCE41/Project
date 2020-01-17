<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
    	<title>Details</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
    </head>
   <body style="background-image: url('images/1.jpeg');opacity:0.80">
   <div >
  
						<div class="modal-content">
							<div class="modal-header">
								<h1><font style="font-family:inherit;color: maroon;"><center>Details of ${stuDetails.name}</center> </font></h1>
						</div>

				<form role="form" action="">	
				<div class="modal-body">
					<div class="table-responsive">			
							<table border="2" align="center" class="table table-hover table-bordered table-striped table-condensed">
																<tr>
									<th colspan="2"><legend>Name</legend></th>
									<td><input type="text" name="name" value="${stuDetails.name}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Course Name</legend></th>
									<td>
										<input type="text" value="${stuDetails.adm_course}">
										
									</tr>
								<tr>
									<th colspan="2"><legend>C-CAT Form No.</legend></th>
									<td><input type="text" name="cfno" value="${stuDetails.formNo}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Date Of Birth</legend></th>
									<td><input type="Date" name="dob" value="${stuDetails.dob}"/></td>
									</tr>	


								<tr>
									<th colspan="2"><legend>Email</legend></th>
									<td><input type="email" name="email" value="${stuDetails.email}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Contact No.</legend></th>
									<td><input type="text" name="cno" value="${stuDetails.phone}"/></td>
									</tr>
									
									
								<tr>
									<th colspan="2"><legend>Gender</legend></th>
									<td>
							
										<input type="text" value="${stuDetails.gender}"/>
										</td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Blood Group</legend></th>
									<td><input type="text" name="bg" value="${stuDetails.blood_gp}"/></td>
									</tr>


								<tr>
									<th colspan="2"><legend>Father's Name</legend></th>
									<td><input type="text" name="fname" value="${stuDetails.fName}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Father's Contact No.</legend></th>
									<td><input type="text" name="fno" value="${stuDetails.fMobile}"/></td>
									</tr>



								<tr>
									<th colspan="2"><legend>Mother's Name</legend></th>
									<td><input type="text" name="mname" value="${stuDetails.mName}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Mother's Contact No.</legend></th>
									<td><input type="text" name="mno" value="${stuDetails.mMobile}"/></td>
									</tr>



								<tr>
									<th colspan="2"><legend> Current Address</legend></th>
									<td><input type="textarea" name="name" value="${stuDetails.cAddress}"/></td>
									</tr>
									
								<tr>
									<th colspan="2"><legend>Permanent Address</legend></th>
									<td><input type="textarea" name="padd" value="${stuDetails.pAddress}"/></td>
									</tr>

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
									<td><input type="text" name="" value="${stuDetails.ssc_year_of_passing}"/ ></td>
									<td><input type="text" name="" value="${stuDetails.ssc_university}"/></td>
									<td><input type="text" name="" value="${stuDetails.ssc_marks}"/></td>
									</tr>	
									
									
								<tr>
									<th><legend>HSC</legend></th>
									<td>N.A.</td>
									<td>N.A.</td>
									<td><input type="text" name="" value="${stuDetails.hsc_year_of_passing}"/></td>
									<td><input type="text" name="" value="${stuDetails.hsc_university}"/></td>
									<td><input type="text" name="" value="${stuDetails.hsc_marks}"/></td>
									</tr>
									
								<tr>
									<th><legend>Diploma</legend></th>
									<td>N.A.</td>
									<td><input type="text" name="" value="${stuDetails.dip_branch}"/></td>
									<td><input type="text" name="" value="${stuDetails.dip_year_of_passing}"/></td>
									<td><input type="text" name="" value="${stuDetails.dip_university}"/></td>
									<td><input type="text" name="" value="${stuDetails.dip_marks}"/></td>
									</tr>
									
								<tr>
									<th><legend>Graduation</legend></th>
									<td><input type="text" name="" value="${stuDetails.deg_name}"/></td>
									<td><input type="text" name="" value="${stuDetails.deg_branch}"/></td>
									<td><input type="text" name="" value="${stuDetails.deg_year_of_passing}"/></td>
									<td><input type="text" name="" value="${stuDetails.deg_university}"/></td>
									<td><input type="text" name="" value="${stuDetails.deg_marks}"/></td>
									</tr>
									
								<tr>
									<th><legend>Post Graduation</legend></th>
									<td><input type="text" name="" value="${stuDetails.pgdeg_name}"/></td>
									<td><input type="text" name="" value="${stuDetails.pgdeg_branch}"/></td>
									<td><input type="text" name="" value="${stuDetails.pgdeg_year_of_passing }"/></td>
									<td><input type="text" name="" value="${stuDetails.pgdeg_university}"/></td>
									<td><input type="text" name="" value="${stuDetails.pgdeg_marks}"/></td>
									</tr>
							</table>
						</div>
					</div>
					<center><button class="btn btn-danger">Observe Attendance</button>
					<button class="btn btn-info">Print Details</button>
					<button class="btn btn-success">See Academic Marks</button></center>
				
				</div>
			</div>
		</form>
		</div>
		</body></html>