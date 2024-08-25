package deezoho;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = s.nextInt();
        System.out.print("Enter the exponent: ");
        int expo = s.nextInt();
        long power = 1;
        for(int i = 1 ;i<=expo;i++)
        {
            power = power*base;
        }
        System.out.print(power);
	}

}
