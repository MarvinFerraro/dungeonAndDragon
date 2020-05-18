package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;

public class Goblin extends Vilain implements Event {

    public Goblin() {
        this("Gobeblin", 6, 1); //Appel le constructeur Goblin(full Parametre)
    }

    public Goblin(String name, int hp, int strength) {
        super(name, hp, strength, "Goblin"); // Appel le constructeur parent
    }

    @Override
    public void interact(Hero h) {
        System.out.println("Vous ouvrez la porte, et un gobelin surgis de sous la table... Coquinou");
        System.out.println(toString());
    }
}
