package com.test.learning;


// data + methods = Class

public class ObjectClass {

	//primitive data types
	long acc_num = 12345687l; //long data types should be addressed with l
	int balance = 350;
	double test = 1.5;
	boolean test1;
	
	//Wrapper class - wraps the data types and forms a class
	Long Accnumber = 12344444l;
	Integer Balancee = 250;
	String name = "Solomon";
	Boolean test12;
	
	public void getBalance() {
		System.out.println("Balance is " + Balancee);
	}
	

	//return types -- returns the value from method.. should give correct datatype
	public int rtType() {
		int rt = 500;
		return rt;
	}
	
/*  Constructor
 * What is Constructor - block of code that initializes the newly created object
 * Properties - name should be same as Class name, no explicit return type, cannot be abstract, static, final and synchronized
 * Types of Constructors - Default, No Argument, Parameterized.
 * Default - Even if we dont give any constructor, compiler will provide.Used for providing default values like 0, null etc
 * No Argument - Arguments will not be there. This is not DEFAULT Constructor.. If a constructor is created, default constructor is overridden
 * Paramaterized - passing arguments 
 * Constructor overloading - Constructor is called based on the parameter provided
 */
	
	int default1;   //returns 0
	String default12; //returns null
	Integer default123; // returns null as its a class
	
	//No argument constructor
	public ObjectClass() {
		System.out.println("print no argumnent");
	}
	
	//Paramaterized constructor
	public ObjectClass(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		//ClassName objname = new Classname() syntax
		ObjectClass objectClass = new ObjectClass();   //constructor is getting called no argument
		ObjectClass objectClass1 = new ObjectClass(50000);    //paramaterized constructer is getting called
		objectClass.getBalance();
		
		int got = objectClass.rtType();
		System.out.println(got);
		
		//Default Constructor
		System.out.println(objectClass.default1 + objectClass.default12 + objectClass.default123);
		
		
	}
	
}
