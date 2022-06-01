package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio inicial - Degustação de vinho
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int responseTrue = 0, response;

        int T = sc.nextInt();

        for(int i = 1; i <= 5; i++) {
            response = sc.nextInt();
            if(response == T) {
               responseTrue++;
            }
        }
        System.out.println(responseTrue);

        sc.close();
    }
}
