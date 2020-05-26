package com.dungeon_and_dragon;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;

import com.dungeon_and_dragon.enemies.Dragon;
import com.dungeon_and_dragon.enemies.Vilain;
import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Menu;
import com.dungeon_and_dragon.engine.Play;
import com.dungeon_and_dragon.engine.bdd.Bdd;

public class Main {

    public static void main(String[] args) {
//        Bdd myDB = new Bdd();
//        myDB.connectBdd();

        Menu start = new Menu();
        Hero mainChar = start.choose();

        Play play = new Play();
        play.move(mainChar);



    }
}