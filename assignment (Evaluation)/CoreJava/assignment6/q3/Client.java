/**
 * @author Umesh Kumar Toke
 * Problem Name: Simple Chat Application
 * Role of this File: Client Side
 */
package org.cybage.assignments.assignment6.q3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		
		try
		(
			Scanner sc = new Scanner(System.in);
			//Client Side Socket creation 
			Socket ss = new Socket("172.27.143.55",5460);
			//PrintWriter for writing the data to server
			//BufferedReader to read the data from the server
			PrintWriter pw = new PrintWriter(ss.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		)
		{	
			pw.println("Requesting Server to connect");
			//to flush the contents to the server
			pw.flush();
			System.out.println(br.readLine());
			String accept;
			String send = "";
			//Message passing till the client says thankyou or server ends the connection
			while(!send.equals("thankyou"))
			{
				accept = br.readLine();
				System.out.println("Server: "+accept);
				send = sc.nextLine();
				pw.println(send);
				pw.flush();
			}
			br.close();
			ss.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
