package com.dungeon_and_dragon.engine;

import java.util.Scanner;

public class Play {

    int plateau = 64;

    public void mouve() {
        boolean test = false;
        int total = 0;

        while (!test) {
            Scanner play = new Scanner(System.in);
            System.out.print("Lancez le dé ? :");
            String playerChoose = play.nextLine();

            if (playerChoose.equals("o")) {
                int throwDice = randomNumber();
                total += throwDice;
                System.out.println(total);

            } else {
                Scanner rePlay = new Scanner(System.in);
                System.out.print("Etes vous sur :");
                String playerChoose2 = rePlay.nextLine();

                if (playerChoose2.equals("oui")) {
                    test = true;
                }
            }

            if (total > plateau) {
                System.out.println("BRAVO GG FOR THE WIN !");
                test = true;

            }
        }
    }





    public int randomNumber() {
        int min = 1;
        int max = 6;

        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
        return random_int;
    }
}
