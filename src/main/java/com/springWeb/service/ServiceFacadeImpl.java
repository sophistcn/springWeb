package com.springWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.domain.Student;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月25日 下午3:44:23 
* @desc: 
* 
*/
@Service
public class ServiceFacadeImpl implements ServiceFacade {
	@Autowired
	private FootBallService footBallService;

	public void playFootBall(Student student) {
		footBallService.fly();
	}

	public FootBallService getFootBallService() {
		return footBallService;
	}

	public void setFootBallService(FootBallService footBallService) {
		this.footBallService = footBallService;
	}
	
	
}
