package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pd")
public class EducationalDetails {
	
	//@OneToOne
	//@JoinColumn(name="ccat_form_no")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long ccat_form_no;
	private int ssc_YOP;
	private String ssc_Univ;
	private int ssc_Percent;
	private int hsc_YOP;
	private String hsc_Univ;
	private int hsc_Percent;
	private String dip_Branch;
	private int dip_YOP;
	private String dip_Univ;
	private int dip_Percent;
	private String grad_Deg;
	private String grad_Branch;
	private String grad_Univ;
	private int grad_YOP;
	private int grad_Percent;
	private String pg_Deg;
	private String pg_Branch;
	private String pg_Univ;
	private int pg_YOP;
	private int pg_Percent;
	
	
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
	public int getSsc_YOP() {
		return ssc_YOP;
	}
	public void setSsc_YOP(int ssc_YOP) {
		this.ssc_YOP = ssc_YOP;
	}
	public String getSsc_Univ() {
		return ssc_Univ;
	}
	public void setSsc_Univ(String ssc_Univ) {
		this.ssc_Univ = ssc_Univ;
	}
	public int getSsc_Percent() {
		return ssc_Percent;
	}
	public void setSsc_Percent(int ssc_Percent) {
		this.ssc_Percent = ssc_Percent;
	}
	public int getHsc_YOP() {
		return hsc_YOP;
	}
	public void setHsc_YOP(int hsc_YOP) {
		this.hsc_YOP = hsc_YOP;
	}
	public String getHsc_Univ() {
		return hsc_Univ;
	}
	public void setHsc_Univ(String hsc_Univ) {
		this.hsc_Univ = hsc_Univ;
	}
	public int getHsc_Percent() {
		return hsc_Percent;
	}
	public void setHsc_Percent(int hsc_Percent) {
		this.hsc_Percent = hsc_Percent;
	}
	public String getDip_Branch() {
		return dip_Branch;
	}
	public void setDip_Branch(String dip_Branch) {
		this.dip_Branch = dip_Branch;
	}
	public int getDip_YOP() {
		return dip_YOP;
	}
	public void setDip_YOP(int dip_YOP) {
		this.dip_YOP = dip_YOP;
	}
	public String getDip_Univ() {
		return dip_Univ;
	}
	public void setDip_Univ(String dip_Univ) {
		this.dip_Univ = dip_Univ;
	}
	public int getDip_Percent() {
		return dip_Percent;
	}
	public void setDip_Percent(int dip_Percent) {
		this.dip_Percent = dip_Percent;
	}
	public String getGrad_Deg() {
		return grad_Deg;
	}
	public void setGrad_Deg(String grad_Deg) {
		this.grad_Deg = grad_Deg;
	}
	public String getGrad_Branch() {
		return grad_Branch;
	}
	public void setGrad_Branch(String grad_Branch) {
		this.grad_Branch = grad_Branch;
	}
	public String getGrad_Univ() {
		return grad_Univ;
	}
	public void setGrad_Univ(String grad_Univ) {
		this.grad_Univ = grad_Univ;
	}
	public int getGrad_YOP() {
		return grad_YOP;
	}
	public void setGrad_YOP(int grad_YOP) {
		this.grad_YOP = grad_YOP;
	}
	public int getGrad_Percent() {
		return grad_Percent;
	}
	public void setGrad_Percent(int grad_Percent) {
		this.grad_Percent = grad_Percent;
	}
	public String getPg_Deg() {
		return pg_Deg;
	}
	public void setPg_Deg(String pg_Deg) {
		this.pg_Deg = pg_Deg;
	}
	public String getPg_Branch() {
		return pg_Branch;
	}
	public void setPg_Branch(String pg_Branch) {
		this.pg_Branch = pg_Branch;
	}
	public String getPg_Univ() {
		return pg_Univ;
	}
	public void setPg_Univ(String pg_Univ) {
		this.pg_Univ = pg_Univ;
	}
	public int getPg_YOP() {
		return pg_YOP;
	}
	public void setPg_YOP(int pg_YOP) {
		this.pg_YOP = pg_YOP;
	}
	public int getPg_Percent() {
		return pg_Percent;
	}
	public void setPg_Percent(int pg_Percent) {
		this.pg_Percent = pg_Percent;
	}
	@Override
	public String toString() {
		return "EducationalDetails [uId=" + uId + ", ccat_form_no=" + ccat_form_no + ", ssc_YOP=" + ssc_YOP
				+ ", ssc_Univ=" + ssc_Univ + ", ssc_Percent=" + ssc_Percent + ", hsc_YOP=" + hsc_YOP + ", hsc_Univ="
				+ hsc_Univ + ", hsc_Percent=" + hsc_Percent + ", dip_Branch=" + dip_Branch + ", dip_YOP=" + dip_YOP
				+ ", dip_Univ=" + dip_Univ + ", dip_Percent=" + dip_Percent + ", grad_Deg=" + grad_Deg
				+ ", grad_Branch=" + grad_Branch + ", grad_Univ=" + grad_Univ + ", grad_YOP=" + grad_YOP
				+ ", grad_Percent=" + grad_Percent + ", pg_Deg=" + pg_Deg + ", pg_Branch=" + pg_Branch + ", pg_Univ="
				+ pg_Univ + ", pg_YOP=" + pg_YOP + ", pg_Percent=" + pg_Percent + "]";
	}
	
	
	

}
