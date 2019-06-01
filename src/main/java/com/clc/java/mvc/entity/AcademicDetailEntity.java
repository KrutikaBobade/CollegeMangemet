package com.clc.java.mvc.entity;

import javax.persistence.Entity;

@Entity
public class AcademicDetailEntity {
	private int sscMarks;
	private int sscTotalMarks;
	private int hscMarks;
	private int hscTotalMarks;
    private int diplomaMarks; 
	private int diplomaTotalMarks;
	public int getSscMarks() {
		return sscMarks;
	}
	public void setSscMarks(int sscMarks) {
		this.sscMarks = sscMarks;
	}
	public int getSscTotalMarks() {
		return sscTotalMarks;
	}
	public void setSscTotalMarks(int sscTotalMarks) {
		this.sscTotalMarks = sscTotalMarks;
	}
	public int getHscMarks() {
		return hscMarks;
	}
	public void setHscMarks(int hscMarks) {
		this.hscMarks = hscMarks;
	}
	public int getHscTotalMarks() {
		return hscTotalMarks;
	}
	public void setHscTotalMarks(int hscTotalMarks) {
		this.hscTotalMarks = hscTotalMarks;
	}
	public int getDiplomaMarks() {
		return diplomaMarks;
	}
	public void setDiplomaMarks(int diplomaMarks) {
		this.diplomaMarks = diplomaMarks;
	}
	public int getDiplomaTotalMarks() {
		return diplomaTotalMarks;
	}
	public void setDiplomaTotalMarks(int diplomaTotalMarks) {
		this.diplomaTotalMarks = diplomaTotalMarks;
	}
	@Override
	public String toString() {
		return "AcademicDetailEntity [sscMarks=" + sscMarks + ", sscTotalMarks=" + sscTotalMarks + ", hscMarks="
				+ hscMarks + ", hscTotalMarks=" + hscTotalMarks + ", diplomaMarks=" + diplomaMarks
				+ ", diplomaTotalMarks=" + diplomaTotalMarks + "]";
	}
	public AcademicDetailEntity(int sscMarks, int sscTotalMarks, int hscMarks, int hscTotalMarks, int diplomaMarks,
			int diplomaTotalMarks) {
		super();
		this.sscMarks = sscMarks;
		this.sscTotalMarks = sscTotalMarks;
		this.hscMarks = hscMarks;
		this.hscTotalMarks = hscTotalMarks;
		this.diplomaMarks = diplomaMarks;
		this.diplomaTotalMarks = diplomaTotalMarks;
	}
	public AcademicDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
