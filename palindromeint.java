package deezoho;

import java.util.Scanner;

public class palindromeint {
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = s.nextInt();
		int rev = 0 ;
		int dnum = num ;
		while(dnum > 0)
		{
			int digit = dnum % 10;
			dnum = dnum / 10 ;
			rev = rev * 10 + digit ;
			
		}
		
		System.out.println("The reversed number is "+rev);
			
		if(num == rev)
		{
			System.out.print("yes , It is palindrome ! ");
		}
		else
		{
			System.out.print("No , It is not a palindrome ! ");
		}

}

}
