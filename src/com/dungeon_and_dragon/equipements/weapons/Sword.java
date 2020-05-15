package com.dungeon_and_dragon.equipements.weapons;

public class Sword extends Weapons {
    public Sword() {
        this("Epée" , 5, "Sword");
    }

    public Sword(String name, int addStrength, String type) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Sword";
    }
}
