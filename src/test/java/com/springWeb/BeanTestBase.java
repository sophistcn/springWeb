package com.springWeb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月3日 下午2:54:39 
* @desc: 
* 
*/
public abstract class BeanTestBase extends TestCase {
	public ApplicationContext getContext(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application-config.xml");
		return ctx;
	}
}
