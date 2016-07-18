package com.session6.practice;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DragAndDrop 
{
	
	/*WebDriver wd;
	
	@Before
	public void beforeTest()
	{
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setEnableNativeEvents(true);
		wd = new FirefoxDriver(fp);
	}*/
	
	/*@Test
	public void dragAndDropExample() throws InterruptedException
	{
		wd.get("http://jqueryui.com/droppable/");
		wd.manage().window().maximize();
		wd.switchTo().frame(0);
		wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement dragElement = wd.findElement(By.id("draggable"));
		WebElement dropElement = wd.findElement(By.id("droppable"));
		
		
		Actions builder = new Actions(wd);
		Action dragAndDrop = builder.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build();
		dragAndDrop.perform();
		
		wd.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
		wd.manage().window().maximize();
		
	//	wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebElement target1 = wd.findElement(By.xpath("/html/body/div/div[2]/button"));
		WebElement source = wd.findElement(By.className("draggable"));
		WebElement target2 = wd.findElement(By.tagName("textarea")); 
		System.out.println(target2.getText());
		Actions builder1 = new Actions(wd);
	//	Actions builder2 = new Actions(wd);
		Action drop1 = builder1.dragAndDrop(source, target1).release().build();
	//	Action drop2 = builder2.dragAndDrop(source, target2).release().build();
		drop1.perform();
		drop1 = builder1.dragAndDrop(source, target2).release().build();
		Thread.sleep(5000);
		drop1.perform();
		
	}*/
	
	/*@Test
	public void actionsExample() throws InterruptedException
	{
		wd.get("http://www.ehow.com/");
		Actions a = new Actions(wd);
		a.moveToElement(wd.findElement(By.xpath("//*[@id='Header']/section/div/div[1]/span/label"))).build().perform();
		Thread.sleep(5000);
		a.click(wd.findElement(By.xpath("//*[@id='Header']/section/div/div[1]/span/div/div[1]/ul[1]/li[1]/a"))).build().perform();
				
		
	}*/
	
	@Test
	public void updateFirefoxProfileThroughProxy()
	{
		/*FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "C:\\");
		fp.setPreference("intl.accept_languages", "zh-cn");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		
		WebDriver wd = new FirefoxDriver(dc);
		wd.get("http://google.com/");*/

		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fp = profile.getProfile("selenium");
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "C:\\");
		fp.setPreference("intl.accept_languages", "zh-cn");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		WebDriver wd = new FirefoxDriver(dc);
		wd.get("http://www.google.com/");
	}
}
