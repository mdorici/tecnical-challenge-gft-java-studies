package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio - Notas e moedas
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println("BANK NOTES:");
        int decomposition100 = (int) (n/100.00);
        System.out.printf("%d bank note(s) of R$ 100.00 \n", decomposition100);
        double remainder100 = n % 100.0;
        int decomposition50 = (int) (remainder100/50.00);
        System.out.printf("%d bank note(s) of R$ 50.00 \n", decomposition50);
        double remainder50 = remainder100 % 50.0;
        int decomposition20 = (int) (remainder50/20.00);
        double remainder20 = remainder50 % 20.0;
        System.out.printf("%d bank note(s) of R$ 20.00 \n", decomposition20);
        int decomposition10 = (int) (remainder20/10.00);
        double remainder10 = remainder20 % 10.0;
        System.out.printf("%d bank note(s) of R$ 10.00 \n", decomposition10);
        int decomposition5 = (int) (remainder10/5.00);
        double remainder5 = remainder10 % 5.0;
        System.out.printf("%d bank note(s) of R$ 5.00 \n", decomposition5);
        int decomposition2 = (int) (remainder5/2.00);
        double remainder2 = remainder5 % 2.0;
        System.out.printf("%d bank note(s) of R$ 2.00 \n", decomposition2);

        System.out.println("COINS:");
        int decomposition1 = (int) (remainder2/1.00);
        System.out.printf("%d coin(s) of R$ 1.00 \n", decomposition1);
        double remainder1 = remainder2 % 1.0;
        int decomposition050 = (int) (remainder1/0.50);
        double remainder050 = remainder1 % 0.50;
        System.out.printf("%d coin(s) of R$ 0.50 \n", decomposition050);
        int decomposition025 = (int) (remainder050/0.25);
        double remainder025 = remainder050 % 0.25;
        System.out.printf("%d coin(s) of R$ 0.25 \n", decomposition025);
        int decomposition010 = (int) (remainder025/0.10);
        double remainder010 = remainder025 % 0.10;
        System.out.printf("%d coin(s) of R$ 0.10 \n", decomposition010);
        int decomposition005 = (int) (remainder010/0.05);
        double remainder005 = remainder010 % 0.05;
        System.out.printf("%d coin(s) of R$ 0.05 \n", decomposition005);
        int decomposition001 = (int) (remainder005/0.01);
        System.out.printf("%d coin(s) of R$ 0.01 \n", decomposition001);

        sc.close();
    }
}
