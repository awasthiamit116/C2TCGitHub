package com.tns.program.assignment_8_12_22.multithreading;

class Eclipse extends Thread
{
	public void run() 
	{
		System.out.println("Eclipse Thread ID is "+Thread.currentThread().getId());
	}
}

class Sketchbook extends Thread
{
	public void run() 
	{
		System.out.println("Sketchbook Thread ID is "+Thread.currentThread().getId());
	}
}

class Chrome extends Thread
{
	public void run() 
	{
		System.out.println("Chrome Thread ID is "+Thread.currentThread().getId());
	}
}

public class Prog1 {
	

	

	public static void main(String[] args) 
	{
		Eclipse obj = new Eclipse();
		obj.start();
		
		Sketchbook obj2 = new Sketchbook();
		obj2.start();
		
		Chrome obj3 = new Chrome();
		obj3.start();
	}

}
