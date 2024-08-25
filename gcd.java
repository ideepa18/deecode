package deezoho;

import java.util.Scanner;

public class gcd {
	public static void main(String[]args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.print(" Enter the number 1 : ");
		int num1 = s.nextInt();
		System.out.print(" Enter the number 2 : ");
		int num2 = s.nextInt();
		int gcd = 0 ;
		if(num2>num1)
		{
			for(int i = 1 ; i <= num2/2 ; i++)
			{
				if((num1 % i == 0) && (num2 % i== 0))
				{
					gcd = i ;
					
				}
				
			}
			System.out.print(" The Greatest Common divisor is " + gcd );
			
		}	
			
				
				else
				{
					for(int i = 1 ; i <= num1/2 ; i++)
					{
						if((num1 % i == 0) && (num2 % i== 0))
						{
							gcd = i ;
							
						}
						
						
				    }
					System.out.print(" The Greatest Common divisor is " + gcd );
			
		}

}
	
}
