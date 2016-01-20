package com.springWeb.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.domain.Book;

/**
 * @desc:
 * @date: 2016年1月20日 下午4:47:31
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
@Service
public class BookStoreServiceImpl implements BookStoreService {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer sellBook() {
		sessionFactory.getCurrentSession().save(new Book());
		return null;
		
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
