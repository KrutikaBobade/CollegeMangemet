package com.clc.java.mvc.entity;

import javax.persistence.Entity;

@Entity
public class TempAddressEntity {

	private int pinCode;
	private String cityName;
	private String talukaName;
	private String villageName;
	private String State;
	private String addressDetail;
	@Override
	public String toString() {
		return "TempAddressEntity [pinCode=" + pinCode + ", cityName=" + cityName + ", talukaName=" + talukaName
				+ ", villageName=" + villageName + ", State=" + State + ", addressDetail=" + addressDetail + "]";
	}
	public TempAddressEntity(int pinCode, String cityName, String talukaName, String villageName, String state,
			String addressDetail) {
		super();
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.talukaName = talukaName;
		this.villageName = villageName;
		State = state;
		this.addressDetail = addressDetail;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getTalukaName() {
		return talukaName;
	}
	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public TempAddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
