package com.clc.java.mvc.entity;

import javax.persistence.Entity;

@Entity
public class CourseEntity {
	private int courseId;
	private String courseName;
	private String section;
	private FeesEntity feesEntity;
	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", section=" + section
				+ ", feesEntity=" + feesEntity + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public FeesEntity getFeesEntity() {
		return feesEntity;
	}
	public void setFeesEntity(FeesEntity feesEntity) {
		this.feesEntity = feesEntity;
	}
	public CourseEntity(int courseId, String courseName, String section, FeesEntity feesEntity) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.section = section;
		this.feesEntity = feesEntity;
	}
	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
