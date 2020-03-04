package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test {
	
	WebDriver d;
@BeforeTest
public void setUp() {
	//log.debug("czzofslfwg");
	log.info("------------------------Executing setUp method");
	/*FirefoxOptions options = new FirefoxOptions();
	options.setCapability("marionette", false);*/
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d = new ChromeDriver();
	log.info("------------------------browser opened");
	d.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	
	log.info("------------------------URL Launched");
	d.manage().window().maximize();
	log.info("------------------------Maximizing browser window");
}
@Test
public void test01() {
	log.error("error");
	log.debug("debug");
	log.fatal("fatal");
	log.info("------------------------Executing test case");
	d.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	log.info("------------------------Entering Username");
	d.findElement(By.id("password")).sendKeys("123456");
	log.info("------------------------Entering password");
	log.info("------------------------clicking on login button");
	d.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	log.info("------------------------navigated to home Page");
}
@AfterTest
public void tearDown() {
	log.info("------------------------Executing tear Down");
	log.info("------------------------Closing browser");
	d.close();
}
}
