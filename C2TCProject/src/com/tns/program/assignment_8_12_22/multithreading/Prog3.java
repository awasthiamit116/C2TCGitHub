package com.tns.program.assignment_8_12_22.multithreading;


class Prog3ThreadClass implements Runnable
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread ID is "+ Thread.currentThread().getId());
		}
	}
}
public class Prog3 
{
	public static void main(String[] args)
	{
		Prog3ThreadClass obj = new  Prog3ThreadClass();
		Thread obj1 = new Thread(obj);
		obj1.start();
		
		for(int i =0;i<5;i++) {
			System.out.println("Main thread is "+Thread.currentThread().getId());
		}
	}

}
