package com.clc.java.mvc.bean;

import java.util.Date;

public class StudentBean {

	private int studentId;
	private String studentFullName;
	private String studentFatherName;
	private String studentMotherName;
	private String studentGender;
	private int birthDate;
    private AddressBean addressBean;
    private AcademicDetailBean academicDetailBean;
    private CourseBean courseBean;
	private int yearLevel;
	private String emailId;
	private long mobileNumber;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public String getStudentMotherName() {
		return studentMotherName;
	}
	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public AddressBean getAddressBean() {
		return addressBean;
	}
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	public AcademicDetailBean getAcademicDetailBean() {
		return academicDetailBean;
	}
	public void setAcademicDetailBean(AcademicDetailBean academicDetailBean) {
		this.academicDetailBean = academicDetailBean;
	}
	public CourseBean getCourseBean() {
		return courseBean;
	}
	public void setCourseBean(CourseBean courseBean) {
		this.courseBean = courseBean;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentFullName=" + studentFullName + ", studentFatherName="
				+ studentFatherName + ", studentMotherName=" + studentMotherName + ", studentGender=" + studentGender
				+ ", birthDate=" + birthDate + ", addressBean=" + addressBean + ", academicDetailBean="
				+ academicDetailBean + ", courseBean=" + courseBean + ", yearLevel=" + yearLevel + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + "]";
	}
	public StudentBean(int studentId, String studentFullName, String studentFatherName, String studentMotherName,
			String studentGender, int birthDate, AddressBean addressBean, AcademicDetailBean academicDetailBean,
			CourseBean courseBean, int yearLevel, String emailId, long mobileNumber) {
		super();
		this.studentId = studentId;
		this.studentFullName = studentFullName;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.studentGender = studentGender;
		this.birthDate = birthDate;
		this.addressBean = addressBean;
		this.academicDetailBean = academicDetailBean;
		this.courseBean = courseBean;
		this.yearLevel = yearLevel;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public StudentBean() {
	
	}
	
	
}
