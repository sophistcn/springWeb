package com.springWeb.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44 
 * @desc: 
 * 
 */
public class Test {
	@org.junit.Test
	public void testName() throws Exception {
//		JmsTemplate102
//		JmsTemplate
		
		org.springframework.context.ApplicationContext ctx  = new ClassPathXmlApplicationContext("spring/spring-jms.xml");
		ConnectionFactory conn = ctx.getBean(ActiveMQConnectionFactory.class);
		Connection conn1 = conn.createConnection();
		System.out.println(conn1.getClientID());
		
	}
}

