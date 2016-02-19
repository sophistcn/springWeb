package com.springWeb.springframework;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月5日 下午4:38:52 
* @desc: 
* 
*/
public class ApacheClassUtilTest extends TestCase{
	@Test
	public void testName() throws Exception {
		String str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getPackageName(this.getClass());
		str = ClassUtils.getShortClassName(this.getClass());

		List<String> list = ClassUtils.getAllInterfaces(this.getClass());
		
		System.out.println(str);
		
		System.out.println(list.toString());
	}
}
