package a;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int[] A = new int[10];
        int[] B = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira A[" + i + "]:");
            A[i] = in.nextInt();
        }
 
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = i; j < 10; j++) {
                soma = soma +  A[j];
            }
            B[i] = soma;
        }
 
        System.out.println("numero no veto B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
