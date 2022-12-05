package com.tns.program;

class ParentEx	// Parent Class
{
	String eyesColor;
	String hairColor;
	int money;
	
	public void walk()
	{
		System.out.println("I am walking");
	}
	
	public void talk()
	{
		System.out.println("I am talking");
	}
	
	public void work()
	{
		System.out.println("I am working");
	}
	
}

public class InheritanceEx extends ParentEx // Child Class
{
	public static void main(String[] args) {
		
		InheritanceEx ob = new InheritanceEx();
		ob.eyesColor = "Brown";
		ob.hairColor = "Black";
		
		ob.walk();
		ob.talk();
		ob.work();
		
	}
}
