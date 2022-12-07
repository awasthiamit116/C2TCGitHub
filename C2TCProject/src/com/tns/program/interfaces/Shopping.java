package com.tns.program.interfaces;


interface Flipkart
{
	abstract void cart();
	abstract void orderonline();
	abstract void delivery();
}

class ElectronicsSeller implements Flipkart

{
	public void cart()
	{
		System.out.println("Laptop");
		System.out.println("Television");
		System.out.println("Mobile");
	}
	public void orderonline()
	{
		System.out.println("Electronics Order Recieved by Flipkart");
		System.out.println("Order packaging in progress");
		System.out.println("Order out for delivery");
	}
	
	public void delivery() 
	{
		System.out.println("Electronics Order Delivered by Flipkart");
//		System.out.println("");
	}
}

class FurnitureSeller implements Flipkart

{
	public void cart()
	{
		System.out.println("Sofa-set");
		System.out.println("Dining Table");
		System.out.println("Bed");
	}
	public void orderonline()
	{
		System.out.println("Furniture Order Recieved by Flipkart");
		System.out.println("Order packaging in progress");
		System.out.println("Order out for delivery");
	}
	
	public void delivery() 
	{
		System.out.println("Furniture Order Delivered by Flipkart");
//		System.out.println("");
	}
}

class FlipkartApp
{
	Flipkart selectSeller(char ch)
	{
		if(ch == 'e')
		{
			return new ElectronicsSeller();
		}
		else
		{
			return new FurnitureSeller();
		}
	}
}




public class Shopping {

	public static void main(String[] args) 
	{
		FlipkartApp ref = new FlipkartApp();
		Flipkart fk = ref.selectSeller('e');
		fk.cart();
		fk.orderonline();
		fk.delivery();
	}

}
