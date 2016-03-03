package com.springWeb.ibatis.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.springWeb.domain.Student;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 上午10:14:18 
* @desc: 
* 
*/
public class StudentDaoImpl extends SqlMapClientDaoSupport implements StudentDao {

	public List<Student> getAllStudents(Student student) {
		return getSqlMapClientTemplate().queryForList("Student.getAllStudent",student);
	}

}
