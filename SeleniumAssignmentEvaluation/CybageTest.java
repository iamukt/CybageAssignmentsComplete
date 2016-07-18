package com.session5.assignment9;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class CybageTest
{
	@Test
	public void test() throws InterruptedException
	{
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fp = profile.getProfile("selenium");
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		WebDriver wd = new FirefoxDriver(dc);
		wd.get("http://cybage.com/");
		Thread.sleep(1000);
		Actions act = new Actions(wd);
		act.moveToElement(wd.findElement(By.linkText("SERVICES"))).build().perform();
		wd.findElement(By.linkText("QA Processes")).click();
		//Thread.sleep(5000);
		/*WebDriverWait waitModifySearch = new WebDriverWait(wd, 30);
		waitModifySearch.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ctl00_PlaceHolderMain_LeftPageContent__ControlWrapper_RichHtmlField']/ul[2]/li")));
	*/
		FluentWait<WebDriver> waitF = new FluentWait<WebDriver>(wd)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement modifySearch = waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ctl00_PlaceHolderMain_LeftPageContent__ControlWrapper_RichHtmlField']/ul[2]/li")));
				
		List<WebElement> highlights = wd.findElements(By.xpath(".//*[@id='ctl00_PlaceHolderMain_LeftPageContent__ControlWrapper_RichHtmlField']/ul[2]/li"));
		for (WebElement webElement : highlights) 
		{
			System.out.println("Web "+webElement.getText());
		}
		Assert.assertEquals(6, highlights.size());       
		
		wd.get("http://www.seleniumhq.org/");
		wd.findElement(By.linkText("Download")).click();
		wd.findElement(By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a")).click();
	}
}
