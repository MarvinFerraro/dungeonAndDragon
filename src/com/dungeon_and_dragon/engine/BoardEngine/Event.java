package com.dungeon_and_dragon.engine.BoardEngine;

import com.dungeon_and_dragon.characters.Hero;

public interface Event {

    /**
     * @param h
     * @param currentPos
     */
    void interact(Hero h, int currentPos, BoardCase array);
}
