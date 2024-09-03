package deezoho;

import java.util.Arrays;
import java.util.Scanner;

public class equalarr {
     public static void main(String []args )
{
	Scanner s = new Scanner(System.in);
	System.out.print(" enter the size : ");
	int size = s.nextInt();
	
	int[] arr1 = new int[size];
	
	int[] arr2 = new int[size];
	
	System.out.print(" enter elements for array 1 : ");
	for(int i = 0 ; i < size ; i++)
	{
		arr1[i] = s.nextInt(); 
	}
	
	System.out.print(" enter elements for array 2 : ");
	for(int i = 0 ; i < size ; i++)
	{
		arr2[i] = s.nextInt(); 
	}
    
	boolean areequal = Arrays.equals(arr1, arr2);
	
	System.out.print(areequal);
	
	s.close();
		
	}

}
