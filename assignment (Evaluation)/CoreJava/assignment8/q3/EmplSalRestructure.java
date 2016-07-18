/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a stored procedure for updating the basic salary
 * of employees as 10% HRA should be added to basic salary.
 * In this problem the programmer is assuming the HRA to be 52k annually 
 * 
 * Role of this File: This file is responsible for calling the procedure and 
 * updating the salary of each and every employee to salary+0.10*HRA
 * 
 * Attachments: Procedure and output file is attached with this file
 */
package org.cybage.assignments.assignment8.q3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;

public class EmplSalRestructure
{
	//Connection reference
	private Connection con;
	private CallableStatement cst;
	private PreparedStatement pst;
	public EmplSalRestructure() throws ClassNotFoundException, SQLException
	{
		String driver, url, username, password;
		// JDBC properties taken from resource.properties
		// This makes the program to be loosely coupled with the database
		// Driver and credential details can be given in resouce.properties
		ResourceBundle rb = ResourceBundle
				.getBundle("org.cybage.assignments.assignment8.q1.resource");
		driver = rb.getString("driver");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		// Locate and load the driver
		Class.forName(driver);
		// Connection created
		con = DriverManager.getConnection(url, username, password);// TODO
		//Prepare statement for listing the employee records from the database
		pst = con.prepareStatement("select * from employee");															// Auto-generated
	}
	
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException
	{
		EmplSalRestructure esr = new EmplSalRestructure();
		//Call the procedure pr_emp(IN hr double)
		esr.cst = esr.con.prepareCall("{call pr_emp(?)}");
		//Setting the HRA to 52000 (per annum)
		esr.cst.setDouble(1, 52000);
		//Executing the procedure
		esr.cst.execute();
		System.out.println("Salary Updated");
		//Calling the function to display the employee
		esr.displayEmployee();
	}

	// Display Employee record from database with metadata
	public void displayEmployee() throws SQLException
	{
		ResultSet rst = pst.executeQuery();
		while (rst.next())
		{
			System.out.print(rst.getMetaData().getColumnName(1) + ": ");
			System.out.println(rst.getInt(1));
			System.out.print(rst.getMetaData().getColumnName(2) + ": ");
			System.out.println(rst.getString(2));
			System.out.print(rst.getMetaData().getColumnName(3) + ": ");
			System.out.println(rst.getString(3));
			System.out.print(rst.getMetaData().getColumnName(4) + ": ");
			System.out.println(rst.getString(4));
			
		}
	}

}
