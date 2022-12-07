package com.tns.program.array;

public class Prog2 
{
	public static void main(String[] args) 
	{
		// Two Dimensional Array
//		int a[][] = new int[3][3];
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}		
			System.out.println();
			
		}
		
	}
}
