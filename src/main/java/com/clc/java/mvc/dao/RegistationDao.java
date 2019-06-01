package com.clc.java.mvc.dao;

import java.util.List;


import com.clc.java.mvc.entity.StudentEntity;

public interface RegistationDao {

	public boolean insertStudent(StudentEntity studentEntity);
	public StudentEntity fetchStudent(int studentId);
	public List<StudentEntity> fetchAllStudent();
	public List<StudentEntity> removeStudent(int studentId);
	public StudentEntity modifyStudent (StudentEntity studentEntity);
	
}
