package com.springWeb.math;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月25日 下午3:43:32
 * @desc:
 * 
 */
public class BigDecimalTest {
	@Test
	public void testName() throws Exception {
		BigDecimal bd = new BigDecimal("3.40256010353E12");
		System.out.println(bd.toPlainString());

		BigDecimal bd1 = new BigDecimal("232349239473249723492374923749234239724");
		System.out.println(bd1.toString());
		
		Double d = new Double(99999999999999999999.00022111);
		System.out.println(d.toString());
		
		System.out.println(new BigDecimal(d).toString());
		
	}
}
