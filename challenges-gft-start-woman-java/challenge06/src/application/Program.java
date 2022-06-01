package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio intermediário - Esfera
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double radius = sc.nextDouble();

        double volume = (4.0/3.0) * pi * Math.pow(radius, 3.0);

        System.out.printf("VOLUME = %.3f", volume);

        sc.close();
    }
}
