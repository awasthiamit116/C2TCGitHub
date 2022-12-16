package com.tns.program.assignment_16_12_22.stream_api.api;

import java.util.Arrays;
import java.util.List;

public class Prog28 
{
	public static void main(String[] args) 
	{

		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

		System.out.println(values
				.stream()
				.filter(Prog28::isDivisible)
				.map(Prog28::mapDouble)
				.findFirst()
				.orElse(0));
	}

	public static boolean isDivisible(int i)

	{
		return i%5==0;
	}

	public static int mapDouble(int i)
	{
		return i*2;
		}

}
