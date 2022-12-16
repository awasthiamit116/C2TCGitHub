package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prog1 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		for(int i=0;i<6;i++) 
		{
			System.out.println(values.get(i));
		}
	
	}

}
