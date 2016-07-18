/**@author Umesh Kumar Toke
 * Problem Statement: Crud Operations using EclipseLink
 * Role of this File: Menu Driven Program performing Crud Operations
 */
package com.pojos;

import java.util.List;
import java.util.Scanner;
import javax.persistence.Query;
import utils.EclipseLinkUtils;

public class CrudOperations {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			
			System.out.println("1.Create Table");
			System.out.println("2.Retrieve Values from table");
			System.out.println("3.Update values from table");
			System.out.println("4.Delete values from table");
			System.out.println("5.Exit");
			n = sc.nextInt();
			switch (n) {
			case 1:
				create();
				break;
			case 2:
				retreive();
				break;
			case 3: update();
				break;
			case 4:
				remove();
				break;
			case 5:
				break;
			}
		} while (n != 5);

	}

	//Creating the table
	public static void create() {

		System.out.println("Enter the no of customers you want to add: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//Begin the transaction
			EclipseLinkUtils.getEM().getTransaction().begin();
			Customer cc = new Customer();
			System.out.println("Id: ");
			cc.setCustid(sc.nextInt());
			System.out.println("Name: ");
			cc.setName(sc.next());
			System.out.println("Contact No: ");
			cc.setMobno(sc.next());
			//Persist the object
			EclipseLinkUtils.getEM().persist(cc);
			//Commit the transaction
			EclipseLinkUtils.getEM().getTransaction().commit();
		}
	}

	//Removing the entries
	public static void remove() {
		System.out.println("Customer id whose record is to be deleted: ");
		int id = sc.nextInt();
		EclipseLinkUtils.getEM().getTransaction().begin();
		Customer cc = EclipseLinkUtils.getEM().find(Customer.class, id);
		if (cc != null) {
			//Remove the record from the table
			EclipseLinkUtils.getEM().remove(cc);
		} else {
			System.out.println("No record found");
		}
		EclipseLinkUtils.getEM().getTransaction().commit();
	}

	//Searching or Retrieving the data
	public static void retreive()
	{
		System.out.println("Customer id whose record is to view "
				+ "(Enter 0 if you want to see all the records): ");
		int id = sc.nextInt();
		EclipseLinkUtils.getEM().getTransaction().begin();
		if(id!=0)
		{
			//Finds the record using id
			Customer cc = EclipseLinkUtils.getEM().find(Customer.class, id);
			if(cc!=null)
			{
				EclipseLinkUtils.getEM().remove(cc);
			}
			else
			{
				System.out.println("No record found");
			}
		}
		else
		{
			//Java Persistence Query 
			Query query = EclipseLinkUtils.getEM().createQuery("select c from Customer c");
			//Store the complete records as list
			List<Customer> lst = query.getResultList();
			for(Customer c : lst)
			{
				System.out.println("Customer Id: "+c.getCustid());
				System.out.println("Customer Name: "+c.getName());
				System.out.println("Customer Mobile No: "+c.getMobno());
			}
		}
		EclipseLinkUtils.getEM().getTransaction().commit();
	}
	
	//Updating the records
	public static void update() {
		System.out.println("Customer id whose record is to be deleted: ");
		int id = sc.nextInt();
		EclipseLinkUtils.getEM().getTransaction().begin();
		//Find the record using id
		Customer cc = EclipseLinkUtils.getEM().find(Customer.class, id);
		if (cc != null)
		{
			System.out.println("Enter New Name");
			cc.setName(sc.next());
			System.out.println("Enter New Contact No");
			cc.setMobno(sc.next());
		} 
		else 
			System.out.println("No record found");
		EclipseLinkUtils.getEM().getTransaction().commit();
		System.out.println("Record Updated");
	}

}
