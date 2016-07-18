/**@author Umesh Kumar Toke
 * 
 * Problem Statement: Explore annotation based Spring Core Program
 * 
 * Role of this File: Shape is a class that has Circle and Triangle references as the dependency 
 * this dependency get resolved at runtime automatically. (Using annotations) 
 */
package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Shape {
	
	private Circle cc;
	private Triangle tt;
	
	//Dependency will be automatically injected when the jvm will encounter @Autowired
	@Autowired
	public void setCc(Circle cc) {
		this.cc = cc;
	}

	//Dependency will be automatically injected when the jvm will encounter @Autowired
	@Autowired
	public void setTt(Triangle tt) {
		this.tt = tt;
	}

	//Method for getting Circle Area
	public void getCircleArea()
	{
		System.out.println("Radius of the circle is: "+(3.14*cc.getRadius()));
	}
	
	//Method for getting Triangle Area
	public void getTriangleArea()
	{
		System.out.println("Radius of the triangle is: "+(0.5*tt.getBase()*tt.getHeight()));
	}
	
}
