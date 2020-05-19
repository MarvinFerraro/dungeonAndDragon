package com.dungeon_and_dragon.equipements.weapons;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.Event;

public class Sword extends Weapons implements Event {
    public Sword() {
        this("Epée", 5);
    }

    public Sword(String name, int addStrength) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Sword";
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        if (h instanceof Warrior) {
            System.out.println("Oh une épée enfoncé dans le crane d'un Gobelin !Now we talking about WARRIOR ! ");
            h.setStrength(h.getStrength() + 5);
            System.out.println("\nForce augmentée de 5 !");
        } else {
            System.out.println("Une épée ? Pourquoi vous salir les mains quand vous pouvez lancer des sorts !");
        }

    }
}
