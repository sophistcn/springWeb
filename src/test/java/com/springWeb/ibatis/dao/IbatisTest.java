package com.springWeb.ibatis.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibatis.sqlmap.client.SqlMapExecutor;
import com.mysql.jdbc.PreparedStatement;
import com.springWeb.domain.Student;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 上午10:19:28 
* @desc: 
* 
*/
public class IbatisTest extends TestCase {
	@Test
	public void testName() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ibatis/spring3-ibatis2-config.xml");
		StudentDao studentDao = ctx.getBean(StudentDao.class);
		Student student = new Student();
		student.setName("1231%' drop table gtsa_account or '1%' = '1");
		
		System.out.println(studentDao.getAllStudents(student));
		
	}
}
