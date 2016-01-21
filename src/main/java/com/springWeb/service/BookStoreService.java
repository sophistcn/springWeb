package com.springWeb.service;

/**
 * @desc:
 * @date: 2016年1月20日 下午4:46:42
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public interface BookStoreService {
	/**
	 * 卖书
	 * @return
	 */
	public Integer sellBook();
	
	/**
	 * 进货
	 * @return
	 */
	public Integer addBook();
	
}
