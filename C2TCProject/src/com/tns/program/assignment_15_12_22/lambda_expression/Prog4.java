package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda4
{
	abstract public void disp(int x, float y);
}


public class Prog4 
{

	public static void main(String[] args) 
	{
		Lambda4 obj =(int x, float y)->
		{
			System.out.println("Value of x is: "+x+"\nValue of y is: "+y);
		};
		
		obj.disp(67,123.3f);
		
	}

}
