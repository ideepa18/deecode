package deezoho;

import java.util.Scanner;

public class myclass {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = s.nextInt();
		if(num%2==0)
		{
			System.out.print("even ! ");
		}
		else
		{
			System.out.print("odd !");
		}
	}

}
