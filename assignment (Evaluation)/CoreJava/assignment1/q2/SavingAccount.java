/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a BankAccount class and let it provide different interest
 * on different account (Saving or Current Account).
 * Role of this File: This file implements the abstract method of BankAccount class. 
*/
package org.cybage.assignments.assignment1.q2;

public class SavingAccount extends BankAccount {

	//Implements the abstract method
	//return an interest of 1.5f
	@Override
	public float calcInterest() {
		// TODO Auto-generated method stub
		return 1.5f;
	}

}
