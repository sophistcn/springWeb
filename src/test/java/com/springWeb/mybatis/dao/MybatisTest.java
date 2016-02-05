package com.springWeb.mybatis.dao;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		System.out.println(sqlSessionFactoryBean);
	}
}
