package com.test.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList {
	
	/*
	 * Collections - List, Set, Queue (all interfaces)
	 * Map is not from collection interface
	 * Implementation classes --> List - ArrayList, Linkedlist, vector and Stack (vector stack are legacy)
	 * ARRAYLIST
	 * Insertion order is maintained
	 * Duplicates is allowed
	 * Null insertion is possible
	 * Arraylist is non-synchronized (not supports multithreading)
	 * resizeable array or growable array (default is 10)
	 * growth rate: current size _ currrentsize/2
	 * Array list is hetrogeneous (if generics is not used we can add any value)
	 * Best for search operations -- worst on insertion and deletion
	 * implements RandomAccess, Serializable and cloneable interfaces
	 */

	
	public static void method1() {
		
		List <String> arrlist = new ArrayList<String>();
		arrlist.add("1");
		arrlist.add("2");
		arrlist.add("3");
		arrlist.add("4");
		arrlist.add("4");
		System.out.println(arrlist);
		
		System.out.println(arrlist.get(1));  //get value using index
		System.out.println(arrlist.indexOf("4"));  // get 1st index of matched value
		System.out.println(arrlist.lastIndexOf("4"));  //get last index value of matched value
		System.out.println(arrlist.indexOf("Solo"));//-1 returns when no value is matching
		
		List<String> copylist = new ArrayList<String>();
		copylist.addAll(arrlist);   //copy list to another list
		System.out.println(copylist);
	
		copylist.clear(); //delete all contents in list
		System.out.println(copylist);
		
		arrlist.remove(0);  //can remove using index and value
		System.out.println(arrlist); //if duplicate, 1st value will be removed
		
		arrlist.add(null);  //can insert null
		System.out.println(arrlist);
		
		arrlist.set(0, "updated"); //update using index
		System.out.println(arrlist);
		
		System.out.println(arrlist.isEmpty());  
		System.out.println(copylist.isEmpty());
		
		//Iterate
		for (String str:arrlist) {
			System.out.println("Using for each " +str);
		}
		
		for(int i=0; i<arrlist.size(); i++) {
			System.out.println("Using for loop"+arrlist.get(i));
		}
		
		System.out.println("------------LIST ITERATOR-------------");
		
		ListIterator<String> list_iterator = arrlist.listIterator();
		//Forward
		while(list_iterator.hasNext()) {
			System.out.println("Forward " +list_iterator.next());
		}
		//Reverse
		System.out.println("---------------- Previous-------");
		while(list_iterator.hasPrevious()) {
			System.out.println("Reverse "+list_iterator.previous());
		}
		
		
	System.out.println("----------ITERATOR----------");
	//only forward
	Iterator <String> iterator = arrlist.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("--------NON-synhronized multi threadig is not supported---");
	
	for (String str:arrlist) {
		System.out.println("Using for each " +str);
		arrlist.add("test");
	}
	
	
	
	}
	
			
			
	public static void main(String[] args) {
		
		method1();
		
	}

}
