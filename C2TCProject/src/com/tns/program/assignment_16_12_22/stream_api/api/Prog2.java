package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prog2 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Iterator<Integer> i = values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
