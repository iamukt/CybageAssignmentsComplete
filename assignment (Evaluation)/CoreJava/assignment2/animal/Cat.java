package org.cybage.assignment.assignment2.animal;

public class Cat extends Animal {
@Override
public void respirate() {
	System.out.println("Cat is respirating");
	
}@Override
	public void talk() {
		System.out.println("Meow");
		
	}
@Override
	public void print() {
		// TODO Auto-generated method stub
		respirate();
		talk();
	}
}
