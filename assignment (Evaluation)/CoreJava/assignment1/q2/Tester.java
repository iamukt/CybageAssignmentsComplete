/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a BankAccount class and let it provide different interest
 * on different account (Saving or Current Account).
 * Role of this File: This is a tester file that calls the implemented
 * methods of CurrentAccount and SavingAccount class.  
*/
package org.cybage.assignments.assignment1.q2;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Interest rate in Savings account is: "+new SavingAccount().calcInterest());
		System.out.println("Interest rate in Current account is: "+new CurrentAccount().calcInterest());
	}
}
