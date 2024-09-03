package deezoho;

import java.util.Scanner;

public class searcharr {
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" enter n : ");
		int n = s.nextInt();
		System.out.print(" enter find :");
		int find = s.nextInt();
		int[] arr = new int[n];
		System.out.print(" enter elements : ");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = s.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i]==find)
			{
				System.out.print(" The element is at the index :" + i );
			}
		}
		s.close();
	}

}
