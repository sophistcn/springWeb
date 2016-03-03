package com.springWeb.mybatis.dao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springWeb.mybatis.model.Student;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 下午2:27:55 
* @desc: 
* 
*/
public class MybatisTest extends TestCase {
	@Test
	public void testName() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/spring4-mybatis-config.xml");
		SqlSessionFactoryBean sqlSessionFactoryBean = ctx.getBean(SqlSessionFactoryBean.class);
		SqlSession ss = sqlSessionFactoryBean.getObject().openSession();
		
		Student student = new Student();
		student.setId(2);
		student.setAddr("wwwwww");
		student.setBirthDate(new Date());
		student.setGrade(3);
		student.setName("wzp' where 1=1 ");
		student.setAge(28);
		
		ss.insert("com.springWeb.mybatis.mapper.StudentMapper.save", student);
		ss.commit();
		ss.close();
		
	}
}
