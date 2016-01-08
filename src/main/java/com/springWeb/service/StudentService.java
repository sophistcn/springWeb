package com.springWeb.service;

import java.util.List;

import com.springWeb.domain.Book;
import com.springWeb.domain.Student;

public interface StudentService {
	void save(Student student);
	/**
	 * 
	 * @desc: student buy book 
	 * Jan 8, 2016 11:15:42 PM
	 * @param list
	 * @return
	 */
	Integer buyBooks(List<Book> list);
}
