package com.springWeb.test.service;

import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月3日 下午2:47:32 
* @desc: 
* 
*/
@Service
public class ErrorConstructorService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ErrorConstructorService(String name) {
		this.name = name;
	}

	public ErrorConstructorService() {
		
	}
}
