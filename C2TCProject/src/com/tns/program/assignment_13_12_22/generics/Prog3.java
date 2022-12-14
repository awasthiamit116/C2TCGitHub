package com.tns.program.assignment_13_12_22.generics;

class Data3<T>
{
	private T obj;

	public Data3(T obj) 
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

public class Prog3 
{

	public static void main(String[] args) 
	{
		
		Data3<Boolean> obj_Boolean= new Data3<Boolean>(true);
		Boolean outBoolean = obj_Boolean.getObj();
		System.out.println(outBoolean);
		
		
		Data3<String> objString = new Data3<String>("Hello");
		String outString = objString.getObj();
		System.out.println(outString);
		
		Data3<Integer> obj_Integer= new Data3<Integer>(12);
		Integer outInteger = obj_Integer.getObj();
		System.out.println(outInteger);
		
		Data3<Float> obj_Float= new Data3<Float>(8.22f);
		Float outFloat = obj_Float.getObj();
		System.out.println(outFloat);
		
		Data3<Double> obj_Double= new Data3<Double>(8124234.12334123);
		Double outDouble = obj_Double.getObj();
		System.out.println(outDouble);
		
		Data3<Long> obj_Long= new Data3<Long>(8214231484213l);
		Long outLong = obj_Long.getObj();
		System.out.println(outLong);
		
		Data3<Character> obj_Character= new Data3<Character>('a');
		Character outCharacter = obj_Character.getObj();
		System.out.println(outCharacter);
		
	}

}

