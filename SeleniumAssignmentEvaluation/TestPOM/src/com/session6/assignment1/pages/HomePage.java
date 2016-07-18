package com.session6.assignment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	WebDriver wd;
	public HomePage(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public WebDriver openHomePage()
	{
		System.out.println(wd);
		wd.get("http://www.cybage.com/");
		return wd;
	}
	
}
