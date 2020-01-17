package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MResult {
	
	//@ManyToMany
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int srNo;
	private String module;
	private float max_Marks;
	private float scoredMarks;
	private String result;
	
	
	
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
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public float getMax_Marks() {
		return max_Marks;
	}
	public void setMax_Marks(float max_Marks) {
		this.max_Marks = max_Marks;
	}
	public float getScoredMarks() {
		return scoredMarks;
	}
	public void setScoredMarks(float scoredMarks) {
		this.scoredMarks = scoredMarks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "MResult [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", srNo=" + srNo + ", module=" + module
				+ ", max_Marks=" + max_Marks + ", scoredMarks=" + scoredMarks + ", result=" + result + "]";
	}
	
	
	
	
	
	

}
