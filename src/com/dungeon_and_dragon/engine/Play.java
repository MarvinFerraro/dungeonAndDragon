package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.enemies.Vilain;
import com.dungeon_and_dragon.engine.bdd.CRUD;
import com.dungeon_and_dragon.exception.OutofBoardException;


import java.util.Scanner;

public class Play {

    private final int board = 64;

    /**
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
            System.out.print("\nLancez le dé ? : (o) / ou Sauvegarder (Save)");
            String playerChoose = play.nextLine();

            if (playerChoose.equals("o")) {
                int throwDice = randomNumber();
                System.out.println("\nVous avez fait un : " + throwDice);

//                try {
//                    currentPos = testmove(currentPos, throwDice, board);
//
//                } catch (OutofBoardException e) {
//                    e.printStackTrace();
//                }

                currentPos = moveTest(currentPos, throwDice, board);
                c.getCase(currentPos).interact(h, currentPos, c);

                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println("----------STATS PERSO----------");
                System.out.println("Votre vie : " + h.getHp());
                System.out.println("Votre Force : " + h.getStrength());
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");

            } else if (playerChoose.equals("Save")) {
                CRUD crud = new CRUD();
                crud.updateHero(h.getName(), h.getHp(), h.getStrength());
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
                CRUD crud = new CRUD();
                crud.updateHero(h.getName(), h.getHp(), h.getStrength());
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
     * @return
     */
    public int moveTest(int pos, int dice, int board) {
        pos += dice;

        if (pos > board) {
            System.out.println("Vous avez déplacé le plateau, retour a votre ancienne case.");
            return pos;
        } else if (pos <= 0) {
            System.out.println("Vous avez trop reculé, à nouveau sur la case 1.");
            return pos = 1;
        } else {
            System.out.println("Vous êtes sur la case : " + pos);
            return pos;
        }
    }

    /**
     * @param pos
     * @param dice
     * @param board
     * @return pos
     * @throws OutofBoardException
     */
//    public int testmove(int pos, int dice, int board) throws OutofBoardException {
//        pos += dice;
//
//        if (pos > board) {
//            throw new OutofBoardException();
//        } else {
//            return pos;
//        }
//    }
}

