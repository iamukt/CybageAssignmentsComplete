/**
 * @author Umesh Kumar Toke
 * Problem Name: Override the equals and toString method in 
 * Account and Employee class
 * Role of this File: This file toString and equals method 
 * in Employee class. 
 */
package org.cybage.assignments.assignment3.q1;

public class Employee {
	String name;
	int empid;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
}
