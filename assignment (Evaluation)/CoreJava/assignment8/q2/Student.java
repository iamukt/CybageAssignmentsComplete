/**
 * @author Umesh Kumar Toke
 * Problem Name: 1)Insert and update Employee data in database and display 
 * it using PreparedStatement. Insert SomeRecords in Student table also.
 * 2)Write Generic code to display col. names of a table along with the data
 * in the table for employee as well as student table.
 * Role of this File:  Student class 
 */
package org.cybage.assignments.assignment8.q2;

public class Student
{
	int rollNo;
	String name;
	String division;
	/**
	 * 
	 */
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param rollNo
	 * @param name
	 * @param division
	 */
	public Student(int rollNo, String name, String division)
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.division = division;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo()
	{
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
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
	 * @return the division
	 */
	public String getDivision()
	{
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(String division)
	{
		this.division = division;
	}
	
}
