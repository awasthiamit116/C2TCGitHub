package com.tns.program.access_modifiers2;

import com.tns.program.access_modifiers.AccessModifiersEx;

public class AccessModifiersEx3 
{

	public static void main(String[] args) 
	{
		System.out.println("Accessing data members in different class and different package");
		AccessModifiersEx ob = new AccessModifiersEx();
		System.out.println("Public int a = "+ob.a);
//		System.out.println("Protected int b = "+ob.b);
//		System.out.println("Default int c = "+ob.c);
//		System.out.println("Private int d = "+ob.d);
		
		ob.methPublic();
//		ob.methProtected();
//		ob.methDefault();
//		ob.methPrivate();
		System.out.println("Only public data members can be accesssed without inheritance");

	}

}
