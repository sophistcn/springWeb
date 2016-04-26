package com.springWeb.autowireTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
@Service("locator")
public class MyServiceLocator {
	@Autowired
	public MyInterface myInterface;

	public MyInterface getMyInterface() {
		return myInterface;
	}

	public void setMyInterface(MyInterface myInterface) {
		this.myInterface = myInterface;
	}
	
}
