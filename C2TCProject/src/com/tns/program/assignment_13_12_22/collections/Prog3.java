package com.tns.program.assignment_13_12_22.collections;

import java.util.HashSet;
import java.util.Set;

public class Prog3 {

	public static void main(String[] args) 
	{
		Set<Integer> obj = new HashSet<>();
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
