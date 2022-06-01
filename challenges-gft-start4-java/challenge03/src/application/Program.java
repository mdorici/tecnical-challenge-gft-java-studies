package application;

import java.util.Locale;
import java.util.Scanner;

//Desafio inicial - Dama

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x1, x2, y1, y2;
        boolean vertical, horizontal, diagonal;

        while (true) {
            System.out.println("Enter coordinates: ");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            vertical = (x1 == x2 && y1 != y2);
            horizontal = (x1 != x2 && y1 == y2);
            diagonal = (Math.abs(x1 - x2) == Math.abs(y1 - y2));

            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }
            else if (x1 == x2 && y1 == y2) {
                System.out.println("0");
            }
            else if ( vertical == true || horizontal == true|| diagonal == true) {
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
        }
        sc.close();
    }
}
