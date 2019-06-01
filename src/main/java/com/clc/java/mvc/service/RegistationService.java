package com.clc.java.mvc.service;

import java.util.List;

import com.clc.java.mvc.bean.StudentBean;


public interface RegistationService {


	public boolean addStudent(StudentBean studentBean);
	public StudentBean getStudent(int studentId);
	public List<StudentBean> allStudent();
	public List<StudentBean> deleteStudent(int studentId);
	public StudentBean updateStudent (StudentBean studentBean);
	
	
}
