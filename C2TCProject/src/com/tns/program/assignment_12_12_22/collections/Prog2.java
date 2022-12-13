package com.tns.program.assignment_12_12_22.collections;

import java.util.Stack;

public class Prog2 
{

	public static void main(String[] args) 
	{
		Stack <Integer> obj = new Stack<>();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		
		obj.pop();
		System.out.println(obj);
	
		System.out.println(obj.peek());
		
		System.out.println(obj.search(40));
		
	}

}
