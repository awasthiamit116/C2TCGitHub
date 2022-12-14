package com.tns.program.assignment_13_12_22.generics;

class Data2<T>
{
	private T obj;

	public Data2(T obj) 
	{
		this.obj = obj;
	}

	public T getObj() 
	{
		return obj;
	}

	@Override
	public String toString() 
	{
		return "Data_generic [obj=" + obj + "]";
	}

}

public class Prog2 
{

	public static void main(String[] args) 
	{
		
		Data2<String> obj_generic = new Data2<String>("Hello");
		String outG = obj_generic.getObj();
		System.out.println(outG);
		
	}

}

