package com.session5.assignment5;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

public class TestCybIntranet 
{
	@Test
	public void test() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		//User Authentication
		String[] param = new String[]{"C:\\Users\\umesht\\Desktop\\userauthentication.exe","Authentication Required","umesht",""};
		Runtime.getRuntime().exec(param);
		wd.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
		//File Upload
		String[] param_File = new String[]{"C:\\Users\\umesht\\Desktop\\FileUpload.exe","File Upload","d:/","RunnableJar"};
		Runtime.getRuntime().exec(param_File);
		wd.findElement(By.xpath("//*[@id='flupBabyImage']")).click();
		WebElement file = wd.findElement(By.xpath("//*[@id='flupBabyImage']"));

		
	}
}
