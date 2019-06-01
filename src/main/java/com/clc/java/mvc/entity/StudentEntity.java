package com.clc.java.mvc.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="studEntity")
public class StudentEntity {
    @Id
    @GeneratedValue (strategy=GenerationType.TABLE)
	private int studentId;
	private String studentFirstName;
	private String studentMiddleName;
	private String studentLastName;
    private String studentFatherName;
	private String studentMotherName;
	private String studentGender;
	private int birthDate;
	@OneToOne(cascade= CascadeType.ALL)
    private AddressEntity addressEntity;
	@OneToOne(cascade= CascadeType.ALL)
    private AcademicDetailEntity academicDetailEntity;
	@OneToOne(cascade= CascadeType.ALL)
    private CourseEntity courseEntity;
	private int yearLevel;
	private String emailId;
	private long mobileNumber;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentMiddleName() {
		return studentMiddleName;
	}
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
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
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}
	public AcademicDetailEntity getAcademicDetailEntity() {
		return academicDetailEntity;
	}
	public void setAcademicDetailEntity(AcademicDetailEntity academicDetailEntity) {
		this.academicDetailEntity = academicDetailEntity;
	}
	public CourseEntity getCourseEntity() {
		return courseEntity;
	}
	public void setCourseEntity(CourseEntity courseEntity) {
		this.courseEntity = courseEntity;
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
		return "StudentEntity [studentId=" + studentId + ", studentFirstName=" + studentFirstName
				+ ", studentMiddleName=" + studentMiddleName + ", studentLastName=" + studentLastName
				+ ", studentFatherName=" + studentFatherName + ", studentMotherName=" + studentMotherName
				+ ", studentGender=" + studentGender + ", birthDate=" + birthDate + ", addressEntity=" + addressEntity
				+ ", academicDetailEntity=" + academicDetailEntity + ", courseEntity=" + courseEntity + ", yearLevel="
				+ yearLevel + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}
	public StudentEntity(int studentId, String studentFirstName, String studentMiddleName, String studentLastName,
			String studentFatherName, String studentMotherName, String studentGender, int birthDate,
			AddressEntity addressEntity, AcademicDetailEntity academicDetailEntity, CourseEntity courseEntity,
			int yearLevel, String emailId, long mobileNumber) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentMiddleName = studentMiddleName;
		this.studentLastName = studentLastName;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.studentGender = studentGender;
		this.birthDate = birthDate;
		this.addressEntity = addressEntity;
		this.academicDetailEntity = academicDetailEntity;
		this.courseEntity = courseEntity;
		this.yearLevel = yearLevel;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public StudentEntity() {
		
	}

	
	
}
