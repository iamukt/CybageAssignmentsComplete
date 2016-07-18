/**
 * @author Umesh Kumar Toke
 * Problem Name: Two members of joint account are trying to withdraw 3000
 * from the account simultaneously and balance is 5000. 
 * Create a multithreaded program to handle such situation. 
 * Role of this File: This file is used to handle multithreaded operation on
 * a single account(In this case represented by JointAccount class.
 */
package org.cybage.assignments.assignment7.q1;
import java.util.Scanner;
public class JointAccountHolder extends Thread {
	private JointAccount ja;
	//private String name;
	public JointAccountHolder(JointAccount ja)//,String name)
	{
		this.ja=ja;
		//this.name=name;
	}
	public static void main(String[] args) {
		
		JointAccount ja = new JointAccount();
		//Creation of two threads sharing the same reference
		JointAccountHolder husband = new JointAccountHolder(ja);
		JointAccountHolder wife = new JointAccountHolder(ja);
		husband.start();
		wife.start();
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is trying to access the account");
		//synchronizing JointAccount reference
		synchronized (ja)
		{
			int cost;
			Scanner sc = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName()+" is allowed to access");
			System.out.println("\nAmount that you want to withdraw: ");
			cost = sc.nextInt();
			 if(ja.balance-cost > 0)
			{
				 ja.balance-= cost ;
				 System.out.println("Remaining balance is: "+ja.balance);
			}
			else
				System.out.println("Insufficient Balance in the Account");
		//	sc.close();
		}
	}
	
}
