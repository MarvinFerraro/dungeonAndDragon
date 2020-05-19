package com.dungeon_and_dragon.equipements.spell;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.Event;

public class Lightning extends Spells implements Event {

    public Lightning() {
        this("Eclair", 2);
    }

    public Lightning(String name, int addStrength) {
        super(name, addStrength, "Lightning");
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        if (h instanceof Warrior) {
            System.out.println("Vous trouvez un parchemin écrit en langue inconnu... ");
        } else {
            System.out.println("Un sort d'éclair ! Zeux hear me !");
            h.setStrength(h.getStrength() + 2);
            System.out.println("\nForce augmentée de 2 !");
        }
    }
}