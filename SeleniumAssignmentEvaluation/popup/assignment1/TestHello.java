package com.popup.assignment1;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHello 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.google.com");
		JavascriptExecutor js = ((JavascriptExecutor)wd);
		js.executeScript("alert('hello world')");
	}
}
