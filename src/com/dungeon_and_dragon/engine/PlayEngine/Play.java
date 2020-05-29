package com.dungeon_and_dragon.engine.PlayEngine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.BoardEngine.BoardCase;
import com.dungeon_and_dragon.engine.DbEngine.CRUD;
import com.dungeon_and_dragon.engine.MenuEngine.CreateHero;
import com.dungeon_and_dragon.engine.MenuEngine.SuperMenu;
import com.dungeon_and_dragon.exception.OutofBoardException;


import java.util.Scanner;

public class Play {

    private final int board = 64;

    public BoardCase newBoard() {
        BoardCase c = new BoardCase();
        c.fill();
        return c;
    }


    /**
     * @param c
     */
    public void move(BoardCase c) {

        Hero h = null;

        boolean test = false;
        int currentPos = 0;
        Scanner heroCreate = new Scanner(System.in);
        System.out.println("Voulez vous créer (c) un hero ou choisir (e) un existant ?");
        String choice = heroCreate.nextLine();

        if (choice.equals("c")) {
            h = heroStart();
        } else if (choice.equals("e")) {
            SuperMenu menu = new SuperMenu();
            h = menu.takeExistingHero(h);
        }

        SuperMenu mainMenu = new SuperMenu();
        mainMenu.menu(h, c);

        System.out.println("Case de départ est de 0");
        while (!test) {
            Scanner play = new Scanner(System.in);
            System.out.print("\nLancez le dé ? : (o) / ou Menu (menu)");
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

            } else if (playerChoose.equals("menu")) {
                SuperMenu main = new SuperMenu();
                main.menu(h, c);
            } else {
                System.out.println("Merci de rentrer o ou menu");

            }
            if (currentPos == board) {
                CRUD crud = new CRUD();
                crud.updateHero(h);
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

    public Hero heroStart() {
        CreateHero newHero = new CreateHero();
        return newHero.choose();
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

