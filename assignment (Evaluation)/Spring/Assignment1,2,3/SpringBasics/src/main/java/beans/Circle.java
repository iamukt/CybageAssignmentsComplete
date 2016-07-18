/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a spring Application by showing bean Scope as a prototype
 * and also explore singleton
 * Role of this File: Circle Bean 
 */
package beans;

public class Circle
{
	private int radius;
	static int objectCount;
	
	/**
	 * @param radius
	 */
	
	//Constructor to keep the object count
	public Circle(int radius)
	{
		super();
		this.radius = radius;
		++objectCount;
		System.out.println("Circle class Instantiated "+objectCount+" times"+"\n");
		
	}

	//calculates the area of the circle 
	public void area()
	{
		double area = 3.14*radius;
		System.out.println("Area of the circle is: "+area+"\n");
	}
	
	
}
