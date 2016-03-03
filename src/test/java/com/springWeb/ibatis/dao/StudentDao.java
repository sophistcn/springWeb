package com.springWeb.ibatis.dao;

import java.util.List;

import com.springWeb.domain.Student;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 上午10:13:28 
* @desc: 
* 
*/
public interface StudentDao {
	List<Student> getAllStudents(Student student);
}
