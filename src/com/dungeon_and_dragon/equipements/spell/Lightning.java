package com.dungeon_and_dragon.equipements.spell;

public class Lightning extends Spells {

    public Lightning() {
        this("Eclair", 2);
    }

    public Lightning(String name, int addStrength) {
        super(name, addStrength, "Lightning");
    }
}