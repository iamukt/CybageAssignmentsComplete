/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a Sorted Set of Employee object and sort on EmployeeId
 * Role of this File: This is a test file that performs the operation on Employee.java class
 */
//
package org.cybage.assignments.assignment5.q2;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class TesterEmployee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//TreeSet to store the employee records
		Set<Employee> tset = new TreeSet<>();
		System.out.println("Number of Employee records to be entered: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Employee Code: ");
			int empCode = sc.nextInt();
			System.out.println("Employee Name: ");
			String empName = sc.next();
			tset.add(new Employee(empName, empCode));
		}
		System.out.println("Sorted set of employee on the basis EmpCode are: "+tset);
		sc.close();
	}
}
