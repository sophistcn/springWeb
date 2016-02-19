package com.springWeb.util;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月17日 下午12:05:13 
* @desc: 
* 
*/
public class StringToMapUtil extends TestCase{
	public static Map convertStringToMap(String string) {
		Pattern pattern = Pattern.compile("\\,\\w+=\\,\\s");
		Matcher matcher = pattern.matcher(string);
		
		System.out.println(matcher.group());
		
		return null;
	}
	
	@Test
	public void testName() throws Exception {
		String string ="[{postScript=1资金调拨，下拨, currencyCode=EUR, direction=2, opBranchName=null, hostId=ZGZTCNB0AXX154511452500746213C, ticketNumber=2352352345sddf30, date=Tue Feb 16 00:00:00 GMT+08:00 2016, amount=140.22, id=1266, balance=244355.00, bankNo=01, accountName=九恒星财务公司（欧元-国内主）, accountNumber=0000000000000002, hostTime=Tue Feb 16 00:00:00 GMT+08:00 2016, transType=, opAccountName=null, accountInnerNumber=null, recerivedTime=Wed Feb 17 11:15:53 GMT+08:00 2016, accountInnerName=null, ticketType=null, explain=S1G141309D0000110-00007-80, comment=88, opAccountNumber=null}]";
		convertStringToMap(string);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("postScript", "1资金调拨，下拨");
		map.put("currencyCode", "EUR");
		map.put("direction", "2");
		map.put("opBranchName", null);
		map.put("hostId", "ZGZTCNB0AXX154511452500746213C");
		map.put("ticketNumber", "2352352345sddf30");
		map.put("date", "Tue Feb 16 00:00:00 GMT+08:00 2016");
		map.put("amount", "140.22");
		map.put("id", "1266");
		map.put("balance", "244355");
		map.put("bankNo", "1");
		map.put("accountName", "九恒星财务公司（欧元-国内主）");
		map.put("accountNumber", "2");
		map.put("hostTime", "Tue Feb 16 00:00:00 GMT+08:00 2016");
		map.put("transType", "");
		map.put("opAccountName", null);
		map.put("accountInnerNumber", null);
		map.put("recerivedTime", "Wed Feb 17 11:15:53 GMT+08:00 2016");
		map.put("accountInnerName", null);
		map.put("ticketType", null);
		map.put("explain", "S1G141309D0000110-00007-80");
		map.put("comment", "88");
		map.put("opAccountNumber", null);
		
	}
}
