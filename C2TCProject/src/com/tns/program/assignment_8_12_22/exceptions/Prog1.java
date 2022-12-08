package com.tns.program.assignment_8_12_22.exceptions;

public class Prog1 
{

	public static void main(String[] args) 
	{
		
		int numone = 50/5;
		System.out.println(numone);
		
		int numtwo = 50/10;
		System.out.println(numtwo);
		
		int numthree=0;
		try {
			numthree = 50/0;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(numthree);
		
		int numfour = 50/25;
		System.out.println(numfour);
		
		
		
		
	}

}
