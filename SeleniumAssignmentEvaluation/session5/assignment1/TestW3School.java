package com.session5.assignment1;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestW3School 
{
	@Test
	public void test() throws MalformedURLException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.switchTo().frame("iframeResult");
		wd.findElement(By.xpath("/html/body/button")).click();
		wd.switchTo().alert().accept();
		
	}
}
