<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>students registration</title>
</head>
<body>

	<h1>Hello ${username} !</h1>

	<div id='personaldetails'>
  <form action="detailsSaved" method="post">
       <table border="5">
       <tr>
       		<td>prnNo</td>
       		<td><input type="text" id="prnNo" name="prnNo" value="0" required></td>
       </tr>
       <tr>
           <td>Name</td>
           <td><input type='text' id='name' name="name" value="" required></td>
        </tr>
       <tr>
           <td>Admitted course</td>
           <td><input type='text' id='course' name= "adm_course" value="" required></td>
        </tr>
       <tr>
           <td>C-CAT Form No.</td>
           <td><input type='text' id='formnumber' name="formNo" value="" required></td>
        </tr>
       <tr>
           <td>Date of Birth</td>
           <td><input type='date' id='date' name="dob" value="" required></td>
        </tr>
       <tr>
           <td> E-mail ID</td>
           <td><input type='text' id='emailid' name="email" value="" required></td>
        </tr> 
        <tr>
           <td> Phone</td>
           <td><input type='text' id='phone' name="phone" value="" required></td>
        </tr>    
       <tr><td>Gender</td>
           <td>
           <select name="gender" value="" required>
            <option>male</option>
            <option>female</option> 
           </select>
           </td>
       </tr>
        <tr>
           <td>Father's Name </td>
           <td><input type='text' id='fathesname' name="fName" value="" required></td>
        </tr>
       <tr>
           <td>father mobile no.</td>
           <td><input type="number" name="fMobile" value="" required></td>
        </tr>
       <tr>
           <td>blood group:</td>
           <td><input type="text" name="blood_gp" value="" required></td>
        </tr>
       <tr>
           <td>mother's Name:</td>
           <td><input type="text" name="mName" value="" required></td>
        </tr>
       <tr>
           <td>mother mobile no</td>
           <td><input type="text" name="mMobile" value="" required></td>
        </tr> 
       <tr>
           <td>current address</td>
           <td><input type="text" name="cAddress" value="" required></td>
        </tr> 
       <tr><td>permanent address</td>
           <td><input type="text" name="pAddress" value="" required></td>
        </tr>
        
       </table>
      
      <table border="1">
          <tr>
          <td>Qualification</td><td>Degree/pg</td><td>Branch</td>
          <td>Year of passing</td><td>University</td><td>%marks</td>
          </tr>
        <tr>
            <td>SSC</td>
            <td>NA</td>
            <td>NA</td>
            <td><input type="number" name="ssc_year_of_passing" value="0"></td>
            <td><input type="text" name="ssc_university" value="0"></td>
            <td><input type="number" name="ssc_marks" value="0"></td>
        </tr>
        <tr>
            <td>HSC</td>
            <td>NA</td>
            <td>NA</td>
            <td><input type="number" name="hsc_year_of_passing" value="0"></td>
            <td><input type="text" name="hsc_university" value="0"></td>
            <td><input type="number" name="hsc_marks" value="0"></td>
        </tr>
        <tr>
            <td>Diploma</td>
            <td>NA</td>
            <td><input type="text" name="dip_branch" value="0"></td>
            <td><input type="number" name="dip_year_of_passing" value="0"></td>
            <td><input type="text" name="dip_university" value="0"></td>
            <td><input type="number" name="dip_marks" value="0"></td>
        </tr>
        <tr>
            <td>Degree</td>
            <td><input type="text" name="deg_name" value="0"></td>
            <td><input type="text" name="deg_branch" value="0"></td>
            <td><input type="number" name="deg_year_of_passing" value="0"></td>
            <td><input type="text" name="deg_university" value="0"></td>
            <td><input type="number" name="deg_marks" value="0"></td>
        </tr>
         <tr>
            <td>PG</td>
            <td><input type="text" name="pgdeg_name" value="0"></td>
            <td><input type="text" name="pgdeg_branch" value="0"></td>
            <td><input type="number" name="pgdeg_year_of_passing" value="0"></td>
            <td><input type="text" name="pgdeg_university" value="0"></td>
            <td><input type="number" name="pgdeg_marks" value="0"></td>
        </tr>
        
      </table>
      <div>Date:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="date" value=""></div>
      
      
      <a href="detailsSaved"><button type="submit" value="submit">Submit and next</button></a>
      <button type="reset" value="submit">Reset</button>
     </form>   
        
        </div>
	

</body>
</html>