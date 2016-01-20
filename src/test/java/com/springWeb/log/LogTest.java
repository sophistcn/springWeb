package com.springWeb.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

public class LogTest extends TestCase{
	private static final Logger log = LoggerFactory.getLogger(LogTest.class); 
	@Test
	public void testName() throws Exception {
		log.error(LogTest.class.getSimpleName(),new Exception("hehe"));
	}
}

