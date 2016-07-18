/**
 * @author Umesh Kumar Toke
 * Problem Name: Override the equals and toString method in 
 * Account and Employee class
 * Role of this File: This file toString and equals method 
 * in Account class. 
 */
package org.cybage.assignments.assignment3.q1;

public class Account {
	String accName;
	long accNo;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accName, long accNo) {
		super();
		this.accName = accName;
		this.accNo = accNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (accNo != other.accNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accNo=" + accNo + "]";
	}
	
	
	
	
	
}
