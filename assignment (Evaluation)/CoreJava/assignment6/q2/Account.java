/**
 * @author Umesh Kumar Toke
 * Problem Name: Serialize and DeSerialize Account class object
 * Role of this File: same as above
 */
package org.cybage.assignments.assignment6.q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account implements Serializable
{
	private Date doc;
	
	/**
	 * @param doc
	 */
	
	public Account(Date doc)
	{
		super();
		this.doc = doc;
	}

	/**
	 * 
	 */
	public Account()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Serialize");
			System.out.println("2.Deserialize");
			System.out.println("3.Exit");
			choice = new Scanner(System.in).nextInt();
			switch(choice)
			{
				case 1: System.out.println("Date: ");
						String date = sc.next();
						a.serializeObject(date);
						break;
				case 2: System.out.println("Deserialized data tends to be: "+a.deserializeObject());
						break;
				case 3:
						System.exit(0);
				default: 
						System.out.println("Invalid Choice");
			}	
		}while(choice != 3);
		
	}
	//Serializes the object into readme.ser file
	public void serializeObject(String date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		try
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("readme.ser"));
			oos.writeObject(new Account(sdf.parse(date)));
		} catch ( IOException | ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//DeSerializes the object from readme.ser file
	public Account deserializeObject()
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readme.ser"));
			Account readDate = (Account) ois.readObject();
			return readDate;
		} catch ( IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Account [doc=" + doc + "]";
	}
	
	
}
