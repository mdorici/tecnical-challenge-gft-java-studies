package application;

import java.util.Locale;
import java.util.Scanner;

//Desafio básico - Área do círculo
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("Enter with radius: ");
        double radius = sc.nextDouble();

        double area = pi * Math.pow(radius, 2.0);

        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
