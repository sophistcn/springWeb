package com.springWeb.threadLocal;

import java.util.ArrayList;
import java.util.List;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午11:24:07 
* @desc: 
* 
*/
public class TestResource {
	public static void main(String[] args) {
		Resource resource = new Resource(1);
		List<ThreadConsumeRecourse> list = new ArrayList<ThreadConsumeRecourse>();
		for(int j=0;j<10;j++){
			ThreadConsumeRecourse t = new ThreadConsumeRecourse(resource);
			list.add(t);
		}
		
		for (ThreadConsumeRecourse testClient : list) {
			testClient.start();
		}
	}
}
