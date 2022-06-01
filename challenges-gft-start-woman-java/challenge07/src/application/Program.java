package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio intermediário - Polígonos Regulares Simples
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int p = n * l;

        System.out.println(p);

        sc.close();
    }
}
