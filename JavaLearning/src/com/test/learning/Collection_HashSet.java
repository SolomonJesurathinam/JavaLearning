package com.test.learning;

import java.util.HashSet;
import java.util.Iterator;


public class Collection_HashSet {
	
	/*
	 * Set is child interface of Collection
	 * Duplicates are not allowed
	 * insertion order is not maintained.
	 * can insert Hetrogenous objects if generics are not used
	 * 
	 * HashSet
	 * Data Structure is Hash table which is HashMap instance
	 * Null elements are allowed
	 * Implements Serializable and Cloneable interfaces
	 * Load factor is 75%, default capacity is 16
	 * Data is stored on hashcode so search is very effective
	 */

	/*
	 * HashSet hs = new HashSet();  //size-16 and fill ratio .75
	 * HashSet hs = new HashSet(int intialsize); fill ratio .75 default
	 * HashSet hs = new HashSet(int initialsize, float fillRatio);
	 * HashSet hs = new HashSet(Collection c);
	 */
	
	public static void basic() {
		HashSet <String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add(null);
		hs.add("2");  //boolean method will reurn false so it will not be added again
		
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.contains("1"));
		
		//Iterator
		Iterator <String> iterator = hs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {

		basic();
	}

}
