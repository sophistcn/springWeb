package com.springWeb.util;

import static org.junit.Assert.*;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.ConvertUtils;
import org.junit.Test;

import com.springWeb.mybatis.model.Student;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月26日 下午6:11:58 
* @desc: 
* 
*/
public class BeanComparatorTest {
	@Test
	public void testName() throws Exception {
		Student stu = new Student();
		stu.setName("wzp3");
		
		Student stu2 = new Student();
		stu2.setName("wzp2");
		
		BeanComparator beanComparator = new BeanComparator("name");
		//System.out.println(beanComparator.compare(stu, stu2));
		
		//System.out.println(new BeanMap(stu).toString());
		
		ConvertUtils.convert(stu, String.class);
		
		System.out.println(stu);
		
	}
}
