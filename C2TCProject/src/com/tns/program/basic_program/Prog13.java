package com.tns.program.basic_program;

public class Prog13 {

	public static void main(String[] args) 
	{
		// Value of x is other than 1,2,3
		
		int x = 10;
		if(x==1)
		{
			System.out.println("Value of x is 1");
		}
		else if(x==2)
		{
			System.out.println("Value of x is 2");
		}
		else if(x==3)
		{
			System.out.println("Value of x is 3");
		}
		else
		{
			System.out.println("Value of x is other than 1,2,3");
		}
		
		// Value of x is 1
		
		x = 1;
		if(x==1)
		{
			System.out.println("Value of x is 1");
		}
		else if(x==2)
		{
			System.out.println("Value of x is 2");
		}
		else if(x==3)
		{
			System.out.println("Value of x is 3");
		}
		else
		{
			System.out.println("Value of x is other than 1,2,3");
		}
		
		// Value of x is other than 1,2,3
		
		x = 10;
		// Switch takes less time than if else
		
		switch (x)
		{
		case 1:
			System.out.println("Value of x is 1");
			break;
		case 2:
			System.out.println("Value of x is 2");
			break;
		case 3:
			System.out.println("Value of x is 3");
			break;
		default:
			System.out.println("Value of x is other than 1,2,3");


		}
		
	}

}
