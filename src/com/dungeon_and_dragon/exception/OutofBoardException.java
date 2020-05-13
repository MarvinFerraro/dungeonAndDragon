package com.dungeon_and_dragon.exception;

public class OutofBoardException extends Exception {

    public OutofBoardException() {
        super("Vous êtes sorti du plateau. C'est balo !");
    }
}
