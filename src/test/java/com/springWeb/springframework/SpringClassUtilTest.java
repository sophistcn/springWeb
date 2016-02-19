package com.springWeb.springframework;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.util.ClassUtils;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 下午4:43:26 
* @desc: 
* 
*/
public class SpringClassUtilTest extends TestCase {
	@Test
	public void testName() throws Exception {
		System.out.println(ClassUtils.matchesTypeName(this.getClass(), "SpringClassUtilTest"));
		
	}
}
