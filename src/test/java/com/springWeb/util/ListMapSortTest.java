package com.springWeb.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年3月22日 上午10:21:30
 * @desc:
 * 
 */
public class ListMapSortTest {
	@Test
	public void testName() throws Exception {

		List<Map> listMap = new ArrayList<Map>();

		for (int i = 0; i < 100; i++) {
			Map m = new HashMap();
			m.put("accNo", "aaa" + new Random().nextDouble());
			m.put("accName", "name" + new Random().nextLong());
			listMap.add(m);
		}
		
		Collections.sort(listMap, new myComparatorAsc());
		
		System.out.println(listMap);

		Collections.sort(listMap, new myComparatorDesc());
		
		System.out.println(listMap);
		
	}
}

class myComparatorAsc implements Comparator {

	public int compare(Object o1, Object o2) {
		Map m1 = (Map) o1, m2 = (Map) o2;
		String accNo =  (String) m1.get("accNo");
		String accNo2 = (String) m2.get("accNo");
		return accNo.compareTo(accNo2);
	}

}


class myComparatorDesc implements Comparator {

	public int compare(Object o1, Object o2) {
		Map m1 = (Map) o1, m2 = (Map) o2;
		String accNo =  (String) m1.get("accNo");
		String accNo2 = (String) m2.get("accNo");
		return accNo2.compareTo(accNo);
	}

}