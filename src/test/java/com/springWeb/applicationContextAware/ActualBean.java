package com.springWeb.applicationContextAware;

import org.springframework.stereotype.Service;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月17日 下午7:56:58 
* @desc: 
* 
*/
@Service
public class ActualBean {
	static {
		System.out.println("actual bean init....");
	}
}
