package com.springWeb.annotation;

import org.junit.Test;

import com.springWeb.DBTestBase;
import com.springWeb.domain.Student;
import com.springWeb.service.ServiceFacade;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class AutoWireTest extends DBTestBase {
	@Test
	public void testName() throws Exception {
		getContext().getBean(ServiceFacade.class).playFootBall(new Student());
	}
}
