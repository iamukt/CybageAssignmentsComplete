package com.session6.assignment2.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import junit.framework.Assert;

public class Page
{
	private WebDriver wd;
	public Page(WebDriver driver)
	{
		wd = driver;
	}
	
	public void Testnopcommerce() throws InterruptedException
	{
		wd.get("http://demo.nopcommerce.com/");
		FluentWait<WebDriver> waitF = new FluentWait<WebDriver>(wd)
				.withTimeout(2000, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(ElementNotVisibleException.class,NoSuchElementException.class);
		Actions act = new Actions(wd);
		act.moveToElement(wd.findElement(By.linkText("Electronics"))).build().perform();
		act.click(wd.findElement(By.linkText("Cell phones"))).build().perform();
		wd.findElement(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/a[1]")).click();
		act.moveToElement(wd.findElement(By.xpath(".//*[@id='products-orderby']"))).build().perform();
		act.click(wd.findElement(By.xpath(".//*[@id='products-orderby']/option[4]"))).build().perform();
		Thread.sleep(1000);
		
		waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]"))).click();
		waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='bar-notification']/p/a"))).click();
		
		org.junit.Assert.assertEquals("HTC One Mini Blue",wd.findElement(By.className("product-name")).getText());
		
		waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[1]/input"))).click();
		//waitF.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/input[1]"))).click();
		Thread.sleep(5000);
		wd.findElement(By.className("button-2.update-cart-button")).click();
		//org.junit.Assert.assertEquals("Your Shopping Cart is empty!", wd.findElement(By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div/div")).getText());
		//	wd.findElement(By.xpath(".//*[@id='products-orderby']")).click();
		//wd.findElement(By.xpath(".//*[@id='products-orderby']/option[4]")).click();
		
	};
	
}
