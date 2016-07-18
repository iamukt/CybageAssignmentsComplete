package org.cybage.assignment.assignment2.printable;
import org.cybage.assignment.assignment2.animal.*;
import org.cybage.assignment.assignment2.shapes.*;

public class Utils {
	public void printAll(Printable[] p)
	{
		p[0] = new Cat();
		p[1] = new Dog();
		p[2] = new Circle();
		p[3] = new Rectangle();
		p[4] = new Triangle();
		for(int i=0;i<5;i++)
			p[i].print();
	}
	public static void main(String[] args) {
		Printable[] p = new Printable[5];
		new Utils().printAll(p);
	}
}
