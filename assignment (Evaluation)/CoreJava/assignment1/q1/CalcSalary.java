/**
 * @author Umesh Kumar Toke
 * Problem Name: Create an Employee Class and calculate the salary of manager
 * (receives allowance), 
 * salesperson (receives commission) and a normal employee (receives no incentives) 
 * through CalcInfo() method through method overriding.
 * Role of this File: This file consist of 4 classes 
 */
package org.cybage.assignments.assignment1.q1;

import java.util.Scanner;
//Employee Class
class Employee
{
	public int salary;
	public Scanner sc = new Scanner(System.in);
	//Normal employee salary is calculated on the basis of 
	//salary*12 that is no incentives.  
	public int calcInfo()
	{
		System.out.println("Enter the salary: ");
		salary=sc.nextInt();
		return salary*12;
	}
	
}
class Salesperson extends Employee
{
	public int commission;
	public Scanner sc = new Scanner(System.in);
	//SalesPerson receives commission which is added to the salary
	@Override
	public int calcInfo()
	{	
		System.out.println("Enter the salary: ");
		salary=sc.nextInt();
		System.out.println("Enter the commission: ");
		commission = sc.nextInt();
		return salary*12+commission;
	}
}
class Manager extends Employee
{
	public int allowance;
	public Scanner sc = new Scanner(System.in);
	//Manager receives allowance that is added to the salary
	@Override
	public int calcInfo()
	{
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
		System.out.println("Enter the allowance: ");
		allowance = sc.nextInt();
		return salary*12+allowance;
	}
}
//ClacSalary class to test the method of different classes
public class CalcSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		Salesperson sp = new Salesperson();
		Manager mg = new Manager();
		System.out.println("The employee salary is: "+emp.calcInfo());
		System.out.println("The Salesperson salary is"+sp.calcInfo());
		System.out.println("The manager salary is "+mg.calcInfo());
	}
}