package com.springWeb.propertyPlaceHolder;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
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
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-property-place.xml");
		
		MyBean myBean = ctx.getBean(MyBean.class);
		System.out.println(myBean.toString());
		
		
	}
}
