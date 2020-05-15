package com.dungeon_and_dragon.equipements.weapons;

public class Sword extends Weapons {
    public Sword() {
        this("Epée" , 5);
    }

    public Sword(String name, int addStrength) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Sword";
    }
}
