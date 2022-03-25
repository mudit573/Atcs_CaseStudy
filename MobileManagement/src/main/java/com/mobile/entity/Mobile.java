package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_details")
public class Mobile {
	
	@Id
	@Column(name = "mid",length= 10)
	private int mobileID;
	@Column(name = "mname",length= 10)
	private String mobileName;
	@Column(name = "mtype",length= 10)
	private String mobileTYPE;
	@Column(name = "mprice",length= 10)
	private int mobilePrice;
	@Column(name = "mwarrenty",length= 10)
	private int mobileWarrenty;
	@Column(name = "mnumuber",length= 10)
	private int mobileIMEINumber;
	
	
	
	public Mobile(int mobileID, String mobileName, String mobileTYPE, int mobilePrice, int mobileWarrenty,
			int mobileIMEINumber) {
		super();
		this.mobileID = mobileID;
		this.mobileName = mobileName;
		this.mobileTYPE = mobileTYPE;
		this.mobilePrice = mobilePrice;
		this.mobileWarrenty = mobileWarrenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}

	public int getMobileID() {
		return mobileID;
	}
	
	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileTYPE() {
		return mobileTYPE;
	}
	public void setMobileTYPE(String mobileTYPE) {
		this.mobileTYPE = mobileTYPE;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileWarrenty() {
		return mobileWarrenty;
	}
	public void setMobileWarrenty(int mobileWarrenty) {
		this.mobileWarrenty = mobileWarrenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	
	@Override
	public String toString() {
		return "mobileDetails [mobileID=" + mobileID + ", mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE
				+ ", mobilePrice=" + mobilePrice + ", mobileWarrenty=" + mobileWarrenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	
	
	public Mobile() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
