package com.test.learning;

public class NextClass {
	
	/*Conditional statements
	 * if(condition){}
	 * 		else{}
	 * 
	 * if(condition){}
	 * else if(condition){}
	 * else{}
	 * 
	 * switch (key){
	 * case value:
	 * code block
	 * case value1:
	 * code block:
	 * default:
	 * code block
	 * 
	 * if a condition is satisfied in switch case, it will execute all the cases, so only we should use break to exit.
	 * 
	 *break keyword to exit
	 *continue keyword to continue with the loop
	 * 
	 */

	
	public void forloop() {
		
		//for(initilization; contition; increment/decrement)
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	int a = 1;
	static int b =1;
	public void whileloop() {
		//while(condition){}
		while (a<=5) {
			System.out.println("While "+a);
			a++;
		}
	}
	
	public static void dowhile() {
		//do{} while(condition)
		do {
			System.out.println("dooo "+b);
			b++;
		}while(b<=5);
		
	}
	
	public static void nonstatic() {
		dowhile();    // can call static method in a non static method
	}
	
	//static keyword - used for class, variables, function it can be called without any object.. it belongs to class
	//A class can have more static block --> used for initializes static variables, it executes when class is loaded in memory
	// static variable is shared among all the instances of the class, only single copy is created	
	// a class can be static only if its a nested class
	
	
	static{
		System.out.println("Static 1");
	}
	static{
		System.out.println("Static 1");
	}
	static{
		System.out.println("Static 1");
	}
	static{
		System.out.println("Static 1");
	}
	
	
	public static void main(String[] args) {
		
		NextClass nextClass = new NextClass();
		nextClass.forloop();
		nextClass.whileloop();
		dowhile();    //calling static method
	}

}
