package deezoho;

import java.util.Scanner;

public class latinsq {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" enter n : ");
		int n = s.nextInt();
		
		char[][] latinsquare = new char[n][n];
		
		for(int i = 0 ; i < n ; i++ )
		{
			for(int j = 0 ; j < n ; j++ )
			{
				latinsquare[i][j] = (char)('A'+ (i + j) % n);
			}
		}
		
		for(int i = 0 ; i < n ; i++ )
		{
			for(int j = 0 ; j < n ; j++ )
			{
				System.out.print(latinsquare[i][j]);
			}
			
			System.out.println();
		}
		s.close();
	}

}
