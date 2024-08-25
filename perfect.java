package deezoho;

import java.util.Scanner;

public class perfect {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = s.nextInt();
		int dnum = 0 ;
		for(int i = 1 ; i<num ; i++)
		{
			if(num%i==0)
			{
				dnum = dnum + i ;
			}
		}
		if(dnum == num)
		{
			System.out.print("Yes , perfect number ");
		}
		else 
		{
			System.out.print("No , not a perfect number");
		}
	}

}
