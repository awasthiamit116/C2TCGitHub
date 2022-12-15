package com.tns.program.assignment_14_12_22.generics;

import java.util.ArrayList;
import java.util.List;

class KIA
{
	private int vehicle;
	
	
	public KIA(int vehicle) {
		super();
		this.vehicle = vehicle;
	}


	public int getVehicle() {
		return vehicle;
	}


	@Override
	public String toString() {
		return "KIA [vehicle=" + vehicle + "]";
	}
	
	
}

class Seltos extends KIA
{
	private String CarModel;

	public Seltos(int vehicle, String carModel) {
		super(vehicle);
		CarModel = carModel;
	}

	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "Seltos [CarModel=" + CarModel + "]";
	}
}



public class Prog3 {
	
	public static void disp(List<KIA> list)
	{
		for(KIA i: list)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		List<KIA> list = new ArrayList<>();
		
		list.add(new KIA(1));
		list.add(new KIA(2));
		list.add(new KIA(3));
		list.add(new KIA(4));
		list.add(new KIA(5));
		
		list.add(new Seltos(1,"Seltos"));
		list.add(new Seltos(2,"Sonet"));

		
//		System.out.println(list);
		disp(list);
		

		
		
	}

}
