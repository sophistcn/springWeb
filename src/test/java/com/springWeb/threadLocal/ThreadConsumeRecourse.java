package com.springWeb.threadLocal;

import java.util.Random;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午11:22:15 
* @desc: 
* 
*/
public class ThreadConsumeRecourse extends Thread{
	private static ThreadLocal<Resource> resourceThreadLocal = new ThreadLocal<Resource>();
	private Resource resource;
	
	public ThreadConsumeRecourse(Resource resource) {
		resourceThreadLocal.set(resource);
	}

	public void run() {
		resourceThreadLocal.get().setCnt(new Random().nextInt(1000));
		System.out.println(Thread.currentThread().getName() + " | " + resourceThreadLocal.get().getCnt());
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public ThreadLocal<Resource> getResourceThreadLocal() {
		return resourceThreadLocal;
	}

	public void setResourceThreadLocal(ThreadLocal<Resource> resourceThreadLocal) {
		this.resourceThreadLocal = resourceThreadLocal;
	}
}
