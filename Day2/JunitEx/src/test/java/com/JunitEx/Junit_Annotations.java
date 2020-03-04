package com.JunitEx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Annotations {

	@Before
	public void test01() {
		System.out.println("am in Before Annotation ");
	}
	
	@BeforeClass
	public static void test02() {
		System.out.println("am in BeforeClass Annotation ");
	}
	@After
	public void test03() {
		System.out.println("am in After Annotation ");
	}
	@AfterClass
	public static  void test04() {
		System.out.println("am in Afterclass Annotation");
	}
	@Test
	public void test05() {
		System.out.println("am in Test1 Annotation ");
	}
	
	@Test
	public void test06() {
		System.out.println("am in Test2 Annotation ");
	}
}
