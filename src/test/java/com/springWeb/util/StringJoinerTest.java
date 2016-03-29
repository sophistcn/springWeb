package com.springWeb.util;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年3月26日 下午3:36:25
 * @desc:
 * 
 */
public class StringJoinerTest {
	@Test
	public void testName() throws Exception {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		String desiredString = sj.toString();

		System.out.println(desiredString);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	//	String commaSeparatedNumbers = numbers.stream().map(numbers.toString()).collect(Collectors.joining(", "));

	}
}
