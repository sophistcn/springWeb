package com.springWeb.qualifier;

import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午3:47:32 
* @desc: 
* 
*/
@Service("MyIdProviderImpl2")
public class MyIdProviderImpl2 implements MyIdProvider {

	public String getId() {
		return MyIdProviderImpl2.class.getSimpleName();
	}

}
