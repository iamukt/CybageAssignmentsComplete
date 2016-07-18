/**
 * @author Umesh Kumar Toke
 * Problem Name: Creater a class student with id, name, as parameters. Create 
 * a method setData() to set the values of given parameters. Later on add age
 * as a parameter to the class and call the method to display id, name, and age
 * of student using polymorphism.
 * Role of this File: This file consist of student class that solves the above 
 * problem
 */
package org.cybage.assignmentbytrainer.q4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Student {
	int id;
	String name;
	int age;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	//setData() as specified in the first part of the question
	public void setData(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	//Overloaded setData() to add age dynamically
	public void setData(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int roll;
		Student st = new Student();
		System.out.println("No of studetns that you want to create: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Roll no: ");
			roll = sc.nextInt();
			System.out.println("Name: ");
			String nme = sc.next();
			st.setData(roll, nme);
			list.add(st);
		}
		System.out.println("Enter the student id whose age you want to add: ");
		roll = sc.nextInt();
		//Student temp = new Student();
		//temp.setId(roll);
		int flag=0;
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student temp = itr.next();
			if(temp.getId() == roll)
			{
				System.out.println("Age: ");
				int age = sc.nextInt();
				temp.setData(age);
				break;
			}
		}
		System.out.println(list);
	}
}
