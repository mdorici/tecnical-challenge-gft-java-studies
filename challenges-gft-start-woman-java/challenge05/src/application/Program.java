package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio intermediário - Média2
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double average = (a * 2.0 + b * 3.0 + c * 5.0)/10.0;

        System.out.printf("MEDIA = %.1f", average);

        sc.close();
    }
}
