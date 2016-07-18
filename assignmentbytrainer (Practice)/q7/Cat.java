/**
 * @author Umesh Kumar Toke
 * Problem Name: An application can have Animal class  and its specialized 
 * sub classes like Cat and Dog. These subclasses will override the default behavior
 * provided by Animal class + some of its own specific behavior, like calling methods 
 * (eat(),makeNoise()) to show polymorphism. 
 * Role of this File: This file consist of Cat class that extends Animal class  
 */
package org.cybage.assignmentbytrainer.q7;

public class Cat extends Animal {
@Override
public void eat() {
	System.out.println("Cat is eating");
	
}@Override
	public void makeNoise() {
		System.out.println("Meow");
		
	}
}
