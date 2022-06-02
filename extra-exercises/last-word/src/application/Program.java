package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a phrase: ");
        String phrase = sc.nextLine();

        String[] words = phrase.split(" ");
        String lastWord = words[words.length -1];
        System.out.println(lastWord.chars().count());

        sc.close();
    }
}
