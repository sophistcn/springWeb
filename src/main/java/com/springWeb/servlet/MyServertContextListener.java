package com.springWeb.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class MyServertContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(sce.getServletContext().getAttributeNames().nextElement());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
