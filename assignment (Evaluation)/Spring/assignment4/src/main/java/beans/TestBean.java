package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	
	
	public static void main(String[] args) 
	{
		//Loading the Spring Config file
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Injecting Circle Instance at runtime
		Circle cc = (Circle) ctx.getBean("circle");
		cc.getArea();
		
		//Injecting Triangle Instance at runtime
		Triangle tt = (Triangle) ctx.getBean("triangle");
		tt.getArea();
	}
	
}
