/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a BankAccount class and let it provide different interest
 * on different account (Saving or Current Account)
 * Role of this File: This file declares an abstract class BankAccount whose 
 * method is implemented by SavingsAccount and PrivateAccount
 */
package org.cybage.assignments.assignment1.q2;

public abstract class BankAccount {
	//Abstract method for calculating Interest
	public abstract float calcInterest();
	
}
