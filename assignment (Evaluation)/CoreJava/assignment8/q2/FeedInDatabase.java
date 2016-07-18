/**
 * @author Umesh Kumar Toke
 * Problem Name: 1)Insert and update Employee data in database and display 
 * it using PreparedStatement. Insert SomeRecords in Student table also.
 * 2)Write Generic code to display col. names of a table along with the data
 * in the table for employee as well as student table.
 * Role of this File:  
 * This file is responsible for interaction with the two class and entering the data into database 
 */
package org.cybage.assignments.assignment8.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.sql.ResultSet;

import java.sql.PreparedStatement;

public class FeedInDatabase
{
	/**
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * 
	 */
	//For Employee class data creation
	private Employee emp;
	//For Student class data creation
	private Student stud;
	//For Sql connection
	private Connection con;
	private PreparedStatement pst1,pst2,pst3,pst4,pst5,pst6;
	private Scanner sc = new Scanner(System.in);
	public FeedInDatabase() throws ClassNotFoundException, SQLException
	{
		String driver,url,username,password;
		//JDBC properties taken from resource.properties
		//This makes the program to be loosely coupled with the database
		//Driver and credential details can be given in resouce.properties
		ResourceBundle rb = ResourceBundle.getBundle("org.cybage.assignments.assignment8.q1.resource");
		driver = rb.getString("driver");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		//Locate and load the driver 
		Class.forName(driver);
		//Connection created
		con = DriverManager.getConnection(url,username,password);
		//All the prepared statements that are already known
		pst1 = con.prepareStatement("select * from employee");
		pst2 = con.prepareStatement("select * from student");
		pst3 = con.prepareStatement("insert into employee values(?,?,?)");
		pst4 = con.prepareStatement("insert into student values(?,?,?)");
		pst5 = con.prepareStatement("update employee set name=? , designation=? where empCode=?");
		pst6 = con.prepareStatement("update student set name=? , division=? where rollNo=?");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		FeedInDatabase fd = new FeedInDatabase();
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Insert into Employee table");
			System.out.println("2.Insert into Student table");
			System.out.println("3.Update Employee table");
			System.out.println("4.Update Student table");
			System.out.println("5.Display Employee table(with Metadata)");
			System.out.println("6.Display Student table(with Metadata)");
			System.out.println("7.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: fd.insertEmployee();
						break;
				case 2: fd.insertStudent();
						break;
				case 3: fd.updateEmployee();
						break;
				case 4: fd.updateStudent();
						break;
				case 5: fd.displayEmployee();
						break;
				case 6: fd.displayStudent();
						break;
				case 7: System.exit(0);		
				default: System.out.println("Invalid Choice");
			}
		}while(choice != 7);
		sc.close();
	}
	
	//To Insert the employee records into database
	public void insertEmployee() throws SQLException
	{
		emp=new Employee();
		System.out.println("Enter the no. of rows you want to insert");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Code");
			emp.setEmpCode(sc.nextInt());
			System.out.println("Enter Name");
			emp.setName(sc.next());
			System.out.println("Enter Designation");
			emp.setDesignation(sc.next());
			pst3.setInt(1, emp.getEmpCode());
			pst3.setString(2, emp.getName());
			pst3.setString(3, emp.getDesignation());
			pst3.executeUpdate();
		}

	}
	
	//To insert the student records into the database
	public void insertStudent() throws SQLException
	{
		stud = new Student();
		System.out.println("Enter the no. of rows you want to insert");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Rollno");
			stud.setRollNo(sc.nextInt());
			System.out.println("Enter Name");
			stud.setName(sc.next());
			System.out.println("Enter division");
			stud.setDivision(sc.next());
			pst4.setInt(1, stud.getRollNo());
			pst4.setString(2, stud.getName());
			pst4.setString(3, stud.getDivision());
			pst4.executeUpdate();
		}
	}
	
	//To Update the employee record from the database (empCode required)
	public void updateEmployee() throws SQLException
	{
		emp=new Employee();
		System.out.println("Enter Employee Code");
		emp.setEmpCode(sc.nextInt());
		System.out.println("Enter Name");
		emp.setName(sc.next());
		System.out.println("Enter Designation");
		emp.setDesignation(sc.next());
		pst5.setInt(3, emp.getEmpCode());
		pst5.setString(1, emp.getName());
		pst5.setString(2, emp.getDesignation());
		if(pst5.executeUpdate() == 0)
		{
			System.out.println("No data found with Employee Code: "+emp.getEmpCode());
		}
		displayEmployee();
	}
	
	//To update student record from the database (rollNo required)
	public void updateStudent() throws SQLException
	{
		stud = new Student();
		System.out.println("Enter Rollno");
		stud.setRollNo(sc.nextInt());
		System.out.println("Enter Name");
		stud.setName(sc.next());
		System.out.println("Enter division");
		stud.setDivision(sc.next());
		pst6.setString(1, stud.getName());
		pst6.setString(2, stud.getDivision());
		pst6.setInt(3, stud.getRollNo());
		if(pst6.executeUpdate() == 0)
		{
			System.out.println("No data found with Roll No: "+stud.getRollNo());
		}
		displayStudent();
	}
	
	//Display Employee record from database with metadata
	public void displayEmployee() throws SQLException
	{
		ResultSet rst = pst1.executeQuery();
		while(rst.next())
		{
			System.out.print(rst.getMetaData().getColumnName(1)+": ");
			System.out.println(rst.getInt(1));
			System.out.print(rst.getMetaData().getColumnName(2)+": ");
			System.out.println(rst.getString(2));
			System.out.print(rst.getMetaData().getColumnName(3)+": ");
			System.out.println(rst.getString(3));
		}
	}
	
	//Display student record from database with metadata
	public void displayStudent() throws SQLException
	{
		ResultSet rst = pst2.executeQuery();
		while(rst.next())
		{
			System.out.print(rst.getMetaData().getColumnName(1)+": ");
			System.out.println(rst.getInt(1));
			System.out.print(rst.getMetaData().getColumnName(2)+": ");
			System.out.println(rst.getString(2));
			System.out.print(rst.getMetaData().getColumnName(3)+": ");
			System.out.println(rst.getString(3));
		}
	}
	
}
