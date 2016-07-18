/**
 * @author Umesh Kumar Toke
 * Problem Name: Accept no. from command line and sort them.
 * Role of this File: Accepts command line argument and sorts them
 */
package org.cybage.assignments.assignment3.q3;

import java.util.Set;
import java.util.TreeSet;

public class SortCommmandLine {
	//TreeSet for sorting purpose	
	private static Set<Integer> tset = new TreeSet<>();
	public static void main(String[] args) {
		//Accepting the no
		//Parsing it into Integer format 
		//adding it to TreeSet.
		for(int i=0;i<args.length;i++)
			tset.add(Integer.parseInt(args[i]));
		System.out.println(tset);
	
	}
}
