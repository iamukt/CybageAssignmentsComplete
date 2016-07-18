package com.assignment3;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleHindiTest {

	@Test
	public void test() throws InterruptedException
	{
		//WebDriver wd = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.google.com");
		wd.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[2]")).click();
		wd.findElement(By.linkText("Doodles Archive")).click();
		wd.findElement(By.id("lang-chooser")).click();
		wd.findElement(By.xpath(".//*[@id='lang-chooser']/option[14]")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath(".//*[@id='archive-list']/li[1]/div[1]/div[2]/div[2]/a")).click();
	}

}
