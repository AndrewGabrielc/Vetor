package a;
import java.util.Scanner;
public class Exerc6{
    public static void main(String[] args) {
 
        int[] A = new int[11];
 
        A[0] = 1;
 
        for (int i = 1; i < 11; i++) {
            A[i] = A[i - 1] * 2;
        }
 
        for (int i = 0; i < 11; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
