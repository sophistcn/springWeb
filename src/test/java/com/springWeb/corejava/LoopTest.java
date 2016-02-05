package com.springWeb.corejava;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月4日 上午11:46:11 
* @desc: 
* 
*/
public class LoopTest extends TestCase{
	@Test
	public void testName() throws Exception {
		String[] arr = (String[]) Arrays.asList("a","b").toArray();
		
		for (String string : arr) {
			System.out.println(string + "--");
		}
		
	}
}
