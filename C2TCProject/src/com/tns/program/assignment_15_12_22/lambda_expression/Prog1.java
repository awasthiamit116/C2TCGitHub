package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda
{
	public void disp();
}


public class Prog1 {

	public static void main(String[] args) 
	{
		Lambda obj = ()-> 
		{
			System.out.println("I am from disp method");
			System.out.println("I am from disp method");
			System.out.println("I am from disp method");
			System.out.println("I am from disp method");
		};
		
		obj.disp();
	}

}
