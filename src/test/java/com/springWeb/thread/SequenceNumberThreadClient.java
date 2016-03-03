package com.springWeb.thread;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月19日 下午2:47:39 
* @desc: 
* 
*/
public class SequenceNumberThreadClient extends Thread{
	private SequenceNumber sn;

	public SequenceNumberThreadClient(SequenceNumber sn) {
		super();
		this.sn = sn;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "--------->" +  sn.getNextNum());
		}
	}
}
