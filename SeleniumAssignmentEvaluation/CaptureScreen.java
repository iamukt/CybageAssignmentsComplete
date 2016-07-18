package com.session5.assignment9;

import java.awt.image.BufferedImage;
//import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreen
{
	
	private void captureScreenDriver(WebDriver driver) throws IOException
	{
		File scrsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(scrsht, new File("Errors\\ErrorDriver.jpg"));
		System.out.println("Get File Name: "+scrsht.getName());
	}
	
	
	@Test
	public void test() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.google.com/");
		captureScreenDriver(wd);
	}
	private void captureScreenElement(WebDriver driver, WebElement elemenrcapt) throws IOException
	{
		File scrsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Point point = elemenrcapt.getLocation();
		int width = elemenrcapt.getSize().getWidth();
		int height = elemenrcapt.getSize().getHeight();
		
		Rectangle rect = new Rectangle(width, height);
		BufferedImage img = ImageIO.read(scrsht);
		BufferedImage dest = img.getSubimage(point.getX(), point.getY(), w, h);
		
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
