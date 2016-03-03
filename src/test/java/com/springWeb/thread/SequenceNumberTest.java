package com.springWeb.thread;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月19日 下午2:45:20 
* @desc: 
* 
*/
public class SequenceNumberTest extends TestCase {
	@Test
	public void testnextSeqNum() throws Exception {
		SequenceNumber sn = new SequenceNumber();
		
		SequenceNumberThreadClient t1 = new SequenceNumberThreadClient(sn);
		SequenceNumberThreadClient t2 = new SequenceNumberThreadClient(sn);
		SequenceNumberThreadClient t3 = new SequenceNumberThreadClient(sn);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
