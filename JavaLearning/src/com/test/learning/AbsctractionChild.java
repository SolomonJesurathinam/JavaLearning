package com.test.learning;


public class AbsctractionChild extends Absctraction {
	
	public void test() {
		System.out.println("Test1");
	}
	
	public void test1() {
		System.out.println("Test2");
	}

	//object can be created only when all the abstract methods are implemented as concrete methods
	
	public static void main(String[] args) {

		Absctraction ch = new AbsctractionChild();
		ch.test();
		ch.test1();
	}

}
