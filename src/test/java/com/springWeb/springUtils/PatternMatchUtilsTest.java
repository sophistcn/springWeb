package com.springWeb.springUtils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.propertyeditors.PatternEditor;
import org.springframework.util.PatternMatchUtils;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午5:57:25 
* @desc: 
* 
*/
public class PatternMatchUtilsTest extends TestCase {
	@Test
	public void testName() throws Exception {
		PatternMatchUtils.simpleMatch("\\w+", "12345");
	}
}
