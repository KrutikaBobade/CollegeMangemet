package com.clc.java.mvc.bean;

public class AddressBean {
	
	private TempAddressBean tempAddressBean;
	private PermanentAddressBean permanentAddressBean;
	@Override
	public String toString() {
		return "AddressBean [tempAddressBean=" + tempAddressBean + ", permanentAddressBean=" + permanentAddressBean
				+ "]";
	}
	public TempAddressBean getTempAddressBean() {
		return tempAddressBean;
	}
	public void setTempAddressBean(TempAddressBean tempAddressBean) {
		this.tempAddressBean = tempAddressBean;
	}
	public PermanentAddressBean getPermanentAddressBean() {
		return permanentAddressBean;
	}
	public void setPermanentAddressBean(PermanentAddressBean permanentAddressBean) {
		this.permanentAddressBean = permanentAddressBean;
	}
	public AddressBean(TempAddressBean tempAddressBean, PermanentAddressBean permanentAddressBean) {
		super();
		this.tempAddressBean = tempAddressBean;
		this.permanentAddressBean = permanentAddressBean;
	}
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
