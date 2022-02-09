package com.test.learning;

/*
 * Abstract method - without implementation.. in child class it will hide the implementation details
 * Abstract class 1. if a class is having unimplemented method, then the method should be de4clared abstract
 * 2. If a class is having abstract method, then the class should be made abstract
 * 3.It can have both abstract method and concrete method
 * 4.Class can be declared abstract without having abstract method
 * 5.We cannot create object for abstract class
 * 6. Child class needs to implement all abstract method, else child class also need to be declared as abstract
 */


public abstract class Absctraction {

	public abstract void test();
	
	public abstract void test1();
	
	public void test2() {
		System.out.println("Test 3");
	}
	
}
