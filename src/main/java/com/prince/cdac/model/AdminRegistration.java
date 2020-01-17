package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminRegistration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long emp_Id;
	private String emp_Name;
	private String emp_Email;
	private String emp_Phone;
	private String password;
	
	public long getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(long emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Email() {
		return emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}
	public String getEmp_Phone() {
		return emp_Phone;
	}
	public void setEmp_Phone(String emp_Phone) {
		this.emp_Phone = emp_Phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminRegistration [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Email=" + emp_Email
				+ ", emp_Phone=" + emp_Phone + ", password=" + password + "]";
	}
	
	

}
