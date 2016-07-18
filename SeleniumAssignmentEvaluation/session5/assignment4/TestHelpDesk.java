package com.session5.assignment4;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHelpDesk 
{
	@Test
	public void test() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		String[] param = new String[]{"C:\\Users\\umesht\\Desktop\\userauthentication.exe","Authentication Required","umesht",""};
		Runtime.getRuntime().exec(param);
		wd.get("http://helpdesk.cybage.com/");
	}
}
