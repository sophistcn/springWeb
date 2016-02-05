package com.springWeb.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.springWeb.DBTestBase;

/**
 * @desc:
 * @date: 2016年1月21日 上午11:05:10
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public class BookStoreServiceTest extends DBTestBase{
	@Test
	public void testName() throws Exception {
		getContext().getBean(BookStoreService.class).sellBook();
	}
}
