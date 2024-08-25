package deezoho;

import java.util.Scanner;

public class revnum {
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = s.nextInt();
		int rev = 0 ;
		while(num!=0)
		{
			int digit = num % 10;
			num = num / 10 ;
			rev = rev * 10 + digit ;
		}
		
		System.out.print(" The reversed number is " + rev);

}
	
}

