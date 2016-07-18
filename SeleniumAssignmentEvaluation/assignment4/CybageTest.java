package com.assignment4;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CybageTest
{
	@Test
	public void Test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.cybage.com");
		wd.findElement(By.linkText("WORLDWIDE LOCATIONS")).click();
		wd.findElement(By.className("global-search-link")).click();
		wd.findElement(By.id("txtSearch")).sendKeys("Automation");
		wd.findElement(By.className("global-search-button")).click();
		List<WebElement> list = wd.findElements(By.className("search-results-panel"));
		Thread.sleep(1000);
		System.out.println("No of results found is: "+list.size());
		wd.findElement(By.xpath(".//*[@id='searchResultsOuterDiv']/div[1]/a")).click();
	}
}
