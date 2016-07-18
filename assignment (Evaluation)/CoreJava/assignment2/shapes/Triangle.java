package org.cybage.assignment.assignment2.shapes;
import java.util.Scanner;
public class Triangle extends Shape {
	int height;
	int side;
	@Override
	public double calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Height pf triangle: ");
		height = sc.nextInt();
		System.out.println("Side of triangle: ");
		side = sc.nextInt();
		return (1/3)*side*height;
	}
	@Override
	public void print() {
		calcArea();
		
	}
	
}
