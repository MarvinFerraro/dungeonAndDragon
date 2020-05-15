package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.exception.OutofBoardException;
import java.util.Scanner;

public class Play {

   private final int board = 64;

    public void move() {
        boolean test = false;
        int currentPos = 1;
        System.out.println("Case de départ est de 1");

        while (!test) {
            Scanner play = new Scanner(System.in);
            System.out.print("\nLancez le dé ? :");
            String playerChoose = play.nextLine();

            if (playerChoose.equals("o")) {
                int throwDice = randomNumber();
                System.out.println("\nVous avez fait un : " + throwDice );

                try {
                    currentPos = testmove(currentPos, throwDice, board);
                } catch (OutofBoardException e)  {
                    e.printStackTrace();
                }
                System.out.println("Vous êtes sur la case : " + currentPos);

            } else {
                Scanner rePlay = new Scanner(System.in);
                System.out.print("Etes vous sur :");
                String playerChoose2 = rePlay.nextLine();
                if (playerChoose2.equals("oui")) {
                    test = true;
                }
            }

            if (currentPos == board) {
                System.out.println("BRAVO GG FOR THE WIN !");
                test = true;
            }
        }
    }

    public int randomNumber() {
        int random_int = 1 + (int) (Math.random() * 6);
        return random_int;
    }

    public int testmove(int pos, int dice, int board) throws OutofBoardException {
        pos += dice;

        if (pos > board) {
            throw new OutofBoardException();
        } else {
            return pos;
        }
    }
}

