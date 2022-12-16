package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;

public class Prog26 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(6,88,99);

		System.out.println(values
			.stream()
			.filter(i->i%5==0)
			.map(i->i*2)
			.findFirst()
			.orElse(0));
	
	}

}
