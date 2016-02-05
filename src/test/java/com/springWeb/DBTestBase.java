package com.springWeb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
 * @desc:
 * @date: 2016年1月20日 下午2:34:05
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public abstract class DBTestBase extends TestCase{
	public ApplicationContext getContext() {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("spring/spring-ioc-config.xml");
		return ctx;
	}
}
