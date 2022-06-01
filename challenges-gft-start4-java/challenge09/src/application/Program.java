package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio - Notação científica
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        System.out.println(String.format((String.valueOf(x).startsWith("-") ? "" : "+") + "%.4E", x));

        sc.close();
    }
}
