/**
 * @author Umesh Kumar Toke
 * Problem Name: An application can have Animal class  and its specialized 
 * sub classes like Cat and Dog. These subclasses will override the default behavior
 * provided by Animal class + some of its own specific behavior, like calling methods 
 * (eat(),makeNoise()) to show polymorphism. 
 * Role of this File: This file consist of Animal class  
 */
package org.cybage.assignmentbytrainer.q7;

public class Animal 
{
	public void eat()
	{
		System.out.println("Animals eat food");
	}
	public void makeNoise()
	{
		System.out.println("Animals make different noises");
	}
}
