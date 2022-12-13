package com.tns.program.assignment_8_12_22.multithreading;


class NewThreadClass extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++) {
		System.out.println("New Thread ID is "+Thread.currentThread().getId());
		}
	}
}


public class Prog2 
{
	
	public static void main(String[] args) 
	{
		NewThreadClass obj1 = new NewThreadClass();
		obj1.start();
		
		for(int i =0;i<5;i++) 
		{
			System.out.println("Main thread ID is "+Thread.currentThread().getId());
			
		}
	}

}
