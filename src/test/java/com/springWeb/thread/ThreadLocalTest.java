package com.springWeb.thread;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月19日 下午2:24:50 
* @desc: 
* 
*/
public class ThreadLocalTest extends TestCase{
	@Test
	public void testThreadLocal() throws Exception {
		
	}
}


class MyThread extends Thread{
	private static ThreadLocal<User> threadLocalUser;

	public MyThread() {
		
	}
	
	
}