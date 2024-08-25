package deezoho;

import java.util.Scanner;

public class sqroot {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int sqroot=0;
        for(int i = 1;i<num;i++)
        {
        	if(i*i==num)
        	{
        		sqroot = i;
        	}
        	else
        	{
        		continue;
        	}
        }
        System.out.print(" The Square root is "+ sqroot);
	}

}
