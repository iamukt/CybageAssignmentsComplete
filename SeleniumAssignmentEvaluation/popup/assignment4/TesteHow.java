package com.popup.assignment4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteHow 
{
	@Test
	public void test()
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.ehow.com");
		wd.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor)wd);
		js.executeScript("window.scrollTo(0,1800)");
		Actions act = new Actions(wd);
		wd.findElement(By.xpath("//*[@id='Footer']/div[1]/div/div/div[3]/div/div[2]/ul/li[3]/a")).click();
		//act.build().perform();
	}
}
