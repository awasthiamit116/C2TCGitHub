package com.tns.program.assignment_14_12_22.generics;

class Data1 <K extends Integer, V extends String>
{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public Data1(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data1 [key=" + key + ", value=" + value + "]";
	}
	
	public <E,N> void display(E element, N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}


public class Prog1 {

	public static void main(String[] args) 
	{
		Data1<Integer, String> obj_generic = new Data1<Integer,String>(10, "Amit");
		
		System.out.println("Key: "+obj_generic.getKey()+" value: "+obj_generic.getValue());
		obj_generic.display("Amit", 45);
		
	}

}
