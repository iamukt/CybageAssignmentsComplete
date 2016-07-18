package org.cybage.assignment.assignment2.shapes;
import java.util.Scanner;
public class Circle extends Shape {
	int radius;
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius of circle: ");
		radius = sc.nextInt();
		return 3.14*radius*radius;
	}
	@Override
	public void print() {
		calcArea();
		
	}
}
