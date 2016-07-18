/**
 * @author Umesh Kumar Toke
 * Problem Name: Create Account class with account type, account number, minimum balance
 * and current balance and provide getter and setter methods along with callinterest 
 * method. Create FixedDepositAccount, CurrAccount classes and inherit from Account class.
 * Use Account class in customer class to store account information in the 
 * customer object. 
 * Role of this File: Account class   
 */
package org.cybage.assignmentbytrainer.q6;

public class Account
{
	private int accNo;
	private int currBal;
	private String type;
	private final static int minBal=1000;
	
	public enum accType
	{
		CURRENT,SAVING
	}
	/**
	 * @return the accNo
	 */
	public int getAccNo()
	{
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	/**
	 * @return the currBal
	 */
	public int getCurrBal()
	{
		return currBal;
	}
	/**
	 * @param currBal the currBal to set
	 */
	public void setCurrBal(int currBal)
	{
		this.currBal = currBal;
	}
	/**
	 * @return the minbal
	 */
	public static int getMinbal()
	{
		return minBal;
	}
	public float callInterest()
	{
		return 0.0F;
	}
	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
}
