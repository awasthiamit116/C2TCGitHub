package com.tns.program.assignment_8_12_22.exceptions;

public class Prog4 {
	
	void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible");
		}
		else
		{
		System.out.println("Eligible");
		}

	}
	public static void main(String[] args) 
	{
		Prog4 p4 = new Prog4();
		p4.validate(10);
		System.out.println("Welcome to B37");
	}

}
