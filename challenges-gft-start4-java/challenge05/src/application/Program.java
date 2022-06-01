package application;

import java.util.Locale;
import java.util.Scanner;

//Desafio básico - O filme
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with cinema old value: ");
        double a = sc.nextDouble();
        System.out.println("Enter with cinema current value: ");
        double b = sc.nextDouble();

        double percentage = (b * 100.0 / a) - 100;

        System.out.printf("X = %.2f %%", percentage);

        sc.close();
    }
}
