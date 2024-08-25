package deezoho;

import java.util.Scanner;

public class amstrongcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = 0;

        
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        originalNum = num;  // Reset originalNum to the input value

        
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, digits);
            originalNum /= 10;
        }

        
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

