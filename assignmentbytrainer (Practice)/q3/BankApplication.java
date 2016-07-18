/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a Customer class with relevant information like name,address,
 * account number, current balance. Create a bank application class and add customer
 * to the bank application with relevant methods like addcustomer, delete customer, 
 * update customer and getCustomerInfo.  
 * Role of this File: This file consist of BankApplication class which performs 
 * operations using Customer class
 */
package org.cybage.assignmentbytrainer.q3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BankApplication {
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	//HashSet for storing customers info 
	public static Set<Customer> hset = new HashSet<>();
	//Adding the customer
	public boolean addCustomer()
	{
		Customer cc = new Customer(sc1.next(),sc1.next(),sc2.nextLong(),sc2.nextFloat());
		hset.add(cc);
		return true;
	}
	//Removing the customer info
	public boolean deleteCustomer()
	{
		System.out.println("Enter the account no that you want to delete: ");
		long acc = sc2.nextLong();
		Customer cc = new Customer();
		cc.setAccNo(acc);
		hset.contains(cc);
		return true;
	}
	//Updating the customer info
	public boolean updateCustomer()
	{
		System.out.println("Enter the account no to update: ");
		Long acc = sc2.nextLong();
		Customer cc = new Customer();
		cc.setAccNo(acc);
		if(hset.contains(cc))
		{
			hset.remove(cc);
			System.out.println("Enter new details: ");
			cc = new Customer(sc1.next(),sc1.next(),acc,sc2.nextFloat());
			hset.add(cc);
		}
		return true;
	}
	//Retrieving customer info using Acc No
	public boolean getCustomerInfo()
	{
		System.out.println("Account no to display the details: ");
		long acc = sc2.nextLong();
		for(Customer c : hset)
		{	
			if(c.getAccNo() == acc)
			{
				System.out.println(c);
				return true;
			}
		}
		System.out.println("No record found");
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		BankApplication ba = new BankApplication();
		do 
		{
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Update");
			System.out.println("5.Exit");
			choice = sc.nextInt();
		switch(choice)
		{
			case 1: ba.addCustomer();
					break;
			case 2: ba.deleteCustomer();
					break;
			case 3: ba.getCustomerInfo();
					break;
			case 4: ba.updateCustomer();
					break;
			case 5: System.exit(0);
			default: System.out.println("Invalid choice");
		}
		}while(choice != 5);
	}
	
}
