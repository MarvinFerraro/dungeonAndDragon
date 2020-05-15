package com.dungeon_and_dragon.equipements.spell;

public class FireBall extends Spells {

    public FireBall() {
        this("Boule de feu", 7);
    }

    public FireBall(String name, int addStrength) {
        super(name, addStrength, "FireBall");
    }
}
