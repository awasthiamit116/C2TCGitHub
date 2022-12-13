package com.tns.program.assignment_8_12_22.multithreading;

class Prog5ThreadClass extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread ID is "+ Thread.currentThread().getId());
			try 
			{
				sleep(2000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
//		try 
//		{
//			sleep(2000);
//		}
//		catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
	}
}


public class Prog5 
{

	public static void main(String[] args) 
	{
		Prog5ThreadClass obj = new Prog5ThreadClass();
		obj.start();
	}

}
