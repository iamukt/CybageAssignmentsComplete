/**
 * @author Umesh Kumar Toke
 * Problem Name: 1)Insert and update Employee data in database and display 
 * it using PreparedStatement. Insert SomeRecords in Student table also.
 * 2)Write Generic code to display col. names of a table along with the data
 * in the table for employee as well as student table.
 * Role of this File:  Employee class 
 */
package org.cybage.assignments.assignment8.q1;



public class Employee
{
	int empCode;
	String name;
	String designation;
	/**
	 * 
	 */
	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param empCode
	 * @param name
	 * @param designation
	 */
	public Employee(int empCode, String name, String designation)
	{
		super();
		this.empCode = empCode;
		this.name = name;
		this.designation = designation;
	}
	/**
	 * @return the empCode
	 */
	public int getEmpCode()
	{
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(int empCode)
	{
		this.empCode = empCode;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation()
	{
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
		
}
