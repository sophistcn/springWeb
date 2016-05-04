package com.springWeb.concurrent;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class ThreadPoolTest {
	@Test
	public void testName() throws Exception {
		
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for(int i=1;i<100;i++){
			cachedThreadPool.execute(new Runnable() {
				public void run() {
					
				}
			});	
		}
		
		cachedThreadPool.shutdown();
	}
}

