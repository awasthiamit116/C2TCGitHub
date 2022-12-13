package com.tns.program.assignment_12_12_22.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Prog5 
{
	
	void Display(List<String> list)
	{
		Iterator<String> ob = list.iterator();
		while(ob.hasNext())
		{
			System.out.println("Element is: "+ob.next());
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
		
		Prog5 p5 = new Prog5();
		p5.Display(obj);
		
	}

}
