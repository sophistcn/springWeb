package com.springWeb.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
