package com.JunitEx;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	CalculatorDemo cal=new CalculatorDemo();
	@Test
	public void testAdd() {
		
		Assert.assertEquals(15, cal.addition(5,10));
		
		
	}
	@Test
	public void testSub() {
		Assert.assertEquals(5, cal.Subtraction(10,5));
	}
	@Test
	public void testMul() {
		Assert.assertEquals(50, cal.multiplication(5,10));
	}
	@Test
	public void testDiv() {
		Assert.assertEquals(2, cal.division(10,5));
}

	@Test
	public void failTest() {
		Assert.assertEquals(10, cal.addition(5,10));
	}
}

