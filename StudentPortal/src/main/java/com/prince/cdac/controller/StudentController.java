package com.prince.cdac.controller;


import java.io.IOException;
import java.util.List;

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
import com.prince.cdac.model.Document;
import com.prince.cdac.model.Login;
import com.prince.cdac.model.RegistrationDetails;
import com.prince.cdac.model.SDetailsSaved;
import com.prince.cdac.service.LoginServiceImpl;
import com.prince.cdac.service.StudentServiceImpl;
import com.prince.cdac.service.Student_Details_Impl;

@Controller
public class StudentController {
	
	
	@Autowired 
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@Autowired
	Student_Details_Impl student_Details_Impl;
	
	@Autowired
	DocumentRepository documentRepository;
	
	@Autowired
	Login login;
	
	@Autowired
	
	 
	
	@RequestMapping("home")
	public String home() { 
		return "home";
	}
	
	@RequestMapping("login")
	public String login(@ModelAttribute("registrationDetails")RegistrationDetails registrationDetails) { 
		studentServiceImpl.saveStuDet(registrationDetails);
		login.setuId(registrationDetails.getCcat_form_number());
		login.setuPassword(registrationDetails.getPassword());
		loginServiceImpl.saveUser(login);
		return "login";
	}
	
	@RequestMapping("alogin")
	public String alogin() {
		return "login";
	}
	
	@RequestMapping("registration")
	public String registration() { 
		return "registration";
	}

	 @RequestMapping("userForm") 
	 public String landingIntoPortal(@ModelAttribute("login")Login login, ModelMap modelMap) { 
		 try {
			 long ccatformno = loginServiceImpl.getUserById(login.getuId()).getuId();
			 if(!login.getuPassword().equals( loginServiceImpl.getUserById(login.getuId()).getuPassword())){
				 String msg2 =  "password is not correct";
				 modelMap.addAttribute("msg2", msg2);
				 return "login";
			 } 
			 else if(login.getuId()==12345 && login.getuPassword().equals("admin"))
				 return "adminLanding";
			 else {System.out.println("Successfully Login!!! with ccatformno:"+ccatformno+" and password:"+login.getuPassword());
				 return "userForm2";}
		} catch (Exception e) {
			String msg = login.getuId() + " does not exist in the db";
			modelMap.addAttribute("msg", msg);
			return "login";
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
		  return "redirect:home"; 
	  }
	 
	 @RequestMapping("see_All_generated_IdCards")
	 public String allIds(ModelMap modelMap) {
		 List<SDetailsSaved> sDetailsSaved = student_Details_Impl.getAllDetails();
		 modelMap.addAttribute("sDetailsSaved",sDetailsSaved);
		 
		 List<Document> lDocument = documentRepository.findAll();
		  modelMap.addAttribute("lDocument", lDocument);
		 
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
	 
	 
	
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @RequestMapping("userForm2") 
	 public ModelAndView uLogin(@RequestParam("username") String userid) { 
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("username", userid);
		 mv.setViewName("userForm2");
		 return mv;
	 }
	 
	 
		 
		 @RequestMapping("student") 
		 public ModelAndView student( @RequestParam("text") String sId){
			 ModelAndView mv2 = new ModelAndView();
			 mv2.addObject("text", sId);
			 mv2.setViewName("student");
			 return mv2;
	 }
	 
	 
	
	 
	 
}
	 
