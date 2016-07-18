//This program tests exceptions that can be raised when user enters negative input
//Custom Exception file name is NumberException.java
package org.cybage.assignments.assignment4;
import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in);
		) {
		
			System.out.println("Enter the no whose square you want to find: ");
			double a = sc.nextInt();
			if(a<0)
				throw new NumberException("Exception thrown");
		}
		catch(NumberException ne)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Exception got handeled");
		
	}
}
