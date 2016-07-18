/**
 * @author Umesh Kumar Toke
 * Problem Name: Create Account class with account type, account number, minimum balance
 * and current balance and provide getter and setter methods along with callinterest 
 * method. Create FixedDepositAccount, CurrAccount classes and inherit from Account class.
 * Use Account class in customer class to store account information in the 
 * customer object. 
 * Role of this File: CurrAccount that extends Account class and overrides 
 * callInterest method   
 */
package org.cybage.assignmentbytrainer.q6;

public class CurrAccount extends Account
{	
	@Override
	public float callInterest()
	{
		return 1.5F;
	}
}
