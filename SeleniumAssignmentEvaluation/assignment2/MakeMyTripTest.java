package com.assignment2;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripTest {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.makemytrip.com");
		wd.findElement(By.linkText("Hotel")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("from_city_data_box")).sendKeys("New Delhi And NCR, India");
		wd.findElement(By.xpath(".//*[@id='nightAnchor']/div/p[2]/span[2]")).click();
		wd.findElement(By.xpath(".//*[@id='nightAnchor']/div/div/ul/li[4]/a")).click();
		wd.findElement(By.xpath(".//*[@id='roomDiv_1']/div/div/div[2]/div/div/a[2]")).click();
		wd.findElement(By.id("hotels_submit")).click();
	}

}
