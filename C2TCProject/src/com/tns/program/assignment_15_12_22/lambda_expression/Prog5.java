package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda5
{
	abstract public int disp();
}


public class Prog5
{

	public static void main(String[] args) 
	{
		Lambda5 obj =()->67;
		{
			System.out.println(obj.disp());
		};
		
		
	}

}
