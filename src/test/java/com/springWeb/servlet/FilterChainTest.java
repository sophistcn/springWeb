package com.springWeb.servlet;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月19日 下午12:22:51 
* @desc: 
* 
*/
public class FilterChainTest {
	private int count = 5;
	@Test
	public void testName() throws Exception {
		for (int i = 0; i < 4; i++) {
			reduceCount(this);
		}
	}
	
	public void reduceCount(FilterChainTest filterChainTest) {
		System.out.println(this.count);
		filterChainTest.count = this.count--;
		reduceCount(this);
	}
}
