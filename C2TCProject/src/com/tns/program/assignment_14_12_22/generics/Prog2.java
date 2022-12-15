package com.tns.program.assignment_14_12_22.generics;

import java.util.ArrayList;
import java.util.List;

class Data2
{
	public <E> void printListData(List<E>obj1)
	{
		for(E i:obj1) 
		{
			System.out.println(i);
		}
	}
	
	public <E> void printArrayData()
	{
		
	}
	
}

public class Prog2 {

	public static void main(String[] args) 
	{
		
		Data2 D = new Data2();
		
		List<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		D.printListData(obj1);
		
		System.out.println();
		
		List<String> obj2 = new ArrayList<>();
		obj2.add("Hello");
		obj2.add("Batch");
		obj2.add("B37");
		D.printListData(obj2);
		
		System.out.println();
		
		List<Float> obj3 = new ArrayList<Float>();
		obj3.add(1.23f);
		obj3.add(2.34f);
		obj3.add(3.56f);
		obj3.add(4.78f);
		obj3.add(5.90f);
		D.printListData(obj3);
		
		System.out.println();
		
		List<Long> obj4 = new ArrayList<Long>();
		obj4.add(1121241234l);
		obj4.add(2133414332l);
		obj4.add(32341324l);
		obj4.add(4432582354l);
		obj4.add(513112340l);
		D.printListData(obj4);
		
		System.out.println();
		
		List<Double> obj5 = new ArrayList<Double>();
		obj5.add(112.23123134);
		obj5.add(213.3423414332);
		obj5.add(32341.561324);
		obj5.add(44325.782354);
		obj5.add(51324.9112340);
		D.printListData(obj5);
		
		System.out.println();
		
		List<Boolean> obj6 = new ArrayList<Boolean>();
		obj6.add(false);
		obj6.add(true);
		D.printListData(obj6);
		
	}

}
