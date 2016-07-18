package org.cybage.assignment.assignment2.animal;

public class Dog extends Animal {
	@Override
	public void respirate() {
		System.out.println("Dog is respirating");
		
	}@Override
		public void talk() {
			System.out.println("Boow");
			
		}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		respirate();
		talk();
	}

}
