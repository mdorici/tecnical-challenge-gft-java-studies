package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio inicial - Coxinha de Bueno
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String coxinha = sc.nextLine();
        String[] vector = coxinha.split(" ");
        int h = Integer.parseInt(vector[0]);
        int p = Integer.parseInt(vector[1]);

        double average = (double) h/p;

        System.out.printf("%.2f", average);

        sc.close();
    }
}
