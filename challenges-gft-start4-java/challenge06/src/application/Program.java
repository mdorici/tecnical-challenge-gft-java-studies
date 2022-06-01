package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio básico - Visita na feira
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a + b;

        System.out.println("X = " + x);

        sc.close();
    }
}
