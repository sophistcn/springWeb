package com.springWeb.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class MySessionListener implements HttpSessionListener {
	static{
		System.out.println(MySessionListener.class.getName());
	}
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession().toString());
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().toString());
	}

}
