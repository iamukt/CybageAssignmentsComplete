package com.test1;



import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestSquareSpace 
{
	@Test
	public void test() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umesht\\Desktop\\Selenium\\Selenium & Other Jars\\chromedriver.exe");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setJavascriptEnabled(true);
		
		WebDriver wd = new ChromeDriver();
		/*wd.get("http://www.squarespace.com/tour/ecommerce-website/");
		wd.manage().window().maximize();
		Actions action = new Actions(wd);
		JavascriptExecutor js = ((JavascriptExecutor) wd);
		js.executeScript("window.scrollTo(0,1800)");
		WebElement view = wd.findElement(By.xpath("//*[@id='commerce-page']/article[2]/div/ul/li[7]/a"));
		//WebElement view = wd.findElement(By.xpath("//*[@id='commerce-page']/article[2]/div/ul/li[7]/a/button"));
		System.out.println("Got printed"+view.getText());
		action.moveToElement(view).build().perform();
		action.click();*/
		wd.get("http://cybagemis.cybage.com/Framework/Iframe.aspx");
		String[] Param = new String[]{"C:\\Users\\umesht\\Desktop\\userauthentication.exe","Authentication Required","anc","xyz"};
		Runtime.getRuntime().exec(Param);
		Thread.sleep(1000);
	
		
	}

}
