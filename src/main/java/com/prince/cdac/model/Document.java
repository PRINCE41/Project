package com.prince.cdac.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uId;
	private long formNo;
	@Lob
	private byte[] image;
	@Lob
	private byte[] signature;
	
	
	
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public long getFormNo() {
		return formNo;
	}
	public void setFormNo(long formNo) {
		this.formNo = formNo;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	@Override
	public String toString() {
		return "Document [uId=" + uId + ", formNo=" + formNo + ", image=" + Arrays.toString(image) + ", signature="
				+ Arrays.toString(signature) + "]";
	}
	
	
	
}
