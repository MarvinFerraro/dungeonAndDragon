package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;

public abstract interface Event {


    void interact(Hero h);
}
