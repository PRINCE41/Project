package com.prince.cdac.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.prince.cdac.dao.RegistrationRepo;
import com.prince.cdac.dao.DocumentRepository;
import com.prince.cdac.dao.LoginRepo;
import com.prince.cdac.model.AdminLogin;
import com.prince.cdac.model.AdminRegistration;
import com.prince.cdac.model.Document;
import com.prince.cdac.model.Login;
import com.prince.cdac.model.RegistrationDetails;
import com.prince.cdac.model.SDetailsSaved;
import com.prince.cdac.service.AdminLoginServiceImpl;
import com.prince.cdac.service.AdminRegistrationServiceImpl;
import com.prince.cdac.service.LoginServiceImpl;
import com.prince.cdac.service.StudentServiceImpl;
import com.prince.cdac.service.Student_Details_Impl;
import com.prince.cdac.util.EmailUtil;

@Controller
public class StudentController {
	
	
	@Autowired 
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@Autowired
	AdminLoginServiceImpl adminLoginServiceImpl;
	
	@Autowired
	Student_Details_Impl  student_Details_Impl;
	
	@Autowired
	DocumentRepository documentRepository;
	
	@Autowired
	Login login;
	
	@Autowired
	AdminLogin alogin;
	 
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	AdminRegistrationServiceImpl adminRegistrationServiceImpl;
	
	
	
	@RequestMapping("/")
	public String home() { 
		return "home";
	}
	
	
	@RequestMapping("loggedin")
	public String login(@ModelAttribute("registrationDetails")RegistrationDetails registrationDetails, ModelMap modelMap) { 
		studentServiceImpl.saveStuDet(registrationDetails);
		login.setuId(registrationDetails.getuId());
		login.setuPassword(registrationDetails.getPassword());
		loginServiceImpl.saveUser(login);
		long uid = login.getuId() +1;
		String body = "Your USERID is: " + uid  + "\nYour PASSWORD is: " + login.getuPassword();
		body += "\nPlease use this to login for the next time";
		body += "\nThank you!";
		String address = registrationDetails.getEmail();
		emailUtil.sendEmail(address, "ACTS EC Student Portal", body);
		String msg3 = "We have just sent you an email. Please check your email for userId and Password";
		modelMap.addAttribute("msg3", msg3);
		return "login"; 
	}
	
	@RequestMapping("aloggedin")
	public String alogin(@ModelAttribute("adminRegistration")AdminRegistration adminRegistration, ModelMap modelMap) { 
		adminRegistrationServiceImpl.saveDetails(adminRegistration);
		alogin.setuId(adminRegistration.getEmp_Id());
		alogin.setPassword(adminRegistration.getPassword());
		adminLoginServiceImpl.saveDetails(alogin);
		long uid = login.getuId() +1;
		String body = "Your USERID is: " + uid  + "\nYour PASSWORD is: " + login.getuPassword();
		body += "\nPlease use this to login for the next time";
		body += "\nThank you!";
		String address = adminRegistration.getEmp_Email();
		emailUtil.sendEmail(address, "ACTS EC Student Portal", body);
		String msg3 = "We have just sent you an email. Please check your email for userId and Password";
		modelMap.addAttribute("msg3", msg3);
		return "alogin"; 
	}
	
	
	
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("alogin")
	public String alogin() {
		return "adminLogin";
	}
	
	@RequestMapping("registration")
	public String registration() { 
		return "registration";
	}
	
	@RequestMapping("aRegistration")
	public String aRegistration() { 
		return "aRegistration";
	}
	

	

	 @RequestMapping("userForm") 
	 public String landingIntoPortal(@ModelAttribute("login")Login login, ModelMap modelMap) { 
		 try {
			 long uId = loginServiceImpl.getUserById(login.getuId()).getuId();
			 if(!login.getuPassword().equals( loginServiceImpl.getUserById(login.getuId()).getuPassword())){
				 String msg2 =  "password is not correct";
				 modelMap.addAttribute("msg2", msg2);
				 return "login";
			 } 
			 
			 else {System.out.println("Successfully Login!!! with ccatformno:"+uId+" and password:"+login.getuPassword());
				 return "userForm";}
		} catch (Exception e) {
			String msg = login.getuId() + " does not exist in the database";
			modelMap.addAttribute("msg", msg);
			return "login";
		} 
	}
	 
	 
	 @RequestMapping("adminLanding")
	 public String adminLanding(@ModelAttribute("adminLogin")AdminLogin adminLogin, ModelMap modelMap) {
		 try {
			 long uId = adminLoginServiceImpl.getDetailsByUId(adminLogin.getuId()).getuId();
			 if(!adminLogin.getPassword().equals( adminLoginServiceImpl.getDetailsByUId(adminLogin.getuId()).getPassword())){
				 String msg2 =  "password is not correct";
				 modelMap.addAttribute("msg2", msg2);
				 return "adminLogin";
			 } 
		 else if(adminLogin.getuId()==12345 && adminLogin.getPassword().equals("admin"))
			 return "superAdminLanding";
		 else {System.out.println("Successfully Login!!! with UserId:"+uId+" and password:"+adminLogin.getPassword());
		 return "adminLanding";}
		 }catch (Exception e) {
				String msg = adminLogin.getuId() + " does not exist in the database";
				modelMap.addAttribute("msg", msg);
				return "adminLogin";
			} 	 
	 }
	 
	 @RequestMapping("admin") 
	 public String aLogin(@ModelAttribute("sDetailsSaved")SDetailsSaved sDetailsSaved, ModelMap modelMap) { 
		 String name;
		try {
			name = student_Details_Impl.getDetailsByPrn(sDetailsSaved.getFormNo()).getName();
		} catch (Exception e) {
			String msg = "Invalid ccat form no.";
			modelMap.addAttribute("msg", msg);
			return "adminLanding";
		}
		SDetailsSaved stuDetails = student_Details_Impl.getDetailsByPrn(sDetailsSaved.getFormNo());
		modelMap.addAttribute("stuDetails",stuDetails);
		return "student";
	 }
	 
	 @RequestMapping("detailsSaved")
	 public String detailsSaved(@ModelAttribute("sDetailsSaved") SDetailsSaved sDetailsSaved, ModelMap modelMap) {
		 student_Details_Impl.saveDetails(sDetailsSaved);
		 String msg = "Hii "+ sDetailsSaved.getName() +", your details are saved successfully please upload following documents here...";
		 modelMap.addAttribute("msg", msg);
		 Long form = sDetailsSaved.getFormNo();
		 modelMap.addAttribute("form", form);
		 return "document";
	 }
	
	 
	 @RequestMapping(value = "destroy", method = RequestMethod.GET) 
	  public String destroy(@ModelAttribute SDetailsSaved ss, WebRequest request,SessionStatus status) {
		  status.setComplete(); 
		  request.removeAttribute("ss",WebRequest.SCOPE_SESSION);
		  return "redirect:/"; 
	  }
	 
	 @RequestMapping("see_All_generated_IdCards")
	 public String allIds(ModelMap modelMap, HttpServletResponse response,HttpServletRequest request)
			 throws ServletException, IOException {
		 List<SDetailsSaved> sDetailsSaved = student_Details_Impl.getAllDetails();
		 modelMap.addAttribute("sDetailsSaved",sDetailsSaved);
		 return "allids";
	 }
	 
	 
	 @RequestMapping("see_All_Students")
	 public String seeAll(ModelMap modelMap) {
		 List<SDetailsSaved> sDetailsSaved = student_Details_Impl.getAllDetails();
		 modelMap.addAttribute("sDetailsSaved",sDetailsSaved);
		 return "allStudent";
	 }
	 
	 @RequestMapping(value = "documentUpload", method= RequestMethod.POST)
	 public String docUpload(@RequestParam("signature") MultipartFile multipartFile1,@RequestParam("image") MultipartFile multipartFile2, @RequestParam("formNo") long id, ModelMap modelMap) {
		 Document document = new Document();
		 document.setFormNo(id);
		 try {
			document.setSignature(multipartFile1.getBytes());
			 document.setImage(multipartFile2.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		documentRepository.save(document);
		
		 
		 String finalMsg = "Documents are successfully uploaded. Click Exit to leave.";
		 modelMap.addAttribute("finalMsg", finalMsg);
		 return "document";
	 }
	 
	 @RequestMapping("displayUpload")
	 public String displayUpload() {
		 return "document";
	 }
	 
	 @RequestMapping("addStudents")
	 public String addStudents() {
		 return "userForm2";
	 }
	 
	 @RequestMapping("deleteStudents")
	 public String deleteStudents(@RequestParam("formNo")long formNo,ModelMap modelMap) {
		 SDetailsSaved sDetailsSaved  = student_Details_Impl.getDetailsByPrn(formNo);
		 student_Details_Impl.deleteDetails(sDetailsSaved);
		 
		 String msg= "entry deleted successfully";
		 
		 modelMap.addAttribute("msg",msg);
		 return "allStudent";
	 }
	
	 
	 
	 
	 
	 
	 @RequestMapping("userFormN") 
	 public String uLogin() { 
		 return "userForm2";
	 }
	 
	 
		 
		 @RequestMapping("student") 
		 public ModelAndView student( @RequestParam("text") String sId){
			 ModelAndView mv2 = new ModelAndView();
			 mv2.addObject("text", sId);
			 mv2.setViewName("student");
			 return mv2;
	 }
	 
	 
	
	 
	 
}
	 
