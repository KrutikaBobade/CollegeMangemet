package com.clc.java.mvc.entity;

import javax.persistence.Entity;

@Entity
public class FeesEntity {

	private double paidFees;

	@Override
	public String toString() {
		return "FeesEntity [paidFees=" + paidFees + "]";
	}

	public FeesEntity(double paidFees) {
		super();
		this.paidFees = paidFees;
	}

	public double getPaidFees() {
		return paidFees;
	}

	public void setPaidFees(double paidFees) {
		this.paidFees = paidFees;
	}

	public FeesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
