package com.tns.program.access_modifiers;

public class AccessModifiersEx2 
{

	public static void main(String[] args) 
	{
		System.out.println("Accessing data members in different class and same package");
		AccessModifiersEx ob = new AccessModifiersEx();
		
		System.out.println("Public int a = "+ob.a);
		System.out.println("Protected int b = "+ob.b);
		System.out.println("Default int c = "+ob.c);
		// System.out.println("Private int d = "+ob.d);
		
		ob.methPublic();
		ob.methProtected();
		ob.methDefault();
		// ob.methPrivate();
		System.out.println("Private data members cannot be accessed");
		
		
	}

}
