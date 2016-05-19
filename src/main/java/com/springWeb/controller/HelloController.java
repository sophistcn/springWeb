package com.springWeb.controller;

import java.math.BigDecimal;

import org.apache.activemq.protobuf.compiler.TextFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:43:32 
* @desc: 
* 
*/
@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/hi")
	public String sayHi(){
		return "hi";
	}
	
	@RequestMapping("/saveHi")
	public String saveHi(Double amount){
		System.out.println(BigDecimal.valueOf(amount));
		System.out.println(amount);
		return "success";
	}
}
