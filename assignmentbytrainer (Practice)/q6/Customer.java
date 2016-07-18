/**
 * @author Umesh Kumar Toke
 * Problem Name: Create Account class with account type, account number, minimum balance
 * and current balance and provide getter and setter methods along with callinterest 
 * method. Create FixedDepositAccount, CurrAccount classes and inherit from Account class.
 * Use Account class in customer class to store account information in the 
 * customer object. 
 * Role of this File: This file consist of Customer class which has Account class 
 * reference in it. This class is responsible for adding account information to 
 * its objects;  
 */
package org.cybage.assignmentbytrainer.q6;

import java.util.Scanner;


public class Customer
{
	private  Account a;
	private static Scanner sc = new Scanner(System.in);
	private static Customer[] cc = new Customer[10];
	//To maintain the count of Customer 
	//objects that are going to get created
	private static int count=0;
	
	/**
	 * @return the a
	 */
	public Account getA()
	{
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(Account a)
	{
		this.a = a;
	}
	public static void main(String[] args)
	{
		accept();
		display();
	}
	public static void accept()
	{
		System.out.println("Feed the customer Records: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Type of Account");
			String type = sc.next();
			if(type.equalsIgnoreCase("saving"))
			{
				//Creation of customer object
				cc[i] = new Customer();
				//Adding FixedDepositAccount object to Customer object
				cc[i].a = new FixedDepositAccount();
				System.out.println("Account No: ");
				cc[i].a.setAccNo(sc.nextInt());
				System.out.println("Current Balance: ");
				cc[i].a.setCurrBal(sc.nextInt());
				cc[i].a.setType("saving");
				System.out.println(i);
				count++;
			}
			else
			{
				//Creation of customer object
				cc[i] = new Customer();
				//Adding FixedDepositAccount object to Customer object
				cc[i].a = new CurrAccount();
				cc[i].setA(new CurrAccount());
				System.out.println("Account No: ");
				cc[i].a.setAccNo(sc.nextInt());
				System.out.println("Current Balance: ");
				cc[i].a.setCurrBal(sc.nextInt());
				cc[i].a.setType("current");
				System.out.println(i);
				count++;
			}
		}

	}
	//To display the customer info
	public static void display()
	{
		int n = cc.length-1;
		System.out.println("Displaying "+count+" Customer Account Records: ");
		for(int i=0;i<count;i++)
		{
			System.out.println(i);
			System.out.println(cc[i].a.getAccNo());
			System.out.println(cc[i].a.callInterest());
		}

	}
	
}
