/**
 * @author Umesh Kumar Toke
 * Problem Name: An application can have Animal class  and its specialized 
 * sub classes like Cat and Dog. These subclasses will override the default behavior
 * provided by Animal class + some of its own specific behavior, like calling methods 
 * (eat(),makeNoise()) to show polymorphism. 
 * Role of this File: This file consist of tester class that test the cat 
 * and dog classes
 * */
package org.cybage.assignmentbytrainer.q7;

class Tester {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Dog();
		a[1] = new Cat();
		a[0].eat();
		a[0].makeNoise();
		a[1].eat();
		a[1].makeNoise();
	}
}
