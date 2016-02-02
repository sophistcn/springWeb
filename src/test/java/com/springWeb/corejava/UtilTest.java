package com.springWeb.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月26日 下午6:44:34 
* @desc: 
* 
*/
public class UtilTest extends TestCase {
	@Test
	public void testName() throws Exception {
		String[] a = {"b","bb","bbb"};
		List<String> list = new ArrayList<String>();
		
		fromArrayToCollection(a, list);
		
		System.out.println(list.toString());
	}
	
	public <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T t : a) {
			c.add(t);
		}
	} 
	
}
