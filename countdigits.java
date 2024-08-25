package deezoho;

import java.util.Scanner;

public class countdigits {
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = s.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num / 10;
			count++;
		}
		System.out.print("The Count of digits : " + count);
		
	}

}
