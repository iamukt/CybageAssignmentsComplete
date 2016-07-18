/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a Sorted Set of Employee object and sort on EmployeeId
 * Role of this File: Employee Class 
 */
package org.cybage.assignments.assignment5.q1;

public class Employee implements Comparable<Employee>{
	private String name;
	private int empCode;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param empCode
	 */
	public Employee(String name, int empCode) {
		super();
		this.name = name;
		this.empCode = empCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empCode > o.empCode)
			return 1;
		else if(this.empCode < o.empCode)
			return -1;
		return 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpCode=" + empCode + ", Name=" + name;
	}
	
}
