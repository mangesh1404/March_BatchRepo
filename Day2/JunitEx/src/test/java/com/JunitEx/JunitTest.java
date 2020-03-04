package com.JunitEx;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {
	ActionUtils action= new ActionUtils();
	WebDriver driver;
	@Test
	public void test01() {
		System.setProperty("webdirver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
		WebElement uname= driver.findElement(By.id("email"));
		action.click(uname);
		action.enterText(uname,action.getdata("login",0,0));
		WebElement pass= driver.findElement(By.id("password"));
		action.click(pass);
		action.enterText(pass,action.getdata("login",0,1));
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		action.click(login);
		driver.close();
		
	}
	
	
	
    
}
