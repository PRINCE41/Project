package com.prince.cdac.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
 
	@Id
	private long formNo;
	@Lob
	private byte[] image;
	@Lob
	private byte[] signature;
	
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
	
	
	
}
