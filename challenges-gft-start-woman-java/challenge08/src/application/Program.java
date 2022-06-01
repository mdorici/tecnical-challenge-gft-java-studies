package application;

import java.util.*;

//Desafio intermediário - Maior posição
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Integer theGreatest = 0;

        for(int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        for(int i = 0; i < 100; i++) {
           if(list.get(i) > theGreatest) {
               theGreatest = list.get(i);
           }
        }

        System.out.println(theGreatest);
        int position = list.indexOf(theGreatest) +1;
        System.out.println(position);

        sc.close();
    }
}
