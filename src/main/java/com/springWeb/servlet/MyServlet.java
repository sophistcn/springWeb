package com.springWeb.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class MyServlet extends HttpServlet implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
