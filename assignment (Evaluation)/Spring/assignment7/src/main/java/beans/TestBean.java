/**@author Umesh Kumar Toke
 * Problem Statement: Write a program to implement collection 
 * using spring framework
 * 
 * Role of this file: This file is used as Spring Context Bean   
 */
package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean
{
	public static void main(String[] args) 
	{
		//Loading Spring xml file from class path
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Injecting the object of CollectionBean at runtime
		CollectionBean cc = (CollectionBean) ctx.getBean("collection");
		
		//Display List
		System.out.println("List representation is: "+cc.getL1());
		//Display Map
		System.out.println("Map representation is: "+cc.getMap());
		//Display Set
		System.out.println("Set representation is: "+cc.getSet());
	}
	
}
