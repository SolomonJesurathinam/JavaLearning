package com.test.learning;


//Process of binding data and methods together into a single unit is encapsulation

public class Interface_checker implements Interfacee {
	
	@Override
	public void test1() {
		System.out.println("test12");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args) {

		Interfacee int1 = new Interface_checker();
		int1.test1();
		int1.test2();
	}

}
