package com.dungeon_and_dragon.equipements.weapons;

public class Club extends Weapons {

    public Club() {
        this("Massue", 3);
    }

    public Club(String name, int addStrength) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Club";
    }
}
