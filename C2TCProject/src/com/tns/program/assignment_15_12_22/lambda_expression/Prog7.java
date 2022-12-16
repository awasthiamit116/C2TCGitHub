package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda7
{
	abstract public String disp();
}


public class Prog7
{

	public static void main(String[] args) 
	{
		Lambda7 obj =()-> "Hello" ;
		{
			System.out.println(obj.disp());
		};
		
		
	}

}
