package com.springWeb.springUtils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.MethodInvoker;
import org.springframework.util.StringUtils;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午5:50:58 
* @desc: 
* 
*/
public class StringUtilsTest extends TestCase {
	@Test
	public void testName() throws Exception {
		System.out.println(StringUtils.containsWhitespace(" sdf sdfsdf "));
		System.out.println(StringUtils.arrayToCommaDelimitedString(new String[]{"sdfd","dsfsd","dsfsdf"}));
		
		
		MethodInvoker methodInvoker = new MethodInvoker();
		Object targetObject = null;
		methodInvoker.setTargetObject(targetObject);
		
		Assert.notNull(null, "null error");
		
		
		org.apache.commons.lang.StringUtils.isBlank("  ");
	}
}
