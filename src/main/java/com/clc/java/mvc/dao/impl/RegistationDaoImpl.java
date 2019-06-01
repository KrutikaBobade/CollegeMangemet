package com.clc.java.mvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clc.java.mvc.dao.RegistationDao;
import com.clc.java.mvc.entity.StudentEntity;

@Repository
public class RegistationDaoImpl implements RegistationDao {
	@Autowired
	public SessionFactory sessionfactory;

	static {
		System.out.println("daoimpl load");
	}

	public boolean insertStudent(StudentEntity studentEntity) {
		System.out.println("insert student");

		Session session = null;
		Transaction tr = null;
		try {
			session = sessionfactory.openSession();
			System.out.println("session open");
			tr = session.beginTransaction();
			System.out.println("begin tr");
			return (Integer) session.save(studentEntity) > 0;
		} catch (Exception e) {
			System.out.println("catch block");
			return false;// TODO: handle exception
		} finally {
			System.out.println("finally block");
			closeResource(session, tr);
		}

	}

	private void closeResource(Session session, Transaction tr) {
		if (session != null) {
			if (tr != null) {
				session.flush();
				System.out.println("session flush");
				tr.commit();
				System.out.println("tr commit");
			}
			session.close();
		}

	}

	public StudentEntity fetchStudent(int studentId) {
		Session session = null;
		Transaction tr = null;
		try {
			session = sessionfactory.openSession();
			System.out.println("session open");
			tr = session.beginTransaction();
			System.out.println("begin tr");
			return session.get(StudentEntity.class,studentId);
		} catch (Exception e) {
			System.out.println("catch block");
			return null;// TODO: handle exception
		} finally {
			System.out.println("finally block");
			closeResource(session, tr);
		}
	
	}

	public List<StudentEntity> fetchAllStudent() {
		Session session =null;
		Transaction tr = null;
		try {
			session = sessionfactory.openSession();
			tr=session.beginTransaction();
			return session.createCriteria(StudentEntity.class).list();
		}catch(Exception e) {
			System.out.println("failed..get operation");
			return null;
		}finally {
			System.out.println("finally block");
			closeResource(session, tr);
		}
	}

	public List<StudentEntity> removeStudent(int studentId) {
		Session session =null;
		Transaction tr = null;
		try {
			session = sessionfactory.openSession();
			tr=session.beginTransaction();
			 session.remove(fetchStudent(studentId));
		}catch(Exception e) {
			System.out.println("failed..get operation");
			return null;
		}finally {
			System.out.println("finally block");
			closeResource(session, tr);
		}
		return fetchAllStudent();
	
	}

	public StudentEntity modifyStudent(StudentEntity studentEntity) {
		Session session =null;
		Transaction tr = null;
		try {
			session = sessionfactory.openSession();
			tr=session.beginTransaction();
			StudentEntity dbEntity = fetchStudent(studentEntity.getStudentId());
			 
				System.out.println("in try block of update");
				dbEntity.setBirthDate(studentEntity.getBirthDate());
				dbEntity.setEmailId(studentEntity.getEmailId());
				dbEntity.setMobileNumber(studentEntity.getMobileNumber());
				dbEntity.setStudentFatherName(studentEntity.getStudentFatherName());
				dbEntity.setStudentFirstName(studentEntity.getStudentFirstName());
				dbEntity.setStudentMiddleName(studentEntity.getStudentMiddleName());
				dbEntity.setStudentLastName(studentEntity.getStudentLastName());
				dbEntity.setStudentGender(studentEntity.getStudentGender());
				dbEntity.setStudentMotherName(studentEntity.getStudentMotherName());
				dbEntity.setYearLevel(studentEntity.getYearLevel());
			
			
			return fetchStudent(studentEntity.getStudentId());
		}catch(Exception e) {
			return null;
		}finally {
			System.out.println("finally block");
			closeResource(session, tr);
		}
		
	}
}
