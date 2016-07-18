/**
 * @author Umesh Kumar Toke
 * Problem Name: HashMap for books
 * Role of this File: This performs operations on Books.java Class 
 */
package org.cybage.assignments.assignment5.q3;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class TesterBooks {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Long, Books> hmap = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creation of HashMap
		int choice;
		do {
			System.out.println("1.Fill the details");
			System.out.println("2.Sort the details(as per ISBN)");
			System.out.println("3.Parse the details(using Iterator)");
			System.out.println("4.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1: fillDetails();
				break;
			case 2: sortMap();
				break;
			case 3: parseDetails();
				break;
			case 4: 
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 4);
	}
	//Fills the HashMap
	public static void fillDetails() {
		System.out.println("No. of records: ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) 
		{
			System.out.println("Book Code: ");
			long isbn = sc.nextLong();
			System.out.println("Book Name");
			String name = sc.next();
			System.out.println("No. of Pages");
			int nop = sc.nextInt();
			hmap.put(isbn, new Books(isbn, name, nop));
		}
	}
	//Sorts the HashMap by converting it into TreeMap
	public static void sortMap() {
		System.out.println(new TreeMap<Long, Books>(hmap));
	}
	//Iterates overs the map (by converting map into collection)
	public static void parseDetails()
	{
		ArrayList<Books> al = new ArrayList<>();
		al.addAll(hmap.values());
		Iterator<Books> i = al.iterator();
		System.out.println("not in loop");
		while(i.hasNext())
		{
			Books temp = i.next();
			System.out.println(temp);
		}
	}

}
