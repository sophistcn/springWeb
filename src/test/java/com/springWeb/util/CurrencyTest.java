package com.springWeb.util;

import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;

import org.hibernate.annotations.common.reflection.ReflectionUtil;
import org.junit.Test;
import org.springframework.util.ReflectionUtils;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月26日 下午3:18:51 
* @desc: 
* 
*/
public class CurrencyTest {
	@Test
	public void testName() throws Exception {
		Locale lc = Locale.JAPAN;
		lc = Locale.CHINA;
		lc = Locale.US;
		
		Currency cur = Currency.getInstance(lc);
		System.out.println(cur.getCurrencyCode());
		System.out.println(cur.getDisplayName());
		
		
		System.out.println(NumberFormat.getInstance().format(333333.33d));
		
		
		Currency currency = Currency.getInstance(Locale.FRANCE);
		System.out.println("France: " + currency.getSymbol());
	}
}
