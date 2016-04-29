package com.springWeb.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class MyFilter implements Filter {
	static{
		System.out.println(MyFilter.class.getName());
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
		System.out.println(filterConfig.toString());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(request.toString());
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
