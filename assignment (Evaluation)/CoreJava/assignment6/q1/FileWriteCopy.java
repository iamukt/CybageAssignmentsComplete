/**
 * @author Umesh Kumar Toke
 * Problem Name: Write user input to a file 
 * and copy the fiel to another one
 * Role of this File: Accepts user input to a file 
 * and copy the contents to another one
 */
package org.cybage.assignments.assignment6.q1;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteCopy {
	private static String userInput;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Input: ");
		userInput = sc.nextLine();
		//To accept the input and write it to the file
		try
		(
			PrintWriter pw = new PrintWriter(new FileWriter("source1.txt"));
				
		){
			pw.println(userInput);
			
		}catch(IOException ioe)
		{
			System.out.println("Can't write to the specified file");
		}
		
		//To copy from one file to another
		try(
		BufferedReader br = new BufferedReader(new FileReader("source1.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("source2.txt"));
		)
		{
			try 
			{
				String temp;
				while((temp = br.readLine()) != null)
					pw.println(temp);
			
			}catch(EOFException eof)
			{
				System.out.println("File Copied");
			}
		}catch (IOException ioe) {
			// TODO: handle exception
			System.out.println("Can't write to the specified file");
		}
	}
	
}
