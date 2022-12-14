package com.tns.program.assignment_13_12_22.generics;

import java.util.LinkedList;
import java.util.List;

class Data4<T>
{
	private T myVariable;

	public Data4(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	};
	
	
}
public class Prog4 {

	public static void main(String[] args) 
	{
		List<String> obj = new LinkedList<>();
		obj.add("Hello");
		obj.add("Batch");
		obj.add("B37");
		obj.add("Ap");
		obj.add("Program");
		System.out.println(obj);
	}

}
