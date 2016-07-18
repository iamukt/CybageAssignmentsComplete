/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a spring Application by showing bean Scope as a prototype
 * and also explore singleton
 * Role of this File: Tester Class 
 */
package beans;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestBean
{
	public static void main(String[] args)
	{
		//Locate, Load and Execute Spring bean file
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Injecting Circle object
		Circle c = (Circle) ctx.getBean("circle");
		c.area();
		
		//Injecting another Circle object
		Circle c1 = (Circle) ctx.getBean("circle");
		c1.area();
		
		//Injecting Triangle object
		Triangle t = (Triangle) ctx.getBean("triangle");
		t.area();
		
		//Injecting another Triangle object
		Triangle t1 = (Triangle) ctx.getBean("triangle");
		t1.area();
	}
}
