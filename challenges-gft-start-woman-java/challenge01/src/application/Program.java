package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio inicial - Multiplicação simples
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiplication = a * b;

        System.out.println("PROD = " + multiplication);

        sc.close();
    }
}
