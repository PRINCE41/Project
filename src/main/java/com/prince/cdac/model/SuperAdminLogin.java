package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuperAdminLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private String password;
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SuperAdminLogin [uId=" + uId + ", password=" + password + "]";
	}
	
	

}
