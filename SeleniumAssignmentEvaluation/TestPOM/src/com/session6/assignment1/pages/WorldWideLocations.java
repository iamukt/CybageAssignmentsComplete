package com.session6.assignment1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class WorldWideLocations 
{
	private WebDriver wd;
	
	@FindBy(linkText="WORLDWIDE LOCATIONS")
	private WebElement worldwide;
	
	public WorldWideLocations() {
		System.out.println("hi");
	}
	public WorldWideLocations(WebDriver driver) 
	{
		wd = driver;
		System.out.println(worldwide);
	}
	public void TestWorldLocations()
	{
		System.out.println(worldwide);
		//wd.get("http://www.cybage.com");
		/*Long time1 = System.currentTimeMillis();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		worldwide.click();
		//wd.findElement(By.linkText("WORLDWIDE LOCATIONS")).click();
		wd.findElement(By.linkText("Germany")).click();
		Long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);*/
		
	}
}
