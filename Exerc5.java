package a;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int[] a = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira os valores");
            a[i] = in.nextInt();
        }
 
        System.out.println("Relação dos divisores:");
        for (int k = 0; k < 10; k++) {
 
            System.out.println("Divisores de " + a[k] + ":");
 
            for (int j = 1; j <= a[k]; j++) {
                if (a[k] % j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
