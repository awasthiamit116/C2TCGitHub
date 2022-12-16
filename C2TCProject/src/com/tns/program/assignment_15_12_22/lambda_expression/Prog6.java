package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda6
{
	abstract public int disp();
}


public class Prog6
{

	public static void main(String[] args) 
	{
		Lambda5 obj =()->(67+45/45);
		{
			System.out.println(obj.disp());
		};
		
		
	}

}
