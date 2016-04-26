package com.springWeb.autowireTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class MainTest {
	@Test
	public void testName() throws Exception {
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("spring/spring-autowire-test.xml");
		//MyServiceLocator myServiceLocator = ctx.getBean(MyServiceLocator.class);
		
	}
}
