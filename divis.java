package deezoho;
import java.util.Scanner;

public class divis {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        s.close();  // Close the scanner to avoid resource leaks
        
        System.out.print("The divisors of " + num + " are: ");
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

