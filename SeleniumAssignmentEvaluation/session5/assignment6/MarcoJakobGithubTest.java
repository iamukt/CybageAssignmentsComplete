package com.session5.assignment6;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MarcoJakobGithubTest 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
		WebElement draggable = wd.findElement(By.className("draggable"));
		WebElement droppable = wd.findElement(By.tagName("button"));
		Actions act = new Actions(wd);
		act.dragAndDrop(draggable, droppable).build().perform();;
		Thread.sleep(5000);
		WebElement droppable1 = wd.findElement(By.tagName("textarea"));
		//Actions act1 = new Actions(wd);
		act.dragAndDrop(draggable, droppable1).build().perform();
		Thread.sleep(5000);
		
		wd.get("http://executeautomation.com/demosite/Dragging.html");
		
		WebElement draggable2 = wd.findElement(By.xpath(".//*[@id='item1']"));
		WebElement droppable2 = wd.findElement(By.xpath(".//*[@id='item4']"));
		Actions act2 = new Actions(wd);
		act2.dragAndDrop(draggable2, droppable2).build().perform();
		Thread.sleep(5000);
		List<WebElement> list = wd.findElements(By.tagName("li"));
		
		for(WebElement wb : list)
		{
			System.out.println("TExt: "+wb.getText());
		}
		
		
		
		
	}
}
