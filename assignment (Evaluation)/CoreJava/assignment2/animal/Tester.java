package org.cybage.assignment.assignment2.animal;

public class Tester {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Dog();
		a[1] = new Cat();
		a[0].respirate();
		a[0].talk();
		a[0].respirate();
		a[1].talk();
	}
}
