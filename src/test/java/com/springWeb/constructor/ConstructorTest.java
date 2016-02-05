package com.springWeb.constructor;

import org.junit.Test;

import com.springWeb.BeanTestBase;
import com.springWeb.test.service.ErrorConstructorService;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月3日 下午2:46:44 
* @desc: 
* 
*/
public class ConstructorTest extends BeanTestBase{
	@Test
	public void testName() throws Exception {
		getContext().getBean(ErrorConstructorService.class);
	}
}
