
package com.tns.program.basic_program;

public class Prog14 {

	public static void main(String[] args) 
	{
		char ch = 'F';
		
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("Value of ch is a");
			break;
		case 'b':
		case 'B':
			System.out.println("Value of ch is b");
			break;
		case 'c':
		case 'C':
			System.out.println("Value of ch is c");
			break;
		default:
			System.out.println("Value of ch is other than a, b, c");
			break;
		}
		
		
		ch = 'b';
		
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("Value of ch is a");
			break;
		case 'b':
		case 'B':
			System.out.println("Value of ch is b");
			break;
		case 'c':
		case 'C':
			System.out.println("Value of ch is c");
			break;
		default:
			System.out.println("Value of ch is other than a, b, c");
			break;
		}
		
		String name = "te";
		
		switch(name.toLowerCase())
		{
		case "author":
			System.out.println("Amit");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Editor");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
	}

}
