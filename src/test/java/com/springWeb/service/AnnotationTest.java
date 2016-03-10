package com.springWeb.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springWeb.qualifier.ProviderConsumer;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午3:41:06 
* @desc: 
* 
*/
public class AnnotationTest {
	
	@Test
	public void testName() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application-config.xml");
		//System.out.println(ctx.getBeansOfType(MyIdProvider.class));
		System.out.println(((ProviderConsumer) ctx.getBean(ProviderConsumer.class)).getMyIdProvider());
	}
}
