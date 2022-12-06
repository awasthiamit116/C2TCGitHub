package com.tns.program.access_modifiers;

class Ex
{
	final void methEx1()
	{
		System.out.println("Final Method");	
	}
	void methEx2()
	{
		System.out.println("Default Method");
	}
}

public class FinalEx extends Ex
{

	public static void main(String[] args) 
	{
		FinalEx ob = new FinalEx();
		ob.methEx1();
		ob.methEx2();
		System.out.println("Final methods can be accessed using inheritance");
	}

}
