package com.session6.assignment2.test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.session6.assignment2.pages.*;


public class Test
{
	@org.junit.Test
	public void test() throws InterruptedException
	{
		Page pg = new Page(new FirefoxDriver());
		pg.Testnopcommerce();
	}
}
