package deezoho;

import java.util.Scanner;

public class missingarr {
	public static int missinginarray(int n , int[] arr)
	{
		int[] hash = new int[n+1];
		
		for(int i = 0 ; i < n-1 ; i++)
		{
			hash[arr[i]]++;
		}
		
		for(int i = 1 ; i < n+1 ; i++)
		{
			if( hash[i] == 0 )
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" enter n : ");
		int n = s.nextInt();
		int[] arr = new int[n-1];
		System.out.print(" enter elements : ");
		for(int i = 0 ; i < n-1; i ++ )
		{
			arr[i]=s.nextInt();
		}
		s.close();
		System.out.println(" The missing number is " + missinginarray(n,arr));
	}

}
