package com.tns.program.assignment_12_12_22.collections;

import java.util.LinkedList;

public class Prog3 {

	public static void main(String[] args) 
	{
		LinkedList<String> obj = new LinkedList<>();
		obj.add("India");
		obj.add("USA");
		obj.add("China");
		obj.add("Japan");
		obj.add("Egypt");
		
		System.out.println(obj);
		
		obj.set(1, "Canada");
		
		System.out.println(obj);
		
		
		obj.addFirst("Australia");
		obj.addLast("Austria");
		System.out.println(obj);
		
		obj.set(3, "japan");
		System.out.println(obj);
		
		obj.remove();
		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);
		
	}

}
