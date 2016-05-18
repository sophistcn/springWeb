package com.springWeb.concurrent;

import java.util.Hashtable;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
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
		//LinkedBlockingDeque
		int corePoolSize = 2;
		int maximumPoolSize = 7000;
		long keepAliveTime = 10;
		TimeUnit unit = TimeUnit.MICROSECONDS;
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(3);
		//ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		
		ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(50);
		Hashtable<Integer,String> hashtable = new Hashtable<Integer, String>();
		
		long start = System.nanoTime();
		for (int i=1;i<= maximumPoolSize; i++){
			try {
				String task = "task@ " + i;
				System.out.println("put " + task);
				threadPoolExecutor.submit(new ThreadPoolTask(task,hashtable));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//threadPoolExecutor.shutdown();
		//threadPoolExecutor.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
		
		System.out.println(System.nanoTime() - start);
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
		threadPoolTaskData = null;
		
		System.out.println(this.resultTable);
	}
}


