package com.dungeon_and_dragon.enemies;

public class Necromancer extends Vilain {

    public Necromancer() {
        this("Nécromancien", 9, 2);
    }

    public Necromancer(String name, int hp, int strength) {
        super(name, hp, strength, "Necromancer");
    }

}
