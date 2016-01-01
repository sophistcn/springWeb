package com.springWeb.service;

import java.util.Date;
import java.util.Random;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springWeb.domain.Student;

import junit.framework.TestCase;

public class StudentServiceTest extends TestCase{
	@Test
	public void testName() throws Exception {
		Student student = generateRandomStudent();
		//saveStudentTest();
		getContext().getBean(StudentService.class).save(student);
	}

	private Student generateRandomStudent() {
		Integer i = new Random().nextInt(10000);
		Student student = new Student();
		student.setAddr(i+"addr");
		student.setAge(i);
		student.setBirthDate(new Date());
		student.setGrade(new Random().nextInt(7));
		student.setName(i+"name");
		return student;
	}

	private void saveStudentTest() {
		ApplicationContext ctx = getContext();
		getSessionFactory(ctx).getCurrentSession().save(new Student());
	}

	private ApplicationContext getContext() {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("spring/spring-ioc-config.xml");
		return ctx;
	}

	private SessionFactory getSessionFactory(ApplicationContext ctx) {
		return ctx.getBean(SessionFactory.class);
	}
}
