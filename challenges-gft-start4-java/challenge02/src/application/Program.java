package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio inicial - Exibindo números pares
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2.0 == 0.0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
