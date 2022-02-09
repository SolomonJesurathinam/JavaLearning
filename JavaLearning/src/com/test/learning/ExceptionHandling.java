package com.test.learning;

public class ExceptionHandling {

	//checked exception or complie time exception (shown in complile time itself
	//unchecked exception - run time exception
	//if there are no exception, catch will not be executed
	//finally block runs even exception occurs - used to close/clean the code
	//finally block is not independent
	//finally block can have exception
	//finally block will not execute when -- the thread is closed, system.exit is calledm when unrecoverble exception in finally block
	
	//System.exit(0);
	
	static String name;
	public static void main(String[] args) {

		try{
		System.out.println(name.length());
				}
		catch (ArithmeticException e) {
			System.out.println(e);
			name="d";
			System.out.println(name.length());
				}
		
		catch (NullPointerException e) {
			System.out.println(e);
			name="null";
			System.out.println(name.length());
				}
		
		catch (Exception e) {       // parent for all exception should be used at last
			System.out.println(e);
			name="das";
			System.out.println(name.length());
				}
		finally {
			System.out.println("i will run if exception will occur or not");
		}
		
	
	}
}
