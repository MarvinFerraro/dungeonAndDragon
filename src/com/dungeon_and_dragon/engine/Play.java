package com.dungeon_and_dragon.engine;

import java.util.Scanner;

public class Play {

   private final int board = 64;

    public void moove() {
        boolean test = false;
        int total = 1;
        System.out.println("Case de départ est de 1");
        while (!test) {
            Scanner play = new Scanner(System.in);
            System.out.print("\nLancez le dé ? :");
            String playerChoose = play.nextLine();

            if (playerChoose.equals("o")) {
                int throwDice = randomNumber();
                System.out.println("\nVous avez fait un : " + throwDice );
                total += throwDice;
                System.out.println("Vous êtes sur la case : "+ total);

            } else {
                Scanner rePlay = new Scanner(System.in);
                System.out.print("Etes vous sur :");
                String playerChoose2 = rePlay.nextLine();

                if (playerChoose2.equals("oui")) {
                    test = true;
                }
            }

            if (total >= board) {
                System.out.println("BRAVO GG FOR THE WIN !");
                test = true;
            }
        }
    }

    public int randomNumber() {
        int random_int = 1 + (int) (Math.random() * 6);
        return random_int;
    }
}

