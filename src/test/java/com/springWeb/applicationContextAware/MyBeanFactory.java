package com.springWeb.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年3月17日 下午7:46:20
 * @desc:
 * 
 */
public class MyBeanFactory implements ApplicationContextAware {
	public static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(MyBeanFactory.applicationContext == null){
			MyBeanFactory.applicationContext = applicationContext;
		}
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
}
