package com.dungeon_and_dragon.characters;

public class Warrior extends Hero {

    public Warrior() {
        this("Inconnu");
    }

    public Warrior(String nameChoose) {
        this(nameChoose, 5, 5);
    }

    public Warrior(String name, int hp, int strength) {
        super(name, hp, strength);
        this.type = "Warrior";
        this.lifeMin = 5;
        this.lifeMax = 10;
        this.strengthMin = 5;
        this.strengthMax = 10;
    }

    /**
     * toString
     *
     * @return name, img, hp, strengh
     */
    public String toString() {
        return
                "Nom du Guerrier : " + this.name + " avec " +
                        +this.hp + " points de vie et avec " + this.strength + " de force" +
                        " qui se bat avec " + rightHand + " et " + leftHand;

    }
}
