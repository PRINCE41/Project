<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DAC</title>
</head>
<body>

<h3>Details of ${text} </h3> 
<div style="heigth:100%; width:25%; color: red; background-color: cyan" >

<ul>
	<li><a href="#">Observe Attendance</a></li>
	<li><a href="#">Print Detail form</a></li>
	<li><a href="#"></a>See current academic marks</li>
</ul>

</div>

<div>
	<table border="1">
		<tr>
			<th>PRN number</th>
			<th>Name</th>
			<th>Admitted course</th>
			<th>CCat form no</th>
			<th>DOB</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>Father's name</th>
			<th>Father's mobile no</th>
			<th>Blood gp</th>
			<th>mother's Name</th>
			<th>mother's mobile no</th>
			<th>Current address</th>
			<th>Permanent address</th>
			<th>ssc_year_of_passing</th>
			<th>ssc_university</th>
			<th>ssc_marks</th>
			<th>hsc_year_of_passing</th>
			<th>hsc_university</th>
			<th>hsc_marks</th>
			<th>Diploma branch</th>
			<th>Diploma year of passing</th>
			<th>Diploma university</th>
			<th>Diploma marks</th>
			<th>degree name</th>
			<th>degree branch</th>
			<th>degree year of passing</th>
			<th>degree university</th>
			<th>deg marks</th>
			<th>pgdeg name</th>
			<th>pgdeg branch</th>
			<th>pgdeg year of passing</th>
			<th>pgdeg university</th>
			<th>pgdeg marks</th>
		</tr>
		<tr>
			<th>${stuDetails.prnNo}</th>
			<th>${stuDetails.name}</th>
			<th>${stuDetails.adm_course}</th>
			<th>${stuDetails.formNo}</th>
			<th>${stuDetails.dob}</th>
			<th>${stuDetails.email}</th>
			<th>${stuDetails.phone}</th>
			<th>${stuDetails.gender}</th>
			<th>${stuDetails.fName}</th>
			<th>${stuDetails.fMobile}</th>
			<th>${stuDetails.blood_gp}</th>
			<th>${stuDetails.mName}</th>
			<th>${stuDetails.mMobile}</th>
			<th>${stuDetails.cAddress}</th>
			<th>${stuDetails.pAddress}</th>
			<th>${stuDetails.ssc_year_of_passing}</th>
			<th>${stuDetails.ssc_university}</th>
			<th>${stuDetails.ssc_marks}</th>
			<th>${stuDetails.hsc_year_of_passing}</th>
			<th>${stuDetails.hsc_university}</th>
			<th>${stuDetails.hsc_marks}</th>
			<th>${stuDetails.dip_branch}</th>
			<th>${stuDetails.dip_year_of_passing}</th>
			<th>${stuDetails.dip_university}</th>
			<th>${stuDetails.dip_marks}</th>
			<th>${stuDetails.deg_name}</th>
			<th>${stuDetails.deg_branch}</th>
			<th>${stuDetails.deg_year_of_passing}</th>
			<th>${stuDetails.deg_university}</th>
			<th>${stuDetails.deg_marks}</th>
			<th>${stuDetails.pgdeg_name}</th>
			<th>${stuDetails.pgdeg_branch}</th>
			<th>${stuDetails.pgdeg_year_of_passing}</th>
			<th>${stuDetails.pgdeg_university}</th>
			<th>${stuDetails.pgdeg_marks}</th>
		</tr>
	</table>
</div>




</body>
</html>