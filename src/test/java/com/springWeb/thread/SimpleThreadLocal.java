package com.springWeb.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月19日 下午2:33:07 
* @desc: 
* 
*/
public class SimpleThreadLocal {
	private Map valueMap = Collections.synchronizedMap(new HashMap());
	
	public void set(Object newValue){
		valueMap.put(Thread.currentThread(), newValue);
	}
	
	public Object get(){
		Thread currentThread = Thread.currentThread();
		Object o = valueMap.get(currentThread);
		
		if(o==null && !valueMap.containsKey(currentThread)){
			o = initialValue();
			valueMap.put(currentThread, o);
		}
		return o;
	}
	
	public void remove(){
		valueMap.remove(Thread.currentThread());
	}
	
	public Object initialValue(){
		return null;
	}
}
