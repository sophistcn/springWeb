package com.springWeb.concurrent;

import java.util.Hashtable;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
public class ThreadPoolExecutorTest {
	@Test
	public void testName() throws Exception {
		int corePoolSize = 2;
		int maximumPoolSize = 70;
		long keepAliveTime = 10;
		TimeUnit unit = TimeUnit.MICROSECONDS;
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(3);
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue); 
		Hashtable<Integer,String> hashtable = new Hashtable<Integer, String>();
		for (int i=1;i<= maximumPoolSize; i++){
			try {
				String task = "task@ " + i;
				System.out.println("put " + task);
				threadPoolExecutor.execute(new ThreadPoolTask(task,hashtable));
				 Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadPoolTask implements  Runnable {
	// 保存任务所需要的数据
	private Object threadPoolTaskData;
	
	private Hashtable<Integer,String> resultTable;
	
	ThreadPoolTask(Object tasks, Hashtable<Integer, String> hashtable){
		this.threadPoolTaskData = tasks;
		this.resultTable = hashtable;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		 System.out.println("start .." + threadPoolTaskData);
		 resultTable.put(new Random().nextInt(100), (String) this.threadPoolTaskData);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadPoolTaskData = null;
		
		System.out.println(this.resultTable);
	}
}


