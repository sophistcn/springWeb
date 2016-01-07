package com.springWeb.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午3:56:39 
* @desc: 
* 
*/
@Service
public class ProviderConsumer {
	@Autowired
	@Qualifier(value="MyIdProviderImpl1")
	private MyIdProvider myIdProvider;

	public MyIdProvider getMyIdProvider() {
		return myIdProvider;
	}

	public void setMyIdProvider(MyIdProvider myIdProvider) {
		this.myIdProvider = myIdProvider;
	}
	
}
