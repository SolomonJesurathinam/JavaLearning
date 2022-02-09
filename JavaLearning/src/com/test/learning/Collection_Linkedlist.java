package com.test.learning;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection_Linkedlist {

	/*LINKED LIST
	 * insertion is good, retreival is bad
	 * implements only serializable and clonable (doesnt implement Random access)
	 * insertion order is maintaned
	 * duplicates is allowed
	 * 
	 */
	
	
	public static void method() {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);
		
		System.out.println(linkedlist);
		
		linkedlist.addFirst(1);
		linkedlist.addLast(5);
		System.out.println(linkedlist);
		
		//Get
		System.out.println("Get First "+linkedlist.getFirst());
		System.out.println("Get Last "+linkedlist.getLast());
		System.out.println("Get value with index "+linkedlist.get(3));
		
		//remove
		linkedlist.removeFirst();
		System.out.println("Remove Firtst " +linkedlist);
		linkedlist.removeLast();
		System.out.println("Remove last "+linkedlist);
		
		//poll removed the first element
		linkedlist.poll();
		System.out.println("First element delete "+linkedlist);
		
		linkedlist.pollLast();
		System.out.println("Delete last element "+linkedlist);
		
		//Add
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.add(8);
		
		//Occurance
		linkedlist.removeFirstOccurrence(4);  // we can use last occurance also
		System.out.println(linkedlist);
		
		//Iterations -- Normal for loop, for each loop, Iterator, Listiterator
		
	}
	public static void main(String[] args) {

		method();
	}

}
