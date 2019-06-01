package com.clc.java.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clc.java.mvc.bean.StudentBean;
import com.clc.java.mvc.dao.impl.RegistationDaoImpl;
import com.clc.java.mvc.entity.StudentEntity;
import com.clc.java.mvc.service.RegistationService;

@Service
public class RegistationServiceImpl implements RegistationService {
	@Autowired
	public RegistationDaoImpl registationdao;
	static {
		System.out.println("service impl load");
	}

	public boolean addStudent(StudentBean studentBean) {
		StudentEntity entity = beanToEntity(studentBean);

		return registationdao.insertStudent(entity);
	}

	private StudentEntity beanToEntity(StudentBean studentBean) {
		StudentEntity entity = new StudentEntity();
		String name[] = studentBean.getStudentFullName().split(" ");
		entity.setStudentFirstName(name[0]);
		entity.setStudentMiddleName(name[1]);
		entity.setStudentLastName(name[2]);
		entity.setBirthDate(studentBean.getBirthDate());
		entity.setEmailId(studentBean.getEmailId());
		entity.setMobileNumber(studentBean.getMobileNumber());
		entity.setStudentId(studentBean.getStudentId());
		entity.setStudentMotherName(studentBean.getStudentMotherName());
		entity.setStudentFatherName(studentBean.getStudentFatherName());
		entity.setStudentGender(studentBean.getStudentGender());
		entity.setYearLevel(studentBean.getYearLevel());
		entity.getAcademicDetailEntity().setDiplomaMarks(studentBean.getAcademicDetailBean().getDiplomaMarks());
		entity.getAcademicDetailEntity()
				.setDiplomaTotalMarks(studentBean.getAcademicDetailBean().getDiplomaTotalMarks());
		entity.getAcademicDetailEntity().setHscMarks(studentBean.getAcademicDetailBean().getHscMarks());
		entity.getAcademicDetailEntity().setHscTotalMarks(studentBean.getAcademicDetailBean().getHscTotalMarks());
		entity.getAcademicDetailEntity().setSscMarks(studentBean.getAcademicDetailBean().getSscMarks());
		entity.getAcademicDetailEntity().setSscTotalMarks(studentBean.getAcademicDetailBean().getSscTotalMarks());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setAddressDetail(studentBean.getAddressBean().getPermanentAddressBean().getAddressDetail());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setCityName(studentBean.getAddressBean().getPermanentAddressBean().getCityName());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setPinCode(studentBean.getAddressBean().getPermanentAddressBean().getPinCode());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setState(studentBean.getAddressBean().getPermanentAddressBean().getState());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setTalukaName(studentBean.getAddressBean().getPermanentAddressBean().getTalukaName());
		entity.getAddressEntity().getPermanentAddressEntity()
				.setVillageName(studentBean.getAddressBean().getPermanentAddressBean().getVillageName());
		entity.getAddressEntity().getTempAddressEntity()
				.setAddressDetail(studentBean.getAddressBean().getTempAddressBean().getAddressDetail());
		entity.getAddressEntity().getTempAddressEntity()
				.setCityName(studentBean.getAddressBean().getTempAddressBean().getCityName());
		entity.getAddressEntity().getTempAddressEntity()
				.setPinCode(studentBean.getAddressBean().getTempAddressBean().getPinCode());
		entity.getAddressEntity().getTempAddressEntity()
				.setState(studentBean.getAddressBean().getTempAddressBean().getState());
		entity.getAddressEntity().getTempAddressEntity()
				.setTalukaName(studentBean.getAddressBean().getTempAddressBean().getTalukaName());
		entity.getAddressEntity().getTempAddressEntity()
				.setVillageName(studentBean.getAddressBean().getTempAddressBean().getVillageName());
		entity.getCourseEntity().setCourseId(studentBean.getCourseBean().getCourseId());
		entity.getCourseEntity().setCourseName(studentBean.getCourseBean().getCourseName());
		entity.getCourseEntity().setSection(studentBean.getCourseBean().getSection());
		entity.getCourseEntity().getFeesEntity().setPaidFees(studentBean.getCourseBean().getFeesBean().getPaidFees());

		return entity;
	}

	public StudentBean getStudent(int studentId) {

		return entityToBean(registationdao.fetchStudent(studentId));
	}

	private StudentBean entityToBean(StudentEntity fetchStudent) {
		StudentBean bean = new StudentBean();
		bean.setBirthDate(fetchStudent.getBirthDate());
		bean.setEmailId(fetchStudent.getEmailId());
		bean.setMobileNumber(fetchStudent.getMobileNumber());
		bean.setStudentFatherName(fetchStudent.getStudentFatherName());
		bean.setStudentFullName(fetchStudent.getStudentFirstName()+" "+fetchStudent.getStudentMiddleName()+" "+fetchStudent.getStudentLastName());
		bean.setStudentGender(fetchStudent.getStudentGender());
		bean.setStudentId(fetchStudent.getStudentId());
		bean.setStudentMotherName(fetchStudent.getStudentMotherName());
		bean.setYearLevel(fetchStudent.getYearLevel());
	
		
		
		
		return bean;
	}

	public List<StudentBean> allStudent() {

		return entitiesToBeans(registationdao.fetchAllStudent());
	}

	private List<StudentBean> entitiesToBeans(List<StudentEntity> fetchAllStudent) {
		List<StudentBean> beans = new ArrayList<StudentBean>();
		for (StudentEntity studentEntity : fetchAllStudent) {
			beans.add(entityToBean(studentEntity));
		}
		
		return beans;
	}

	public List<StudentBean> deleteStudent(int studentId) {

		return entitiesToBeans(registationdao.removeStudent(studentId));
	}


	public StudentBean updateStudent(StudentBean studentBean) {

		return entityToBean(registationdao.modifyStudent(beanToEntity(studentBean)));
	}
}
