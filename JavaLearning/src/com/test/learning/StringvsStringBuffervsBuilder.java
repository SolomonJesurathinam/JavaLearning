package com.test.learning;

public class StringvsStringBuffervsBuilder {

	
	/*
	 * String is immutable
	 * String buffer is mutable -- uses the same object 
	 * String buffer is synchronised - multiple threads cannot access it
	 * cant create using literal, can create only using new Keyword
	 * 
	 * string buffer and string builder methods are same
	 * String builder is mutable
	 * String buffer is synchronised and not support multi threading
	 * string builder is not synchronised and will support multi threading
	 * 
	 * String builder is more efficient than String buffer
	 */
	public static void main(String[] args) {
		
		System.out.println("String is immutable");
		String name="Solo";
		System.out.println("Concat "+name.concat("mon"));
		System.out.println(name);
		
		System.out.println("String Buffer is mutable");
		StringBuffer name1= new StringBuffer("Solo");
		System.out.println("Append "+name1.append("mon"));
		System.out.println(name1);

		//StringBuffer methods 
		//Reverse    string cant be reversed with functions,only we can write logic to it
		System.out.println(name1.reverse());
		
		//Replace
		System.out.println(name1.replace(0, 1, "m"));
		
		//delete
		System.out.println(name1.delete(0, 1));
		
		//insert
		System.out.println(name1.insert(4, "monnnnn"));
		
		//capacity
		System.out.println(name1.capacity());
		
	}

}
