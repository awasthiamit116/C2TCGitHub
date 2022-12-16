package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda11
{
	abstract public boolean disp();
}


public class Prog11
{

	public static void main(String[] args) 
	{
		Lambda11 obj =()-> true ;
		{
			System.out.println(obj.disp());
		};
		
		
	}

}
