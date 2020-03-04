package org.JBK;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.tests.Login_Test;

public class Log4jDemo {
	static Logger log = Logger.getLogger(Log4jDemo.class);
	static int i= 10;
	static int j=0;
	static int sum;
	static int div;
	public static int addition() {
		sum=i+j;
		return sum;
		//Assert.assertEquals(sum, 10);
	}
	public static int division() {
		log.info("please do not enter diviser as Zero");
		try {
			div=i/j;
		}catch(ArithmeticException e) {
			log.fatal("user enetered diviser as zero");
			log.info("");
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		
		addition();
		
		
		
		
		
		
	}
	
	
	
}
