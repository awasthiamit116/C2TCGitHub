package com.tns.program.assignment_13_12_22.collections;

import java.util.HashSet;
import java.util.Set;

public class Prog2 
{
// Set - Only stores unique values (Duplicate values not allowed)

	public static void main(String[] args) 
	{
		Set<String> obj = new HashSet<>();
		obj.add("Amit");
		obj.add("Test 1");
		obj.add("Test 2");
		obj.add("Test 3");
		obj.add("Test 4");
		
		System.out.println(obj);
		
		System.out.println(obj.contains("Test 3"));
		
//		HashSet is case sensitive
		
		System.out.println(obj.contains("test 3"));

		
	}

}
