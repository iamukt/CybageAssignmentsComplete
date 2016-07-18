/**@author Umesh Kumar Toke
 * Problem Statement: Write a program to implement collection 
 * using spring framework
 * 
 * Role of this file: This file represents CollectionBean Class that has 
 * accessor and mutators for collection objects
 * 
 */
package beans;

import java.util.Map;
import java.util.Set;
import java.util.List;

public class CollectionBean 
{
	//List Reference
	private List<Customer> l1;
	//Map Reference
	private Map<Integer,Customer> map;
	//Set Reference
	private Set<Customer> set;
	
	
	public List<Customer> getL1() {
		return l1;
	}
	public void setL1(List<Customer> l1) {
		this.l1 = l1;
	}
	public Map<Integer, Customer> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Customer> map) {
		this.map = map;
	}
	public Set<Customer> getSet() {
		return set;
	}
	public void setSet(Set<Customer> set) {
		this.set = set;
	}
}
