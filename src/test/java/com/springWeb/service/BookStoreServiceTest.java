package com.springWeb.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.springWeb.TestBase;

/**
 * @desc:
 * @date: 2016年1月21日 上午11:05:10
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public class BookStoreServiceTest extends TestBase{
	@Test
	public void testName() throws Exception {
		getContext().getBean(BookStoreService.class).sellBook();
	}
}
