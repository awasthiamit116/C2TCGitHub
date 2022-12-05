package com.tns.program;

abstract class Computer
{
	public abstract void useKeyboard();
	public abstract void useMouse();
	public void turnOn()
	{
		System.out.println("Turning On");
	}
	public void turnOff() 
	{
		System.out.println("Turning Off");
	}
}

class Acer extends Computer
{

	
	
	@Override
	public void useKeyboard() 
	{
		System.out.println("Using Acer Keyboard");
	}

	@Override
	public void useMouse() 
	{
		System.out.println("Using Acer Mouse");
	}
	
}

public class AbstractionEx 
{

	public static void main(String[] args) 
	{
		Acer ob = new Acer();
		ob.turnOn();
		ob.useMouse();
		ob.useKeyboard();
		ob.turnOff();
	}

}
