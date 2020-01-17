package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	private String date;
	private char imp_1;
	private char imp_2;
	private char imp_3;
	private char imp_4;
	private char imp_5;
	private float a_Percentage;
	
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public float getA_Percentage() {
		return a_Percentage;
	}
	public void setA_Percentage(float a_Percentage) {
		this.a_Percentage = a_Percentage;
	}
	public long getCcat_form_no() {
		return ccat_form_no;
	}
	public void setCcat_form_no(long ccat_form_no) {
		this.ccat_form_no = ccat_form_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public char getImp_1() {
		return imp_1;
	}
	public void setImp_1(char imp_1) {
		this.imp_1 = imp_1;
	}
	public char getImp_2() {
		return imp_2;
	}
	public void setImp_2(char imp_2) {
		this.imp_2 = imp_2;
	}
	public char getImp_3() {
		return imp_3;
	}
	public void setImp_3(char imp_3) {
		this.imp_3 = imp_3;
	}
	public char getImp_4() {
		return imp_4;
	}
	public void setImp_4(char imp_4) {
		this.imp_4 = imp_4;
	}
	public char getImp_5() {
		return imp_5;
	}
	public void setImp_5(char imp_5) {
		this.imp_5 = imp_5;
	}
	@Override
	public String toString() {
		return "Attendance [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", date=" + date + ", imp_1=" + imp_1
				+ ", imp_2=" + imp_2 + ", imp_3=" + imp_3 + ", imp_4=" + imp_4 + ", imp_5=" + imp_5 + ", a_Percentage="
				+ a_Percentage + "]";
	}
	
	
	
	
	
	

}
