package com.tns.program.interfaces;

// Interface explained by online ordering on Zomato


interface ZomatoCompany 
{
	abstract void menu();
	abstract void orderonline();
	abstract void delivery();
}

class Mauj implements ZomatoCompany

{
	public void menu()
	{
		System.out.println("North Indian");
		System.out.println("South Indian");
		System.out.println("Chinese");
	}
	public void orderonline()
	{
		System.out.println("Recieved by Zomato");
		System.out.println("Issue the order by Mauj Chef");
		System.out.println("Mauj chef will prepare according to their receipe");
	}
	
	public void delivery() 
	{
		System.out.println("Hand Over the food by Mauj chef to delivery person");
		System.out.println("");
	}
}

class Jalsa implements ZomatoCompany

{
	public void menu()
	{
		System.out.println("Oriental");
		System.out.println("Snacks");
		System.out.println("Dishes");
	}
	public void orderonline()
	{
		System.out.println("Recieved by Zomato");
		System.out.println("Issue the order by Jalsa Chef");
		System.out.println("Jalsa chef will prepare according to their receipe");
	}
	
	public void delivery() 
	{
		System.out.println("Hand Over the food by Jalsa chef to delivery person");
		System.out.println("");
	}
}

class ZomatoApp
{
	ZomatoCompany selectRestaurant(char ch)
	{
		if(ch == 'm')
		{
			return new Mauj();
		}
		else
		{
			return new Jalsa();
		}
	}
}


public class User 
{

	public static void main(String[] args) 
	{
		ZomatoApp ref = new ZomatoApp();
		ZomatoCompany zc = ref.selectRestaurant('m');
		zc.menu();
		zc.orderonline();
		zc.delivery();
	}

}
