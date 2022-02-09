package com.test.learning;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection_TreeSet {
	
	/*
	 * TreeSet is implementaion of SortedSet, navigableSet
	 * Duplicates are not allowed
	 * Will be retrieved in natural sorting order
	 * DS is Binary Search Tree
	 * Heterogenous OBjects are not allowed (due to sorting implementaion)
	 * Null insertion is not allowed (allowed in 1st value until 1.6 version)
	 * For sorting order the objects should be homogenoous and comparable class
	 * String Buffer, Builder didnt implenmet comparable class, so we get ClassCase Exception
	 */
	
	public static void treeset() {
		TreeSet tree = new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(5);
		//tree.add("1");  //hetrogeneous not allowed
		tree.add(4);
		tree.add(0);
		
		System.out.println(tree);
		System.out.println("Return 1st value "+tree.first());
		System.out.println("Return last value "+tree.last());
		
		//headset
		System.out.println("Value lesser than given value "+tree.headSet(6));
		//tailset
		System.out.println("Value greater than given value "+tree.tailSet(5));
		//subset
		System.out.println("print in range "+tree.subSet(1, 5));
	
		//comparator returns null for default sorting order
		System.out.println(tree.comparator());
		
		System.out.println("Higher value returns "+tree.higher(5));
		System.out.println("Lower "+tree.lower(5));
		System.out.println("Retrieve and delete "+tree.pollFirst());
		System.out.println(tree);
		
	
		//Iterator
		//has normal iterator and also descending iterator
		
		Iterator it = tree.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	public static void main(String[] args) {

		treeset();
	}

}
