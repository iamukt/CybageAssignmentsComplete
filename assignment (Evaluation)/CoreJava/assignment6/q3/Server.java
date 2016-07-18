/**
 * @author Umesh Kumar Toke
 * Problem Name: Simple Chat Application
 * Role of this File: Server Side 
 */
package org.cybage.assignments.assignment6.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server
{
	public static void main(String[] args)
	{
		try
		(
			Scanner sc = new Scanner(System.in);
			//Server side socket creation 
			ServerSocket ss = new ServerSocket(5460);
			//Listening at the port and accepting the connection
			Socket cs= ss.accept();
			//PrintWriter for writing the data to client
			//BufferedReader to read the data from the client
			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			PrintWriter pw = new PrintWriter(cs.getOutputStream());
		)
		{
			System.out.println(br.readLine());
			pw.println("Request Granted..Now you are connected to the server");
			pw.flush();
			String accept;
			String send = "";
			//Responding to the client till the server says thankyou
			while(!send.equals("thankyou"))
			{
				send = sc.nextLine();
				pw.println(send);
				pw.flush();
				accept = br.readLine();
				System.out.println("Client: "+accept);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
