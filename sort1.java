package deezoho;

import java.util.Arrays;
import java.util.Scanner;

public class sort1 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" size : ");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.print(" elements : ");
		for(int i = 0 ; i < size ; i++)
		{
				arr[i] = s.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int[] result = new int[size];
		int end = size - 1;
		int start = 0 ;
		
		for(int i = 0 ; i < size ; i++)
		{
			if(i % 2 == 0)
			{
				result[i] = arr[end--];
			}
			else
			{
				result[i] = arr[start++];
			}
			
		}
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(result[i] + " ");
		}
	}

}
