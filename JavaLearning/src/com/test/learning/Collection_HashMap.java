package com.test.learning;

import java.util.HashMap;

public class Collection_HashMap {
	
	/*
	 * Map is not child interface of Collection
	 * Key-Value pair
	 * Duplicates Keys are not allowed
	 * Duplicates value are allowed
	 * 
	 * HashMap class implemented Map interface
	 * One null key is allowed
	 * Order is not maintained due to hashing
	 * Capacity intitial 16// /75%
	 */

	public static void map1() {
		
		HashMap <Integer, String >employee = new HashMap<Integer, String>();
		
		employee.put(1, "Solomon");
		employee.put(5, "Yolo");
		employee.put(2, "Saambaru");
		employee.put(3, "Rasam");
		
		System.out.println(employee);
		
		System.out.println("Key is present or not "+employee.containsKey(3));
		System.out.println("Value is present or not "+employee.containsValue("Solomon"));
		
		//put all, clone will copy all to another map

		System.out.println("Print only set "+employee.keySet());
		System.out.println("Get value "+employee.get(1));
		System.out.println("Get all values "+employee.values());
		System.out.println(employee.entrySet()); //print all key and value
		
		
		
	}
	public static void main(String[] args) {

		map1();
	}

}
