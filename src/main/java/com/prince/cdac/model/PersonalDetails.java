package com.prince.cdac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pd")
public class PersonalDetails {
	
	//@OneToOne
	//@JoinColumn(name="ccat_form_no")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	private String courseName;
	private String dob;
	private char gender;
	private String bloodGroup;
	private String father_Name;
	@Column(name = "fCN")
	private String father_ContactNo;
	private String mother_Name;
	@Column(name = "mCN")
	private String mother_ContactNo;
	private String currentAdd;
	private String permanentAdd;
	
	
	
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getFather_Name() {
		return father_Name;
	}
	public void setFather_Name(String father_Name) {
		this.father_Name = father_Name;
	}
	public String getFather_ContactNo() {
		return father_ContactNo;
	}
	public void setFather_ContactNo(String father_ContactNo) {
		this.father_ContactNo = father_ContactNo;
	}
	public String getMother_Name() {
		return mother_Name;
	}
	public void setMother_Name(String mother_Name) {
		this.mother_Name = mother_Name;
	}
	public String getMother_ContactNo() {
		return mother_ContactNo;
	}
	public void setMother_ContactNo(String mother_ContactNo) {
		this.mother_ContactNo = mother_ContactNo;
	}
	public String getCurrentAdd() {
		return currentAdd;
	}
	public void setCurrentAdd(String currentAdd) {
		this.currentAdd = currentAdd;
	}
	public String getPermanentAdd() {
		return permanentAdd;
	}
	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}
	@Override
	public String toString() {
		return "PersonalDetails [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", courseName=" + courseName
				+ ", dob=" + dob + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", father_Name=" + father_Name
				+ ", father_ContactNo=" + father_ContactNo + ", mother_Name=" + mother_Name + ", mother_ContactNo="
				+ mother_ContactNo + ", currentAdd=" + currentAdd + ", permanentAdd=" + permanentAdd + "]";
	}
	
	

}
