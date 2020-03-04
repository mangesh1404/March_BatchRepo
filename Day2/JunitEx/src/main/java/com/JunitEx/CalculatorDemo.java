package com.JunitEx;

public class CalculatorDemo {
		int sum, sub,mul,div;
		
	public int addition(int a, int b) {
		sum=a+b;
		return sum;
	}
	
	public int Subtraction(int a, int b) {
		sub=a-b;
		return sub;
	}
	
	public int multiplication(int a, int b) {
		mul=a*b;
		return mul;
	}
	
	public int division(int a, int b) {
		try {
		div=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return div;
	}
	
	
}
