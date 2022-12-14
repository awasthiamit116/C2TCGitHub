package com.tns.program.assignment_13_12_22.collections;

import java.util.Set;
import java.util.TreeSet;

public class Prog5 {

	public static void main(String[] args) 
	{
		Set<Integer> obj = new TreeSet<>();
		
		for(int i=10;i>0;i--)
		{
			obj.add(i);
		}
		for(int i:obj)
		{
		System.out.println(i);
		}
	}

}
