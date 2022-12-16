package com.tns.program.assignment_15_12_22.lambda_expression;

interface Lambda2
{
	public void disp();
}

public class Prog2 
{

	public static void main(String[] args) 
	{
//		Thread obj = new Thread(new Runnable() {
//			
//			@Override
//			public void run() 
//			{
//				System.out.println("This is one thread");
//			}
//		});
//		
//		obj.start();
		
		new Thread(()->{
			System.out.println("This is one thread");
		}
				);
		
		
		
	}

}
