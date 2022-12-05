package com.tns.program;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Byte");
		byte byteEx = sc.nextByte();
		
		System.out.println("Enter Short");
		short shortEx = sc.nextShort();
		
		System.out.println("Enter Integer");
		int integerEx = sc.nextInt();
		
		System.out.println("Enter Long");
		long longEx = sc.nextLong();
		
		System.out.println("Enter Float");
		float floatEx = sc.nextFloat();
		
		System.out.println("Enter Double");
		double doubleEx = sc.nextDouble();
		
		System.out.println("Enter Character");
		char charEx = sc.next().charAt(0);
		
		System.out.println("Enter Boolean");
		boolean booleanEx = sc.nextBoolean();
		
		System.out.println("Byte = "+byteEx);
		System.out.println("Short = "+shortEx);
		System.out.println("Integer = "+integerEx);
		System.out.println("Long = "+longEx);
		System.out.println("Float = "+floatEx);
		System.out.println("Double = "+doubleEx);
		System.out.println("Character = "+charEx);
		System.out.println("Boolean = "+booleanEx);
		
	}

}
