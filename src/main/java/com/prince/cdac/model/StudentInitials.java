package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentInitials {

	//@OneToOne
	//@JoinColumn(name="ccat_form_no")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	private long formNo;
	//@ManyToMany
	private long prnNo;
	private String name;
	
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public long getCcat_form_no() {
		return ccat_form_no;
	}
	public void setCcat_form_no(long ccat_form_no) {
		this.ccat_form_no = ccat_form_no;
	}
	public long getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(long prnNo) {
		this.prnNo = prnNo;
	}
	public long getFormNo() {
		return formNo;
	}
	public void setFormNo(long formNo) {
		this.formNo = formNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentInitials [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", formNo=" + formNo + ", prnNo="
				+ prnNo + ", name=" + name + "]";
	}
	
}
