package com.Javaprograms;

public class FirstMinNoInArray
{
	public static void main(String[] args)
	{
		int arr[]= {10,54,23,35,43};
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("first maximum value is "+min);

     }
}