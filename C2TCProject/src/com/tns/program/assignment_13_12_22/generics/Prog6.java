package com.tns.program.assignment_13_12_22.generics;

import java.util.LinkedList;
import java.util.List;

class Data6<T>
{
	private T myVariable;

	public Data6(T myVariable) {
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
public class Prog6 {

	public static void main(String[] args) 
	{
		List<Data6<String>> objString = new LinkedList<>();
		objString.add(new Data6<String>("Hello"));
		objString.add(new Data6<String>("1"));
		objString.add(new Data6<String>("11.677"));
		objString.add(new Data6<String>("a"));
		objString.add(new Data6<String>("12.6f"));
		System.out.println(objString);
		
		List<Data6<Integer>> objInteger = new LinkedList<>();
		objInteger.add(new Data6<Integer>(1));
		objInteger.add(new Data6<Integer>(2));
		objInteger.add(new Data6<Integer>(3));
		objInteger.add(new Data6<Integer>(4));
		objInteger.add(new Data6<Integer>(5));
		System.out.println(objInteger);
		
		List<Data6<Float>> objFloat = new LinkedList<>();
		objFloat.add(new Data6<Float>(1.1f));
		objFloat.add(new Data6<Float>(2.2f));
		objFloat.add(new Data6<Float>(3.3f));
		objFloat.add(new Data6<Float>(4.4f));
		objFloat.add(new Data6<Float>(5.5f));
		System.out.println(objFloat);
		
		List<Data6<Character>> objCharacter = new LinkedList<>();
		objCharacter.add(new Data6<Character>('1'));
		objCharacter.add(new Data6<Character>('2'));
		objCharacter.add(new Data6<Character>('3'));
		objCharacter.add(new Data6<Character>('a'));
		objCharacter.add(new Data6<Character>('b'));
		System.out.println(objCharacter);
		
		List<Data6<Boolean>> objBoolean = new LinkedList<>();
		objBoolean.add(new Data6<Boolean>(true));
		objBoolean.add(new Data6<Boolean>(false));
		System.out.println(objBoolean);
		
		List<Data6<Long>> objLong = new LinkedList<>();
		objLong.add(new Data6<Long>(11232314l));
		objLong.add(new Data6<Long>(2214324324l));
		objLong.add(new Data6<Long>(3432579082345l));
		objLong.add(new Data6<Long>(4347123780l));
		objLong.add(new Data6<Long>(543512654l));
		System.out.println(objLong);
		
		List<Data6<Double>> objDouble = new LinkedList<>();
		objDouble.add(new Data6<Double>(11232.1232324));
		objDouble.add(new Data6<Double>(2214324324.12341234));
		objDouble.add(new Data6<Double>(3432579082345.13241324));
		objDouble.add(new Data6<Double>(4347123780.1341324));
		objDouble.add(new Data6<Double>(543.132414));
		System.out.println(objDouble);
		
		
	}

}
