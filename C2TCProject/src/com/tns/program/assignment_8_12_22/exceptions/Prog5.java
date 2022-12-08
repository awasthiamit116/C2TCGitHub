package com.tns.program.assignment_8_12_22.exceptions;

import java.io.IOException;

public class Prog5 
{
	void m1()
	{
		System.out.println("No exception");
	}
	
	void m2() throws IOException
	{
		throw new IOException("Device eror or exception may happen");
	}
	
	void m3() throws ArithmeticException, IOException, ClassNotFoundException
	{
		throw new ArithmeticException("Arithmatic exception may happen");
	}
	
	public static void main(String[] args) 
	{
		
	}
}
