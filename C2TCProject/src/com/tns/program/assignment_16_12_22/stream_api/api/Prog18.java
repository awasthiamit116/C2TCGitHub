package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;

public class Prog18 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result = 0;
		for(int i:values)
		{
			if(i%5==0) 
			{
				result +=i;
			}
		}
		
		System.out.println(result);
		
	}

}
