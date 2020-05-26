package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.exception.OutofBoardException;

import java.util.Scanner;

public class Play {

    private final int board = 64;

    /**
     *
     * @param h
     */
    public void move(Hero h) {
        BoardCase c = new BoardCase();
        c.fill();

        boolean test = false;
        int currentPos = 0;
        System.out.println("Case de départ est de 0");

        while (!test) {
            Scanner play = new Scanner(System.in);
            System.out.print("\nLancez le dé ? : (o)");
            String playerChoose = play.nextLine();

            if (playerChoose.equals("o")) {
                int throwDice = randomNumber();
                System.out.println("\nVous avez fait un : " + throwDice);

                try {
                    currentPos = testmove(currentPos, throwDice, board);
                } catch (OutofBoardException e) {
                    e.printStackTrace();
                }
                System.out.println("Vous êtes sur la case : " + currentPos);

                c.getCase(currentPos).interact(h, currentPos);

                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println("----------STATS PERSO----------");
                System.out.println("Votre vie : " + h.getHp());
                System.out.println("Votre Force : " + h.getStrength());
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");

            } else {
                Scanner rePlay = new Scanner(System.in);
                System.out.print("Etes vous sur : (oui)");
                String playerChoose2 = rePlay.nextLine();
                if (playerChoose2.equals("oui")) {
                    System.out.println("Vous avez quitté le jeu.");
                    test = true;
                    System.exit(0);
                }
            }

            if (currentPos == board) {
                System.out.println("BRAVO GG FOR THE WIN !");
                test = true;
            }
        }
    }

    /**
     * @param currentPos
     * @return
     */
    public static int reverse(int currentPos) {
        int reverse = randomNumber();
        currentPos -= randomNumber();
        if (currentPos < 0) {
            return currentPos = 0;
        } else {
            return currentPos;
        }
    }

    /**
     * @return int random Number
     */
    public static int randomNumber() {
        int random_int = 1 + (int) (Math.random() * 6);
        return random_int;
    }

    /**
     * @param pos
     * @param dice
     * @param board
     * @return pos
     * @throws OutofBoardException
     */
    public int testmove(int pos, int dice, int board) throws OutofBoardException {
        pos += dice;

        if (pos > board) {
            throw new OutofBoardException();
        } else {
            return pos;
        }
    }


}

