package com.tns.program.assignment_12_12_22.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prog1 
{

	public static void main(String[] args) 
	{
		Queue<Integer> obj = new PriorityQueue<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		
		obj.remove();
		System.out.println(obj);
		
		obj.poll();
		System.out.println(obj);
	}

}
