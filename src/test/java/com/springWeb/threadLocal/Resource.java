package com.springWeb.threadLocal;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月7日 下午11:21:22 
* @desc: 
* 
*/
public class Resource {
	private Integer cnt;

	public Resource(Integer cnt) {
		this.setCnt(cnt);
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
}
