package com.session6.assignment1.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.session6.assignment1.pages.HomePage;
import com.session6.assignment1.pages.WorldWideLocations;

public class Test 
{
	WebDriver wd;
	
	@Before
	public void setWd() {
		this.wd = new FirefoxDriver();
		System.out.println(wd);
	}
	
	@org.junit.Test
	public void testHomePage()
	{
		System.out.println(wd);
		HomePage hm = new HomePage(wd);
		wd = hm.openHomePage();
		WorldWideLocations ww1 = new WorldWideLocations();
		ww1.TestWorldLocations();
		WorldWideLocations wwl = new WorldWideLocations(wd);
		wwl.TestWorldLocations();
	}
	
	

	
}
