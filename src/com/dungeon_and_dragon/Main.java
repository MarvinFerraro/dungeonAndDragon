package com.dungeon_and_dragon;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Menu;
import com.dungeon_and_dragon.engine.Play;

public class Main {

    public static void main(String[] args) {

        Menu start = new Menu();
        Hero mainChar = start.choose();

        Play play = new Play();
        play.move(mainChar);



    }
}