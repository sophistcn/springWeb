package com.springWeb.thread;

import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月15日 上午10:15:29 
* @desc: 
* 
*/
public class ThreadTest extends TestCase {
	@Test
	public void testName() throws Exception {
		String str = "bbb";
		System.out.println("before : " + new Date());
		str.wait(2000);
		
		System.out.println("after : " + new Date());
		
	}
}
