package com.test.learning;

/*
 * process of acquiring the properties (data + methods)
 * takes the properties - child class
 * gives - parent class
 * 
 * extends keyword
 * single : A -> B
 * Multi level: A -> B ->C
 * Multiple: A+B -> C (not supported in Java)
 * Hierarchial: A->B, A->C, A->D
 * 
 * Access modifiers
 * default - when no access modifier is specified - same class same package
 * private - only within the declared class
 * protected - within the same package or sub classes in different package.. but not in other package
 * public - from everywhere in the program
 */

public class Inheritance extends NextClass{
	
	
/*
 * Polymorphism
 * 1. Static or Compile or early binding or Overloading
 * 2. Dynamic or Runtime or late binding or overriding
 * 
 */
	
public void forloop() {
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	public void add (int a, int b) {
		System.out.println("Dummy1");
	}
	
	public void add (int a,  double b) {
		System.out.println("Dummy2");
	}

	public static void main(String[] args) {

		NextClass class1 = new NextClass();
		class1.whileloop();
		System.out.println("Old class");
		class1.forloop();             //parent method will be called
		System.out.println("End");
		Inheritance inhert = new Inheritance();
		inhert.add(1, 2);
		inhert.add(1, 1.5);   //differed using the parameters - overloading
		
		//overriding
		
		System.out.println("Latest");
		NextClass override = new Inheritance();    //parentclass object = new childclass ()
		override.forloop(); //overrided method will be called
		
	}

}
