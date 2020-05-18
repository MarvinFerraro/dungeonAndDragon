package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;

public class Dragon extends Vilain implements Event {

    public Dragon() {
        this("Dragon", 14, 4);
    }

    public Dragon(String name, int hp, int strength) {
        super(name, hp, strength, "Dragon");
    }

    @Override
    public void interact(Hero h) {
        System.out.println("Aie, Voila un dragon...");
        System.out.println(toString());
    }
}
