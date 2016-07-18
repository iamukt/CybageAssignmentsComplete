package org.cybage.assignment.assignment2.shapes;

public class Tester {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Circle();
		sh[1] = new Rectangle();
		sh[2] = new Triangle();
		System.out.println(sh[0].calcArea()+" is the area of Circle");
		System.out.println(sh[1].calcArea()+" is the area of Rectangle");
		System.out.println(sh[2].calcArea()+" is the area of Triangle");
	}
	 
}
