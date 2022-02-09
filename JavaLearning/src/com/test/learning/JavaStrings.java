package com.test.learning;

public class JavaStrings {

	/*
	 * String is sequence of char values
	 * String is immutable, its constant
	 * java.lang.String
	 * CharSequence interface is main interface for String
	 * CharSequence - String, StringBuffer, StringBuilder
	 * 
	 * Create String 1. String Literal --> String str = "test";
	 * 2. By new Keyword --> String s = new String("test");
	 * String literal will allocate same memory if the string value is same(memory saving)
	 * new keyword will create seperate memory spaces (memory hogging)
	 * 
	 */
	
	public static void main(String[] args) {
		
		String name1 = "Solo";    //String is inmmutable will not change its value
		name1 = "Testing";       //solo is not overrided to testing. only the connection is changed to testing
		System.out.println(name1);  //so in heap memory both are avaible and it will be collected by garbage collections

		//String methods
		
		String name = "Solomon";
		
		//returns character value for the particular index
		System.out.println(name.charAt(1));
		
		//returns the string length
		System.out.println(name.length());
		
		//check the equality of string with the given object
		System.out.println(name.equals("solomon"));
		
		//check equal ignoring case
		System.out.println(name.equalsIgnoreCase("solomon"));
		
		//check if string is empty or not
		System.out.println(name.isEmpty());
		
		//given value is present or not
		System.out.println(name.contains("olo"));
		
		//particulat portion of string
		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 6));
		
		//appends the strings
		System.out.println(name.concat("test"));
		
		//replaces the existing char with given char
		System.out.println(name.replace('o', '1'));
		System.out.println(name.replace("Solo", "test"));
		
		//find the position of char
		System.out.println(name.indexOf('o'));
		
		//find the position of char after specified post
		System.out.println(name.indexOf('o',4));
		
		//remove space before and after
		System.out.println(name.trim());
		
		//convert given data to String
		int number=3;
		System.out.println(String.valueOf(number));
		
		//changing case
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//join string with delimiter
		System.out.println(String.join("/", "30","5","1990"));
		
		//split
		String splitthis = "Am i teacing good";
		String [] splitted = splitthis.split(" ");
		for(String string:splitted) {
			System.out.println(string);
		}
		
	}

}
