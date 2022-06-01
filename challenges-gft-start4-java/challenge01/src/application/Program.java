package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio inicial - Média
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's grades: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double average = (a + b) / 2.0;

        System.out.printf("AVERAGE = %.5f", average);
        sc.close();
    }
}
