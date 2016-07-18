/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a list of Employee object and sort by name
 * Role of this File: Employee Class 
 */
package org.cybage.assignments.assignment5.q2;



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
		return this.name.compareTo(o.name);
	}		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpCode=" + empCode + ", Name=" + name;
	}
	
}
