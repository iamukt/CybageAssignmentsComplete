/**
 * @author Umesh Kumar Toke
 * Problem Name: Call System.gc() and check whether Garbage Collector runs or not.
 * Role of this File: This file calls the garbage collector explicitly 
 */
package org.cybage.assignments.assignment3.q2;

public class GarbageCollector {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Before garbage collector runs "+Runtime.getRuntime().freeMemory());
	}
	
	public static void main(String[] args) {
		System.out.println("Before Object Creation"+Runtime.getRuntime().freeMemory());
		GarbageCollector gc1 = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		gc1=null;
		gc2=null;
		//Calling garbage collector explicitly
		//Before garbage collector runs it will
		//call finalize method.
		System.gc(); 
	}
}
