package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GResult {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long prnNo;
	//@OneToOne(mappedBy="formNo")
	private long ccat_form_no;
	private int srNo;
	private char grade;
	private String subject;
	public long getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(long prnNo) {
		this.prnNo = prnNo;
	}
	
	public long getCcat_form_no() {
		return ccat_form_no;
	}
	public void setCcat_form_no(long ccat_form_no) {
		this.ccat_form_no = ccat_form_no;
	}
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	@Override
	public String toString() {
		return "GResult [uId=" + uId + ", prnNo=" + prnNo + ", ccat_form_no=" + ccat_form_no + ", srNo=" + srNo
				+ ", grade=" + grade + ", subject=" + subject + "]";
	}
	
	
}
