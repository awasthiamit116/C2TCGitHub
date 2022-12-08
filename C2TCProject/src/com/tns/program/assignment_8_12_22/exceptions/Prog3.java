package com.tns.program.assignment_8_12_22.exceptions;

// Try and multiple catch blocks

public class Prog3 
{

	public static void main(String[] args) 
	{
		int a[] = new int [4];
		try 
		{
			a[9] = 50/0;
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("I am the last line");
	}

}
