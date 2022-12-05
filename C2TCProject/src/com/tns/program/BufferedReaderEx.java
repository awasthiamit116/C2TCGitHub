package com.tns.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx 
{

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		System.out.println("Enter Byte");
		str = br.readLine();
		byte byteEx = Byte.parseByte(str);
		
		System.out.println("Enter Short");
		str = br.readLine();
		short shortEx = Short.parseShort(str);
		
		System.out.println("Enter Integer");
		str = br.readLine();
		int integerEx = Integer.parseInt(str);
		
		System.out.println("Enter Long");
		str = br.readLine();
		long longEx = Long.parseLong(str);
		
		System.out.println("Enter Float");
		str = br.readLine();
		float floatEx = Float.parseFloat(str);
		
		System.out.println("Enter Double");
		str = br.readLine();
		double doubleEx = Double.parseDouble(str);
		
		System.out.println("Enter Boolean");
		str = br.readLine();
		boolean booleanEx = Boolean.parseBoolean(str);
		
		System.out.println("Enter Character");
//		str = br.readLine();
		char charEx = (char)br.read();
		
	
		
		System.out.println("Byte = "+byteEx);
		System.out.println("Short = "+shortEx);
		System.out.println("Integer = "+integerEx);
		System.out.println("Long = "+longEx);
		System.out.println("Float = "+floatEx);
		System.out.println("Double = "+doubleEx);
		System.out.println("Boolean = "+booleanEx);
		System.out.println("Character = "+charEx);
		
	}

}
