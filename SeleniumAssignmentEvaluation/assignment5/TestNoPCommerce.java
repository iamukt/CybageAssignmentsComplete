package com.assignment5;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNoPCommerce 
{
	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://demo.nopcommerce.com/");
		List<WebElement> customerService = wd.findElements(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/ul/li"));
		for(WebElement list : customerService)
		{
			System.out.println(list.getText());
		}
		wd.findElement(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/ul/li[5]/a")).click();
		wd.navigate().back();
		wd.findElement(By.id("small-searchterms")).sendKeys("Laptops");
		wd.findElement(By.xpath(".//*[@id='small-search-box-form']/input[2]")).click();
		wd.navigate().back();
		wd.findElement(By.id("small-searchterms")).sendKeys("HTC");
		wd.findElement(By.xpath(".//*[@id='small-search-box-form']/input[2]")).click();
		wd.get("http://demo.nopcommerce.com/news");
	}
}
