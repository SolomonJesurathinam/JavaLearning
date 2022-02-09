package com.test.learning;

import org.apache.logging.log4j.*;


public class loggiunh {

	static Logger log = LogManager.getLogger(loggiunh.class.getName());
	
public static void main(String[] args) {
		System.out.println("testing");
		log.info("test");
	}
}
