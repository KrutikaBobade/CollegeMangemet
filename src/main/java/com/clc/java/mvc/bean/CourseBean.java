package com.clc.java.mvc.bean;

public class CourseBean {
	
	private int courseId;
	private String courseName;
	private String section;
	private FeesBean feesBean;
	@Override
	public String toString() {
		return "CourseBean [courseId=" + courseId + ", courseName=" + courseName + ", section=" + section
				+ ", feesBean=" + feesBean + "]";
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
	public FeesBean getFeesBean() {
		return feesBean;
	}
	public void setFeesBean(FeesBean feesBean) {
		this.feesBean = feesBean;
	}
	public CourseBean(int courseId, String courseName, String section, FeesBean feesBean) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.section = section;
		this.feesBean = feesBean;
	}
	public CourseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
