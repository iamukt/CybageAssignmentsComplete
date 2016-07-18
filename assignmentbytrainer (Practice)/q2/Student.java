/**
 * @author Umesh Kumar Toke
 * Problem Name: Write a program to create an array of student names and access 
 * it with index
 * Role of this File: This file solves the above problem
 */
package org.cybage.assignmentbytrainer.q2;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		String[] names = new String[10];
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter total no records that you need: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Name of the "+i+" Student: ");
			names[i] = new String(sc1.nextLine());
		}
		System.out.println("Enter index no: ");
		n = sc.nextInt();
		System.out.println(names[n]);
	}
}
