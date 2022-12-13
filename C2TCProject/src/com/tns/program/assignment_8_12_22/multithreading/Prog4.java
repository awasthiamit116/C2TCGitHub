package com.tns.program.assignment_8_12_22.multithreading;

class Prog4ThreadClass extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread ID is "+ Thread.currentThread().getId());
		}
	}
}

public class Prog4 {

	public static void main(String[] args) 
	{
		Prog4ThreadClass obj1 = new Prog4ThreadClass();
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		
		Prog4ThreadClass obj2 = new Prog4ThreadClass();
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj2.start();
		
		Prog4ThreadClass obj3 = new Prog4ThreadClass();
		obj3.setPriority(Thread.NORM_PRIORITY);
		obj3.start();
	}

}
