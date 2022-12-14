package com.tns.program.assignment_13_12_22.generics;


class Data
{
	private String str;

	public Data(String str) 
	{
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "Data [str=" + str + "]";
	}
	
}


class Data_generic<T>
{
	private T obj;

	public Data_generic(T obj) 
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

public class Prog1 
{

	public static void main(String[] args) 
	{
		Data obj = new Data("Hello Batch B37");
		String out = obj.getStr();
		System.out.println(out);
		
		Data_generic<String> obj_generic = new Data_generic<String>("Hello");
		String outG = obj_generic.getObj();
		System.out.println(outG);
		
	}

}
