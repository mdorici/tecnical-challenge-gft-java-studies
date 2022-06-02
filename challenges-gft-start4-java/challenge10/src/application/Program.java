package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//Desafio intermediário - Área Direita
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double average = 0.0;
        int count = 0;
        char O = sc.next().toUpperCase().charAt(0);

        double[][] M = new double[12][12];

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j <= M[i].length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                if (j > i && j > M.length -i -1) {
                    sum += M[i][j];
                    count++;
                }
            }
        }

        if(O == 'M') {
            sum = sum/count++;
        }

        System.out.printf("%.1f", sum);

        sc.close();
    }
}
