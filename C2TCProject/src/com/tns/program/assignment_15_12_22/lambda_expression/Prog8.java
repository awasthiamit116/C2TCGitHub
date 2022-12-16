package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda8
{
	abstract public float disp();
}


public class Prog8
{

	public static void main(String[] args) 
	{
		Lambda8 obj =()-> 124.12f ;
		{
			System.out.println(obj.disp());
		};
		
		
	}

}
