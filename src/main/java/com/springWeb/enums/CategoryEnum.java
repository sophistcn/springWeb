package com.springWeb.enums;

/**
 * @desc:
 * @date: 2016年1月21日 上午11:30:41
 * @author: wuzhiping 
 * @mailto: sophistwu@outlook.com
 **/
public enum CategoryEnum {
	COMPUTER("001","计算机");
	
	String code;
	String text;
	private CategoryEnum(String code, String text) {
		this.code = code;
		this.text = text;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
