package a;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int[] A = new int[15];
        int[] B = new int[15];
 
        for (int i = 0; i < 15; i++) {
            System.out.println("Insira o valor de A[" + i + "]:");
            A[i] = in.nextInt();
 
            int fat = 1;
            for (int j = 1; j <= A[i]; j++) {
                fat = fat* j;
            }
 
            B[i] = fat;
        }
 
        System.out.println("fatorial do numero :");
        for (int i = 0; i < 15; i++) {
            System.out.println(A[i] + "! = " + B[i]);
        }
    }
}
