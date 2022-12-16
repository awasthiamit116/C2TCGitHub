package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;

public class Prog20 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		System.out.println(values
				.stream()
				.filter(i->i%5==0)
				.reduce(0, (c,e)->c+e));
		
	}

}
