/**@author Umesh Kumar Toke
 * 
 * Problem Statement: Factory Bean Example
 * 
 * Role of the file: Shape Factory is a factory class that is responsible
 * for creation of other threads
 */
package beans;

public class ShapeFactory {
	private Circle cc;
	private Triangle tt;
	int radius;
	public ShapeFactory(int radius) {
		this.radius = radius;
	}
	
	public Circle getCircleInst()
	{
		return new Circle(radius);
	}
	
	public Triangle getTriangleInst()
	{
		return new Triangle();
	}
}

