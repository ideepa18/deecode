package deezoho;

import java.util.Arrays;
import java.util.Scanner;

public class thirdmax {
	public static void main(String [] args)
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
		
		System.out.println(" The third max element : " + arr[size - 3]);
		
		s.close();
	}

}
