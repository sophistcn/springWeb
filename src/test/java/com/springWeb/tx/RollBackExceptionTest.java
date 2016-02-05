package com.springWeb.tx;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;

import com.springWeb.DBTestBase;
import com.springWeb.domain.Student;
import com.springWeb.service.StudentService;

/**
 * @desc:
 * @date: 2016年1月20日 下午2:32:58
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public class RollBackExceptionTest extends DBTestBase {
	@Test
	public void testName() throws Exception {
		Student student = new Student();
		student.setName("wzp" + DateFormatUtils.format(new Date()
				, "yyyy-MM-dd"));
		getContext().getBean(StudentService.class).save(student);
		
	}
}
