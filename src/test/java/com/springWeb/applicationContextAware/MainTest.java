package com.springWeb.applicationContextAware;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月17日 下午7:58:42 
* @desc: 
* 
*/
public class MainTest {
	@Test
	public void testContext() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ActualBean actualBean = MyBeanFactory.getApplicationContext().getBean(ActualBean.class);
		System.out.println(actualBean);
	}
}
