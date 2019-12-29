package com.prince.cdac.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class SDetailsSaved {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long formNo;
	private long prnNo;
	@Column(name = "sName")
	private String name;
	private String adm_course;
	//@OneToOne
	//@JoinColumn(name="ccat_form_no")
	
	private String dob;
	private String email;
	private long phone;
	private String gender;
	private String fName;
	private String fMobile;
	private String blood_gp;
	private String mName;
	private long mMobile;
	private String cAddress;
	private String pAddress;
	private int ssc_year_of_passing;
	private String ssc_university;
	private double ssc_marks;
	private int hsc_year_of_passing;
	private String hsc_university;
	private double hsc_marks;
	private String dip_branch;
	private int dip_year_of_passing;
	private String dip_university;
	private double dip_marks;
	private String deg_name;
	private String deg_branch;
	private int deg_year_of_passing;
	private String deg_university;
	private double deg_marks;
	private String pgdeg_name;
	private String pgdeg_branch;
	private int pgdeg_year_of_passing;
	private String pgdeg_university;
	private double pgdeg_marks;
	
	
	
	
	public long getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(long prnNo) {
		this.prnNo = prnNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdm_course() {
		return adm_course;
	}
	public void setAdm_course(String adm_course) {
		this.adm_course = adm_course;
	}
	public long getFormNo() {
		return formNo;
	}
	public void setFormNo(long formNo) {
		this.formNo = formNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfMobile() {
		return fMobile;
	}
	public void setfMobile(String fMobile) {
		this.fMobile = fMobile;
	}
	public String getBlood_gp() {
		return blood_gp;
	}
	public void setBlood_gp(String blood_gp) {
		this.blood_gp = blood_gp;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public long getmMobile() {
		return mMobile;
	}
	public void setmMobile(long mMobile) {
		this.mMobile = mMobile;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public int getSsc_year_of_passing() {
		return ssc_year_of_passing;
	}
	public void setSsc_year_of_passing(int ssc_year_of_passing) {
		this.ssc_year_of_passing = ssc_year_of_passing;
	}
	public String getSsc_university() {
		return ssc_university;
	}
	public void setSsc_university(String ssc_university) {
		this.ssc_university = ssc_university;
	}
	public double getSsc_marks() {
		return ssc_marks;
	}
	public void setSsc_marks(double ssc_marks) {
		this.ssc_marks = ssc_marks;
	}
	public int getHsc_year_of_passing() {
		return hsc_year_of_passing;
	}
	public void setHsc_year_of_passing(int hsc_year_of_passing) {
		this.hsc_year_of_passing = hsc_year_of_passing;
	}
	public String getHsc_university() {
		return hsc_university;
	}
	public void setHsc_university(String hsc_university) {
		this.hsc_university = hsc_university;
	}
	public double getHsc_marks() {
		return hsc_marks;
	}
	public void setHsc_marks(double hsc_marks) {
		this.hsc_marks = hsc_marks;
	}
	public String getDip_branch() {
		return dip_branch;
	}
	public void setDip_branch(String dip_branch) {
		this.dip_branch = dip_branch;
	}
	public int getDip_year_of_passing() {
		return dip_year_of_passing;
	}
	public void setDip_year_of_passing(int dip_year_of_passing) {
		this.dip_year_of_passing = dip_year_of_passing;
	}
	public String getDip_university() {
		return dip_university;
	}
	public void setDip_university(String dip_university) {
		this.dip_university = dip_university;
	}
	public double getDip_marks() {
		return dip_marks;
	}
	public void setDip_marks(double dip_marks) {
		this.dip_marks = dip_marks;
	}
	public String getDeg_name() {
		return deg_name;
	}
	public void setDeg_name(String deg_name) {
		this.deg_name = deg_name;
	}
	public String getDeg_branch() {
		return deg_branch;
	}
	public void setDeg_branch(String deg_branch) {
		this.deg_branch = deg_branch;
	}
	public int getDeg_year_of_passing() {
		return deg_year_of_passing;
	}
	public void setDeg_year_of_passing(int deg_year_of_passing) {
		this.deg_year_of_passing = deg_year_of_passing;
	}
	public String getDeg_university() {
		return deg_university;
	}
	public void setDeg_university(String deg_university) {
		this.deg_university = deg_university;
	}
	public double getDeg_marks() {
		return deg_marks;
	}
	public void setDeg_marks(double deg_marks) {
		this.deg_marks = deg_marks;
	}
	public String getPgdeg_name() {
		return pgdeg_name;
	}
	public void setPgdeg_name(String pgdeg_name) {
		this.pgdeg_name = pgdeg_name;
	}
	public String getPgdeg_branch() {
		return pgdeg_branch;
	}
	public void setPgdeg_branch(String pgdeg_branch) {
		this.pgdeg_branch = pgdeg_branch;
	}
	public int getPgdeg_year_of_passing() {
		return pgdeg_year_of_passing;
	}
	public void setPgdeg_year_of_passing(int pgdeg_year_of_passing) {
		this.pgdeg_year_of_passing = pgdeg_year_of_passing;
	}
	public String getPgdeg_university() {
		return pgdeg_university;
	}
	public void setPgdeg_university(String pgdeg_university) {
		this.pgdeg_university = pgdeg_university;
	}
	public double getPgdeg_marks() {
		return pgdeg_marks;
	}
	public void setPgdeg_marks(double pgdeg_marks) {
		this.pgdeg_marks = pgdeg_marks;
	}
	@Override
	public String toString() {
		return "SDetailsSaved [formNo=" + formNo + ", prnNo=" + prnNo + ", name=" + name + ", adm_course=" + adm_course
				+ ", dob=" + dob + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", fName=" + fName
				+ ", fMobile=" + fMobile + ", blood_gp=" + blood_gp + ", mName=" + mName + ", mMobile=" + mMobile
				+ ", cAddress=" + cAddress + ", pAddress=" + pAddress + ", ssc_year_of_passing=" + ssc_year_of_passing
				+ ", ssc_university=" + ssc_university + ", ssc_marks=" + ssc_marks + ", hsc_year_of_passing="
				+ hsc_year_of_passing + ", hsc_university=" + hsc_university + ", hsc_marks=" + hsc_marks
				+ ", dip_branch=" + dip_branch + ", dip_year_of_passing=" + dip_year_of_passing + ", dip_university="
				+ dip_university + ", dip_marks=" + dip_marks + ", deg_name=" + deg_name + ", deg_branch=" + deg_branch
				+ ", deg_year_of_passing=" + deg_year_of_passing + ", deg_university=" + deg_university + ", deg_marks="
				+ deg_marks + ", pgdeg_name=" + pgdeg_name + ", pgdeg_branch=" + pgdeg_branch
				+ ", pgdeg_year_of_passing=" + pgdeg_year_of_passing + ", pgdeg_university=" + pgdeg_university
				+ ", pgdeg_marks=" + pgdeg_marks + "]";
	}
	
	
	

}
