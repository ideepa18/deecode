package deezoho;

import java.util.Scanner;

public class rotatekarr {
	public static void main(String []args )
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" enter the size : ");
		int size = s.nextInt();
		
		System.out.print(" enter k : ");
		int k = s.nextInt();
		
		int[] arr1 = new int[size];
		
		int[] arr2 = new int[size];
		
		System.out.print(" enter elements for array 1 : ");
		for(int i = 0 ; i < size ; i++)
		{
			arr1[i] = s.nextInt(); 
		}
		
		for(int i = 0 ; i < size ; i ++ )
		{
			arr2[(i + k ) % size ] = arr1[i];
		}
		
		System.out.print(" The Array after " + k + " number of Rotations : ");
		for(int i = 0 ; i < size ; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		s.close();
	}	

}
