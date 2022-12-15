package com.tns.program.assignment_14_12_22.generics;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class KIA4
{
	private int vehicle;

	public KIA4(int vehicle) 
	{
		super();
		this.vehicle = vehicle;
	}

	public int getVehicle()
	{
		return vehicle;
	}

	public String toString() 
	{
		return "KIA [vehicle=" + vehicle + "]";
	}
}
class Seltos4 extends KIA4
{
	private String CarMode;

	public Seltos4(int vehicle, String carMode)
	{
		super(vehicle);
		CarMode = carMode;
	}

	public String getCarMode() 
	{
		return CarMode;
	}

	
	public String toString()
	{
		return "Seltos [CarMode=" + CarMode + "]";
	}
}



public class Prog4 {
	
	public static void disp(List<Object> list)
	{
		for(Object i:list)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
	List <Object> list=new ArrayList<>();
	
	list.add(new KIA4(1));
	list.add(new KIA4(4));
	list.add(new KIA4(2));
	list.add(new KIA4(3));
	list.add(new Seltos(1,"Hello"));
	list.add(new Seltos(2,"Welcome"));
	
	
	
	disp(list);

		
		
	}

}
