package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hostel {

	@Id
	private long uId;
	private char hostel_Allocated;
	private String name;
	//@ManyToMany
	private long prnNo;
	private  String payment_details;
	private String ref_No;
	private String bankName;
	private String acc_HolderName;
	private String date;
	private double amount;
	//@OneToOne(mappedBy="formNo")
	private long ccat_form_no;
	
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public char getHostel_Allocated() {
		return hostel_Allocated;
	}
	public void setHostel_Allocated(char hostel_Allocated) {
		this.hostel_Allocated = hostel_Allocated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrnNo() {
		return prnNo;
	}
	public void setPrnNo(long prnNo) {
		this.prnNo = prnNo;
	}
	public String getPayment_details() {
		return payment_details;
	}
	public void setPayment_details(String payment_details) {
		this.payment_details = payment_details;
	}
	public String getRef_No() {
		return ref_No;
	}
	public void setRef_No(String ref_No) {
		this.ref_No = ref_No;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAcc_HolderName() {
		return acc_HolderName;
	}
	public void setAcc_HolderName(String acc_HolderName) {
		this.acc_HolderName = acc_HolderName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public long getCcat_form_no() {
		return ccat_form_no;
	}
	public void setCcat_form_no(long ccat_form_no) {
		this.ccat_form_no = ccat_form_no;
	}
	@Override
	public String toString() {
		return "Hostel [uId=" + uId + ", hostel_Allocated=" + hostel_Allocated + ", name=" + name + ", prnNo=" + prnNo
				+ ", payment_details=" + payment_details + ", ref_No=" + ref_No + ", bankName=" + bankName
				+ ", acc_HolderName=" + acc_HolderName + ", date=" + date + ", amount=" + amount + ", ccat_form_no="
				+ ccat_form_no + "]";
	}
	
	
	
	
	
	
}
