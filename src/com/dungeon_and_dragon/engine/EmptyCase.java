package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;

public class EmptyCase implements Event {

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        if (h instanceof Warrior)
            System.out.println("Vous ouvrez une porte et vous tombez sur un mirroir..." +
                    "Vous voyez simplement le reflet de votre belle moustache de Guerrier.");
        else
            System.out.println("Vous ouvrez une porte et vous tombez sur un mirroir..." +
                    "Vous voyez simplement le reflet de votre beau chapeau pointu ! Turlututu !");
    }
}
