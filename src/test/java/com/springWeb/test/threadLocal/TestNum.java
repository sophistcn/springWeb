package com.springWeb.test.threadLocal;

import java.util.ArrayList;
import java.util.List;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午11:05:18 
* @desc: 
* 
*/
public class TestNum {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	public int getNextNum(){
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
	
	public static void main(String[] args) {
		TestNum sn = new TestNum();
		
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		
		List<TestClient> list = new ArrayList<TestClient>();
		for(int j=0;j<10;j++){
			TestClient t = new TestClient(sn);
			list.add(t);
		}
		
		for (TestClient testClient : list) {
			testClient.start();
		}
	}
}
