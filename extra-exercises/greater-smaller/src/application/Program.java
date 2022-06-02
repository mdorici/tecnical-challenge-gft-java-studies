package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vector = new int[n];

        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            vector[i] = number;
        }

        int greater = 0;
        int countG = 0;
        int smaller = vector[0];
        int countS = 0;

        for(int i = 0; i < n; i++) {
            if(vector[i] > greater) {
                greater = vector[i];
            }
            else if (vector[i] <= smaller){
                smaller = vector[i];
            }
        }

        System.out.println("Greater: " + greater);
        System.out.println("Smaller: " + smaller);

        sc.close();
    }
}
