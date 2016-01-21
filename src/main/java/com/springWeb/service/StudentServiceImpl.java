package com.springWeb.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.domain.Book;
import com.springWeb.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Student student) {
		if(StringUtils.isEmpty(student.getName())){
			throw new RuntimeException("名字不能为空");
		}
		sessionFactory.getCurrentSession().save(student);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Integer buyBooks(List<Book> list) {
		return null;
	}
	
}
