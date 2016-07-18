package beans;

public class Shape {
	private Circle cc;
	public void getCircleArea()
	{
		System.out.println("Radius of the circle is: "+ (3.14f*cc.getRadius()));
	}
	public Circle getCc() {
		return cc;
	}
	public void setCc(Circle cc) {
		this.cc = cc;
	}
	
}
