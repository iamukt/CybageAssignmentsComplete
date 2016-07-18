//To test this exception refer to squareroot.java file
package org.cybage.assignments.assignment4;

public class NumberException extends ArithmeticException
{
	public NumberException(String msg)
	{
		System.out.println(msg);
	}
	
}
