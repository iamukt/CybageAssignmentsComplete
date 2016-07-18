package com.session5.assignment7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTest 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.makemytrip.com/");
		wd.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		wd.findElement(By.id("from_city_data_box")).sendKeys("pune");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(wd);
		act.click(wd.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[1]/p"))).build().perform();;
	}
}
