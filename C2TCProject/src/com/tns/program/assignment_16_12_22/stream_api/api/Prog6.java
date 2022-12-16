package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Prog6
{
	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	
		Consumer<Integer> c = i->System.out.println(i);
			values.forEach(c);

		
		
	}

}
