package application;

import java.util.Locale;
import java.util.Scanner;
//Desafio intermediário - Experiências
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bunny = 0, frog = 0, mouse = 0;

        for(int i = 0; i < n; i++) {
            int researchAnimal = sc.nextInt();
            char typeAnimal = sc.next().charAt(0);
            if(typeAnimal == 'b') {
                bunny += researchAnimal;
            }
            else if(typeAnimal == 'f'){
                frog += researchAnimal;
            }
            else if(typeAnimal == 'm'){
                mouse += researchAnimal;
            }
            else {
                System.out.println("This research animal no exist!");
                typeAnimal = sc.next().charAt(0);
            }
        }

        int totalAnimalResearch = bunny + frog + mouse;
        double percentageBunny = (double) bunny * 100.0/totalAnimalResearch;
        double percentageFrog = (double) frog * 100.0/totalAnimalResearch;
        double percentageMouse = (double) mouse * 100.0/totalAnimalResearch;

        System.out.printf("Total: %d research animals \n", totalAnimalResearch);
        System.out.println("Total of Bunnies: " + bunny);
        System.out.println("Total of Mouses: " + mouse);
        System.out.println("Total of Frogs: " + frog);
        System.out.printf("Percentage of Bunnies: %.2f %% \n", percentageBunny);
        System.out.printf("Percentage of Mouses: %.2f %% \n", percentageMouse);
        System.out.printf("Percentage of Frogs: %.2f %% \n", percentageFrog);

        sc.close();
    }
}
