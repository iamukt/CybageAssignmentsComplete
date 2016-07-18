package com.session5.assignment2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestW3School 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm2");
		wd.switchTo().frame("iframeResult");
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().accept();
		Assert.assertEquals("You pressed OK!", wd.findElement(By.xpath("//*[@id='demo']")).getText());
		
	
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().dismiss();
		Assert.assertEquals("You pressed Cancel", wd.findElement(By.xpath("//*[@id='demo']")).getText());
		
		
	}
}
