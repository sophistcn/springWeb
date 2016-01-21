package com.springWeb.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.domain.Book;

/**
 * @desc:
 * @date: 2016年1月21日 上午10:51:26
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	public SessionFactory sessionFactory;
	
	public void saveBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
	}
	
}
