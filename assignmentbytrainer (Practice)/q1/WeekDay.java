/**
 * @author Umesh Kumar Toke
 * Problem Name: Write a program to return the name of a day of the week 
 * given the day
 * Role of this File: This file implements the above concept 
 */
package org.cybage.assignmentbytrainer.q1;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class WeekDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Usage of TreeMap 
		Map<Integer, String> tmap = new TreeMap<Integer,String >();
		tmap.put(1, "Monday");
		tmap.put(2, "Tuesday");
		tmap.put(3, "Wednesday");
		tmap.put(4, "Thrusday");
		tmap.put(5, "Friday");
		tmap.put(6, "Saturday");
		tmap.put(7, "Sunday");
		System.out.println("Enter the day number");
		int dayNo = sc.nextInt();
		if(tmap.containsKey(dayNo))
			System.out.println("Day of the weekend is: "+tmap.get(dayNo));
		else
			System.out.println("Invalid Input");
	}
}
