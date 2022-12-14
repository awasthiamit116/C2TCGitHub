package com.tns.program.assignment_12_12_22.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Prog6 {
	
	void Display(List<String> list)
	{
		ListIterator<String> ob = list.listIterator();
		
		while(ob.hasNext()) 
		{
			System.out.println("Element is "+ob.next());
		}
	}

	public static void main(String[] args) 
	{
		LinkedList<String> obj = new LinkedList<>();
		obj.add("India");
		obj.add("USA");
		obj.add("China");
		obj.add("Japan");
		obj.add("Egypt");
		System.out.println(obj);
		
		Prog6 p6 = new Prog6();
		Collections.reverse(obj);
		p6.Display(obj);
		System.out.println("______________");
		obj.sort(null);
		p6.Display(obj);
	}

}
