/**
 * @author Umesh Kumar Toke
 * Problem Name: Problem Name: Create a Customer class with relevant information like name,address,
 * account number, current balance. Create a bank application class and add customer
 * to the bank application with relevant methods like addcustomer, delete customer, 
 * update customer and getCustomerInfo.
 * Role of this File: This file consist of Custmer class which will be used by
 * Bank Application class.
 */
package org.cybage.assignmentbytrainer.q3;

public class Customer {
	String name;
	String address;
	long accNo;
	float cr;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String address, long accNo, float cr) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
		this.cr = cr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public float getCr() {
		return cr;
	}
	public void setCr(float cr) {
		this.cr = cr;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accNo="
				+ accNo + ", cr=" + cr + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accNo ^ (accNo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accNo != other.accNo)
			return false;
		return true;
	}
	
}
