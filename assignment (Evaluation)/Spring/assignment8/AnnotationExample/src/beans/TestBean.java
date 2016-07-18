/** @author Umesh Kumar Toke
 *
 * Problem Statement: Explore annotation based Spring Core Program
 * 
 * Role of this File: Class that loads Spring Configuration XML file
 */
package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean 
{
	public static void main(String[] args) 
	{
		//Loading the Spring Configuration File
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Dependency of the Shape will be automatically injected at RunTime
		Shape ss = (Shape) ctx.getBean("shape");
		
		//Calling CircleArea Method of Shape
		ss.getCircleArea();
		
		//Calling TriangleArea Method of Shape 
		ss.getTriangleArea();
	}
	
}
