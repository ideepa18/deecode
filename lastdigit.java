package deezoho;

import java.util.Scanner;

public class lastdigit {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = s.nextInt();
		if(num!=0)
		{
			int digit = num % 10;
            System.out.print(" The Last Digit is " + digit);
		}
		else
		{
			System.out.println(" Re-enter the value :(");
		}

}
}