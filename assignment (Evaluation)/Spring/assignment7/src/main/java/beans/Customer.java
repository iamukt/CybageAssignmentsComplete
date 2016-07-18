/**@author Umesh Kumar Toke
 * Problem Statement: Write a program to implement collection 
 * using spring framework
 * 
 * Role of this file: This file represents Customer Class that is used by  
 * CollectionBean class as custom object
 * 
 */
package beans;

public class Customer
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	

}
