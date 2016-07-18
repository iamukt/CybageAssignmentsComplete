/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a class Employee and write code to find the highly
 * paid employee and the most senior employee in the organization. Also 
 * sort the employee basis on employee id.  
 * Role of this File: This file implements the above concept 
 */
package org.cybage.assignmentbytrainer.q5;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	int empcode;
	String name;
	int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empcode, int salary,String name) {
		super();
		this.empcode = empcode;
		this.salary = salary;
		this.name = name;
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		TreeSet<Employee> tset = new TreeSet<>();
		System.out.println("No. of records you want to feed: ");
		n = sc.nextInt();
		int maxSal=0;
		int poi = 0;
		for(int i=0; i< n ; i++)
		{
			System.out.println("EmpCode: ");
			int empCode = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			int salary = sc.nextInt();
			if(salary > maxSal )
			{
				maxSal = salary;
				poi = empCode;
			}
			tset.add(new Employee(empCode, salary,name));
		}
		
		//In this program employee code is considered for finding the most 
		//senior employee. As the person who joined the company very earliest 
		//is going to have the smallest digit employee code
		//Prints the most senior employee
		System.out.println("The most senior employee: "+tset.first());
		
		//Prints the employee with highest salary
		System.out.println("The employee with highest salary is: ");
		Iterator<Employee> itr = tset.iterator();
		while(itr.hasNext())
		{
			Employee emp = itr.next();
			if(emp.getEmpcode() == poi)
				System.out.println(emp.getName());
		}
		
		System.out.println("The employee sorted on the basis of employee id are: ");
		System.out.println(tset);
		
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(empcode < emp.getEmpcode())
			return -1;
		else if(empcode > emp.getEmpcode())
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
}
