package com.clc.java.mvc.entity;

import javax.persistence.Entity;

@Entity
public class AddressEntity {

	private TempAddressEntity tempAddressEntity;
	private PermanentAddressEntity permanentAddressEntity;
	@Override
	public String toString() {
		return "AddressEntity [tempAddressEntity=" + tempAddressEntity + ", permanentAddressEntity="
				+ permanentAddressEntity + "]";
	}
	public TempAddressEntity getTempAddressEntity() {
		return tempAddressEntity;
	}
	public void setTempAddressEntity(TempAddressEntity tempAddressEntity) {
		this.tempAddressEntity = tempAddressEntity;
	}
	public PermanentAddressEntity getPermanentAddressEntity() {
		return permanentAddressEntity;
	}
	public void setPermanentAddressEntity(PermanentAddressEntity permanentAddressEntity) {
		this.permanentAddressEntity = permanentAddressEntity;
	}
	public AddressEntity(TempAddressEntity tempAddressEntity, PermanentAddressEntity permanentAddressEntity) {
		super();
		this.tempAddressEntity = tempAddressEntity;
		this.permanentAddressEntity = permanentAddressEntity;
	}
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
