package com.dungeon_and_dragon;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Wizard;
import com.dungeon_and_dragon.engine.BoardEngine.BoardCase;
import com.dungeon_and_dragon.engine.DbEngine.CRUD;
import com.dungeon_and_dragon.engine.MenuEngine.CreateHero;
import com.dungeon_and_dragon.engine.MenuEngine.SuperMenu;
import com.dungeon_and_dragon.engine.PlayEngine.Play;

public class Main {

    public static void main(String[] args) {

        Play c = new Play();
        BoardCase board = c.newBoard();
        c.move(board);

    }
}