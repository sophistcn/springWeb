package com.springWeb.test.threadLocal;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月7日 下午11:08:04
 * @desc:
 * 
 */
public class TestClient extends Thread {
	private TestNum sn;

	public TestClient(TestNum sn) {
		super();
		this.sn = sn;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {// ④每个线程打出3个序列值
			System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
		}
	}
}
