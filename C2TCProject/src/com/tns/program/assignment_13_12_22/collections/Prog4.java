package com.tns.program.assignment_13_12_22.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Prog4 
{

	public static void main(String[] args) 
	{
		Set<Integer> obj = new LinkedHashSet<>();
		
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
