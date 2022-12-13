package com.tns.program.assignment_12_12_22.collections;

import java.util.ArrayList;

public class Prog4 {

	public static void main(String[] args) 
	{

		ArrayList<String> obj = new ArrayList<>();
		obj.add("India");
		obj.add("USA");
		obj.add("China");
		obj.add("Japan");
		obj.add("Egypt");
		System.out.println(obj);
		
		obj.remove("china");
		System.out.println(obj);
		
		obj.remove("China");
		System.out.println(obj);
		
		obj.set(3, "japan");
		System.out.println(obj);
		
		System.out.println(obj.indexOf("USA"));
		
	}

}
