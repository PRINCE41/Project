package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registrationdetails")
public class RegistrationDetails {
	
	@Id
	//@OneToOne(mappedBy="formNo")
	private long ccat_form_number;
	private String first_name;
	private String last_name;
	private String email;
	private long phone;
	private String password;
	private String cpassword;
	
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getCcat_form_number() {
		return ccat_form_number;
	}
	public void setCcat_form_number(long ccat_form_number) {
		this.ccat_form_number = ccat_form_number;
	}
	@Override
	public String toString() {
		return "RegistrationDetails [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", cpassword=" + cpassword + ", ccat_form_number="
				+ ccat_form_number + "]";
	}
	
	
	
	

}
