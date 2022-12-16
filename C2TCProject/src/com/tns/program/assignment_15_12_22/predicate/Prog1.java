package com.tns.program.assignment_15_12_22.predicate;

import java.util.function.IntPredicate;

public class Prog1 
{

	public static void main(String[] args) 
	{
//		IntPredicate obj = new IntPredicate() {
//			
//			@Override
//			public boolean test(int age) {
//				if(age<18) 
//				{
//					return true;
//				}
//				else
//				{
//					return false;
//				}
//			}
//		};
//		
//		System.out.println(obj.test(15));
//		System.out.println(obj.test(155));
		
		IntPredicate obj2 = i -> i>18;
		
		IntPredicate obj3 = i -> i<40;
		
		System.out.println(obj2.test(123));
		System.out.println(obj2.and(obj3).test(24));
		
		

	}

}
