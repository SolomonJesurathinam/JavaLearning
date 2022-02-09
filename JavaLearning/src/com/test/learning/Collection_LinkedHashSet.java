package com.test.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_LinkedHashSet {
	
	/*
	 * Linked Hashset is child class of Hashset.
	 * LinkedHashset is brought to maintain insertion order
	 * duplicates are not allowed
	 * DataStructure is HashTable +Linked List
	 */
	
	public static void basic() {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("1");
		hs.add("2");
		hs.add(null);
		hs.add("2");  //boolean method will reurn false so it will not be added again
		hs.add(1234);
		
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.contains("1"));
		
		//Iterator
		Iterator iterator = hs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {

		basic();
	}

}
