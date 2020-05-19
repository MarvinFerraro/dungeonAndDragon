package com.dungeon_and_dragon.equipements.spell;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.Event;

public class FireBall extends Spells implements Event {

    public FireBall() {
        this("Boule de feu", 7);
    }

    public FireBall(String name, int addStrength) {
        super(name, addStrength, "FireBall");
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        if (h instanceof Warrior) {
            System.out.println("Vous trouvez un parchemin écrit en langue inconnu... ");
        } else {
            System.out.println("Un sort de boule de feu ! On va cramer du monstre !");
            h.setStrength(h.getStrength() + 7);
            System.out.println("\nForce augmentée de 7 !");
        }
    }
}
