package com.dungeon_and_dragon.equipements.weapons;

public class Club extends Weapons {

    public Club() {
        this("Massue", 3, "Club");
    }

    public Club(String name, int addStrength, String type) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Club";
    }
}
