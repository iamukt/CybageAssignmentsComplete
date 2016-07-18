//This class tests the exception for insufficient balance
//for Custom Exception refer to InsufficientBalanceException.java 
package org.cybage.assignments.assignment4;
import java.util.Scanner;
public class Account {
	int balance;
	public Account()
	{
		balance = 1000;
	}
	public static void main(String[] args)  {
		Account aa = new Account();
		System.out.println("Enter the amount you want to withdraw: ");
		try(
				Scanner sc = new Scanner(System.in);
		)
		{
			int  withdraw = sc.nextInt();
			if( withdraw > aa.balance)
				throw new InsufficientBalanceException("Insufficient balance");
		}
		catch(InsufficientBalanceException ibe)
		{
			System.out.println("Exception catched");
		}
		System.out.println("Exception successfully processed");
	}
}
