package com.tns.program.array;

public class Prog3 
{

	public static void main(String[] args) 
	{
		// Jagged Array
		
		int arr[][] = new int[5][];
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];
		arr[3] = new int[2];
		arr[4] = new int[4];
		int count = 0;
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j =0; j<arr[i].length;j++)
			{
				arr[i][j] = count++;
			}
		}
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j =0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
