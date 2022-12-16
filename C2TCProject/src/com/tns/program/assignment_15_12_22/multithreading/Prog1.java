package com.tns.program.assignment_15_12_22.multithreading;

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class Prog1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Counter c = new Counter();
//		c.increment();
//		c.increment();
//		c.increment();
//		
//		System.out.println("Count "+c.count);
	
		Thread t1 = new Thread(new Runnable(){
			public void run()
			{
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
				});
		
		
		
		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
				});
		
		
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("Count "+c.count);
	}
};
