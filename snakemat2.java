package deezoho;

import java.util.Scanner;

public class snakemat2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" size :");
        int size = s.nextInt();
        int[][] arr1 = new int[size][size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    arr1[i][j] = count + 1;
                    count++;
                }
            } else {
                for (int j = size-1; j >= 0; j--) {
                    arr1[i][j] = count + 1;
                    count++;
                }
            }
        }

        
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
