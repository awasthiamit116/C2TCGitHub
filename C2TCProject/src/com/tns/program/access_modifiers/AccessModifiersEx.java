package com.tns.program.access_modifiers;

public class AccessModifiersEx 
{
	public int a=1;
	public void methPublic()
	{
		System.out.println("Public Method");
	}
	
	protected int b=2;
	protected void methProtected()
	{
		System.out.println("Protected method");
		
	}
	int c = 3;
	void methDefault()
	{
		System.out.println("Default Method");
	}
	private int d = 4;
	private void methPrivate()
	{
		System.out.println("Private Method");
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Accessing data members in same class");
		AccessModifiersEx ob = new AccessModifiersEx();
		System.out.println("Public int a = "+ob.a);
		System.out.println("Protected int b = "+ob.b);
		System.out.println("Default int c = "+ob.c);
		System.out.println("Private int d = "+ob.d);
		
		ob.methPublic();
		ob.methProtected();
		ob.methDefault();
		ob.methPrivate();
	}
	
}
