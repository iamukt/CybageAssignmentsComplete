package com.session5.assignment3;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestW3Schools 
{
	@Test
	public void test()
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
		wd.switchTo().frame("iframeResult");
		
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().sendKeys("Martini");
		wd.switchTo().alert().accept();
		Assert.assertEquals("Excellent choice. Martini is good for your soul.", wd.findElement(By.xpath("//*[@id='demo']")).getText());
		
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().sendKeys("Cosmopolitan");
		wd.switchTo().alert().accept();
		Assert.assertEquals("Really? Are you sure the Cosmopolitan is your favorite?", wd.findElement(By.xpath("//*[@id='demo']")).getText());
		
		
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().sendKeys("Milk");
		wd.switchTo().alert().accept();
		Assert.assertEquals("I have never heard of that one..", wd.findElement(By.xpath("//*[@id='demo']")).getText());
		
		
	}
}
