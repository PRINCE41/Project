package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IdCard {

	//@OneToOne
	//@JoinColumn(name="ccat_form_no")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	private int srNo;
	//@ManyToMany
	private long prnNo;
	private String name;
	private String emerg_Cont;
	private char change_in_name;
	
	
	
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
	public String getEmerg_Cont() {
		return emerg_Cont;
	}
	public void setEmerg_Cont(String emerg_Cont) {
		this.emerg_Cont = emerg_Cont;
	}
	public char getChange_in_name() {
		return change_in_name;
	}
	public void setChange_in_name(char change_in_name) {
		this.change_in_name = change_in_name;
	}
	@Override
	public String toString() {
		return "IdCard [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", srNo=" + srNo + ", prnNo=" + prnNo
				+ ", name=" + name + ", emerg_Cont=" + emerg_Cont + ", change_in_name=" + change_in_name + "]";
	}
	
	
}
