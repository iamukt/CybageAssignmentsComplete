package com.session6.classdemo;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.jetty.html.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Assignment 
{
	@Test
	public void test() throws InterruptedException
	{
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fp = profile.getProfile("default");
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		dc.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver wd = new FirefoxDriver(dc);
		/*System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		*/
		wd.get("https://www.ecwid.com/in/demo");
		wd.manage().window().maximize();
		
		FluentWait<WebDriver> waitF = new FluentWait<WebDriver>(wd)
				.withTimeout(2000, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(ElementNotVisibleException.class,NoSuchElementException.class);
		WebElement search = waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ecwid-search']/div/input")));
		
		search.sendKeys("Toy");
		
		waitF.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ecwid-search']/div/button"))).click();
		
		WebElement searchCount = waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div[3]/div/div[1]/div")));
		
		String noOfSearchResult = searchCount.getText();
		/*String noOfSearchResult = "Showing 1-5 of 21 results";*/
		/*System.out.println("Search Result String: "+noOfSearchResult);
		String count=null;
		StringTokenizer str = new StringTokenizer(noOfSearchResult," ");
		try
		{
			System.out.println("Executed");
			while(str.hasMoreTokens())
			{
				System.out.println(count);
				str.nextToken(" ");
				count = str.nextToken(" ");
			}
		}catch(NoSuchElementException no)
		{
			System.out.println("Exeception Occured"+ count);
		}
		Assert.assertEquals(21,count);*/
		
		//Selecting Low to High
		
		new Actions(wd).click(wd.findElement(By.className("gwt-ListBox"))).build().perform();
		new Actions(wd).moveToElement(waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div[3]/div/div[2]/div[2]/select/option[3]")))).click().build().perform();	
		Thread.sleep(1000);
		new Actions(wd).click(waitF.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div[3]/table/tbody/tr[1]/td/div/div/table/tbody/tr[4]/td[3]/div/div[1]/a")))).build().perform();
		//WebElement quantity = wd.findElement(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div/div[13]/table/tbody/tr[1]/td/div/div/input"));
		WebElement quantity1 = waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div/div[13]/table/tbody/tr[1]/td/div/div/input")));
		quantity1.clear();
		quantity1.sendKeys("20");
		new Actions(wd).click(waitF.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath(".//*[@id='ecwid-products']/div/div/div/div/table/tbody/tr[2]/td/div/div/div/div[3]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div/table[1]/tbody/tr/td/div/div/button")
				))).build().perform();
				
				//By.tagName("button"))).click();
		//wd.findElement(By.tagName("button")).click();
		//wd.close();
		
		
	}

}
