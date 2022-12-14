package com.tns.program.assignment_13_12_22.generics;

import java.util.LinkedList;
import java.util.List;

class Data5<T>
{
	private T myVariable;

	public Data5(T myVariable) {
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
public class Prog5 {

	public static void main(String[] args) 
	{
		List<Data5<Object>> obj = new LinkedList<>();
		obj.add(new Data5<Object>("Hello"));
		obj.add(new Data5<Object>(1));
		obj.add(new Data5<Object>(11.677));
		obj.add(new Data5<Object>('a'));
		obj.add(new Data5<Object>(12.6f));
		System.out.println(obj);
	}

}
