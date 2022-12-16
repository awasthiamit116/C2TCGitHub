package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda3
{
	abstract public void disp(int x);
}


public class Prog3 
{

	public static void main(String[] args) 
	{
		Lambda3 obj =(int x)->
		{
			System.out.println("Value of x is: "+x);
		};
		
		obj.disp(67);
		
	}

}
