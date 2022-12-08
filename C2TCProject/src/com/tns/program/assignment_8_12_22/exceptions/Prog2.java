package com.tns.program.assignment_8_12_22.exceptions;

public class Prog2 {

	public static void main(String[] args) 
	{
		int [] a = new int [4];
		System.out.println("Welcome to b37");
	
		try 
		{
			int i = a[10];
			System.out.println(i);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Whatever happens it will get executed");
		}
		
		System.out.println("Hello b37");
	}

}
