package com.dungeon_and_dragon.equipements.weapons;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.BoardEngine.BoardCase;

public class Club extends Weapons {

    public Club() {
        this("Massue", 3);
    }

    public Club(String name, int addStrength) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Club";
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos, BoardCase array) {
        if (h instanceof Warrior) {
            System.out.println("Vous trouvez une massue posée sur une table ! ");
            h.setStrength(h.getStrength() + this.addStrength);
            System.out.println("\nForce augmentée de 3 ! Votre force est de : " + h.getStrength());
        } else {
            System.out.println("Une massue? Hélas vous ne pouvez pas vous servir de ça petit mage en robe.");
        }

    }

}
