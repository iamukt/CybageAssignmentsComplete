/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a spring Application by showing bean Scope as a prototype
 * and also explore singleton
 * Role of this File: Triangle Bean 
 */
package beans;

public class Triangle
{
	private int height;
	private int base;
	static int objectCount;
	
	//Constructor to keep the object count
	public Triangle()
	{
		// TODO Auto-generated constructor stub
		++objectCount;
		System.out.println("Triangle class Instantiated "+objectCount+" times"+"\n");
	}
	
	//calculates the area of the triangle
	public void area()
	{
		float area = 0.5f * base * height;  
		System.out.println("Area of the Triangle is: "+area+"\n");
	}
	/**
	 * @return the height
	 */
	public int getHeight()
	{
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	/**
	 * @return the base
	 */
	public int getBase()
	{
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(int base)
	{
		this.base = base;
	}
	
}
