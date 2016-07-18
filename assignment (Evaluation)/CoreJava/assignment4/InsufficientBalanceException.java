package org.cybage.assignments.assignment4;
//This is a custom exception for insufficient balance
//To test this exception refer to Account.java class
public class InsufficientBalanceException extends Exception
{

	public InsufficientBalanceException(String msg)
	{
		System.out.println(msg);
	}
}
