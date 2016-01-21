package com.springWeb.service;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.constants.Constants;
import com.springWeb.domain.Book;
import com.springWeb.domain.Student;
import com.springWeb.enums.CategoryEnum;

/**
 * @desc:
 * @date: 2016年1月20日 下午4:47:31
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
@Service
public class BookStoreServiceImpl implements BookStoreService {
	private static final Logger log = LoggerFactory.getLogger(BookStoreService.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private StudentService studentService;
	@Autowired
	private BookService bookService;
	
	public Integer sellBook() {
		Student student = new Student();
		//student.setName(Constants.NAME + DateFormatUtils.format(new Date(), "yyyy-MM-dd"));
		student.setAge(new Random().nextInt(100));
		student.setBirthDate(DateUtils.addDays(new Date(), new Random().nextInt(50)));
		student.setGrade(new Random().nextInt(12));
		student.setAddr("北京，海淀");
		
		try {
			studentService.save(student);
		} catch (Exception e) {
			log.error(BookStoreService.class.getName(),e);
		}

		Book book = new Book();
		book.setBookName("Thinking in java, The " + new Random().nextInt(7) + "th edition");
		book.setCategory(CategoryEnum.COMPUTER.getCode());
		book.setIsbn("isbn" + new Random().nextInt(1000));
		book.setPrice(new Random().nextDouble());
		book.setSaveDate(new Date());
		
		bookService.saveBook(book);
		
		log.debug("after save book");
		
		//购买了几本
		return 0;
		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public Integer addBook() {
		
		return null;
	}

}
