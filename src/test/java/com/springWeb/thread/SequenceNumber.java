package com.springWeb.thread;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月19日 下午2:43:11 
* @desc: 
* 
*/
public class SequenceNumber {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	public int getNextNum(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
}
