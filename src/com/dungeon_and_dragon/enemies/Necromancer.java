package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;

public class Necromancer extends Vilain implements Event {

    public Necromancer() {
        this("Nécromancien", 9, 2);
    }

    public Necromancer(String name, int hp, int strength) {
        super(name, hp, strength, "Necromancer");
    }

    @Override
    public void interact(Hero h) {
        System.out.println("Il est moche, il est mort, il fait des trucs bizare, vous ne revez pas c'est bien un Nécromancien.");
        System.out.println(toString());
    }
}
