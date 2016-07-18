package com.assignment1;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class TestLoaders {

	@Test
	public void test() 
	{
		ResourceBundle rdb = ResourceBundle.getBundle("resource");
		if(rdb.getString("browser").equalsIgnoreCase("firefox"))
		{
			WebDriver wd = new FirefoxDriver();
			System.out.println(rdb.getString("url"));
			wd.get(rdb.getString("url"));
			wd.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
			System.out.println(wd.getTitle());
			if(wd.getTitle().equalsIgnoreCase("careers"))
			{
				wd.manage().window().maximize();
			}
		}
		else if(rdb.getString("browser").equalsIgnoreCase("chrome"))
		{
			/*DesiredCapabilities capabities = DesiredCapabilities.chrome();
			capabities.setJavascriptEnabled(true);*/
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			System.out.println(rdb.getString("url"));
			wd.get(rdb.getString("url"));
			wd.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
			System.out.println(wd.getTitle());
			if(wd.getTitle().equalsIgnoreCase("careers"))
			{
				wd.manage().window().maximize();
			}
		}
		else if(rdb.getString("browser").equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
			WebDriver wd = new InternetExplorerDriver();
			System.out.println(rdb.getString("url"));
			wd.get(rdb.getString("url"));
			wd.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();
			System.out.println(wd.getTitle());
			if(wd.getTitle().equalsIgnoreCase("careers"))
			{
				wd.manage().window().maximize();
			}
		}
		
	}

}
