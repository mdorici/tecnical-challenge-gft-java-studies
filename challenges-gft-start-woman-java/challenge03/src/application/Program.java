package application;

import java.util.*;

//Desafio inicial - Album da copa
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalStickers = sc.nextInt();
        int boughtStickers = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= boughtStickers; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(totalStickers - set.size());

        sc.close();
    }
}
