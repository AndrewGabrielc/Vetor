package a;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int[] a = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira os valores");
            a[i] = in.nextInt();
        }
 
        System.out.println("Seu numero é primo?:");
        for (int j = 0; j < 10; j++) {
 
            if (a[j] <= 1) {
                System.out.println(a[j] + " não é primo");
            } else {
                int cont = 0;
 
                for (int k = 2; k <= a[j] / 2; k++) {
                    if (a[j] % k == 0) {
                        cont++;
                    }
                }
 
                if (cont == 0) {
                    System.out.println(a[j] + " é primo");
                } else {
                    System.out.println(a[j] + " não é primo");
                }
            }
        }
    }
}