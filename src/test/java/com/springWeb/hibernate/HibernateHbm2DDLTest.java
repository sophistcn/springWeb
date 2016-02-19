package com.springWeb.hibernate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月15日 上午11:44:00 
* @desc: 
* 
*/
public class HibernateHbm2DDLTest extends TestCase {
	@Test
	public void testName() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring4-ioc-config.xml");
		ctx.getBean("sessionFactory");
	}
}
