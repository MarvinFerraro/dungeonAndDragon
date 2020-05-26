package com.dungeon_and_dragon.equipements.spell;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public class Lightning extends Spells {



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
    public void interact(Hero h, int currentPos, BoardCase array) {
        if (h instanceof Warrior) {
            System.out.println("Vous trouvez un parchemin écrit en langue inconnu... ");
        } else {
            System.out.println("Un sort d'éclair ! Zeuz hear me !");
            h.setStrength(h.getStrength() + this.addStrength);
            System.out.println("\nForce augmentée de 2 !");
        }
    }
}