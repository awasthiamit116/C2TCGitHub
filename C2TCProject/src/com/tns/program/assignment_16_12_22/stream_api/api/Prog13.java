package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Prog13 
{

	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);

		System.out.println(values.stream().map(i->i*2).reduce(0, (c,e) -> c+e));
		
		
	}

}
