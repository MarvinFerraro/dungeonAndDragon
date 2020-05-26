package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;

import java.util.ArrayList;

public interface Event {

    /**
     * @param h
     * @param currentPos
     */
    void interact(Hero h, int currentPos, BoardCase array);
}
