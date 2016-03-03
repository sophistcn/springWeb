package com.springWeb.exception;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年2月22日 上午10:28:58 
* @desc: 
* 
*/
public class MyFunctionWithException {
	/**
	 * 
	 * 
	 * @author: 吴志平
	 * @desc: runtime不一定要处理 
	 * @date: 2016年2月22日 上午10:30:16
	 */
	public void showName(){
		throw new RuntimeException("hehe");
	}
	
	/**
	 * 
	 * @throws Exception
	 * @author: 吴志平
	 * @desc: 看到了吗，exception必须处理 
	 * @date: 2016年2月22日 上午10:29:58
	 */
	public void showNameException() throws Exception{
		throw new Exception("aaa");
	}
}
