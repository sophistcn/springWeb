package com.springWeb.corejava;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月27日 上午10:16:09 
* @desc: 
* 
*/
public class ClassLoaderTest extends TestCase {
	@Test
	public void testName() throws Exception {
		ClassLoaderTest.class.getClassLoader().getResourceAsStream("spring/spring-ioc-config.xml");
	}
}
