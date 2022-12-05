package com.tns.program;

public class EncapsulationEx 
{
	
	String name;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) 
	{
		EncapsulationEx ob = new EncapsulationEx();
		ob.setName("Amit");
		System.out.println(ob.getName()); 
		
		
	}

}
