package com.springWeb.test.service;

import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午3:47:25 
* @desc: 
* 
*/
@Service("MyIdProviderImpl1")
public class MyIdProviderImpl1 implements MyIdProvider {

	public String getId() {
		// TODO Auto-generated method stub
		return MyIdProviderImpl1.class.getSimpleName();
	}

}
