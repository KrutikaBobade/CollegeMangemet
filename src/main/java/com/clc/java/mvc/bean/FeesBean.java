package com.clc.java.mvc.bean;

public class FeesBean {

	private double paidFees;

	@Override
	public String toString() {
		return "FeesBean [paidFees=" + paidFees + "]";
	}

	public double getPaidFees() {
		return paidFees;
	}

	public void setPaidFees(double paidFees) {
		this.paidFees = paidFees;
	}

	public FeesBean(double paidFees) {
		super();
		this.paidFees = paidFees;
	}

	public FeesBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
