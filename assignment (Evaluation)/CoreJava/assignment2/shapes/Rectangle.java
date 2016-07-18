package org.cybage.assignment.assignment2.shapes;
import java.util.Scanner;
public class Rectangle extends Shape {
	int length;
	int breadth;
	@Override
	public double calcArea() {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of Rectangle: ");
		length=sc.nextInt();
		System.out.println("Breadth of Rectangle: ");
		breadth = sc.nextInt();
		return length*breadth;
	}
	@Override
	public void print() {
		calcArea();
		
	}
}
