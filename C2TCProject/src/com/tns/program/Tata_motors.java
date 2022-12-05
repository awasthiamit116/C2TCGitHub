package com.tns.program;

public class Tata_motors 
{
	
	int carno;
	String Model;
	String engine;
	int speed;
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void display()
	{
		System.out.println("This is tatamotors, Welcome");
	}
	
	void DisplayLogo()
	{
		System.out.println("I m TataMotors");
	}
	public static void main(String[] args) 
	{
		Tata_motors obj = new Tata_motors();
		obj.display();
		obj.DisplayLogo();
		
		obj.setSpeed(1000);
		System.out.println(obj.getSpeed());
		
		
	}
	
}
