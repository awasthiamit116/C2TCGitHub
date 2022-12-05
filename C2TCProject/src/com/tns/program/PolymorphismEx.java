package com.tns.program;

class Addition
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	
}


public class PolymorphismEx extends Addition
{

	public static void main(String[] args) 
	{
		PolymorphismEx ob = new PolymorphismEx();
		
		System.out.println(ob.add(1,2));
		System.out.println(ob.add(1,2,3));
		System.out.println(ob.add(1.1,2.1));
		
	}

}
