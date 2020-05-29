package com.dungeon_and_dragon.characters;

public class Wizard extends Hero {

    public Wizard() {
        this("Inconnu");
    }

    public Wizard(String name) {
        this(name, 5, 5);
    }

    public Wizard(String name, int hp, int strength) {
        super(name, hp, strength);
        this.type = "Wizard";
        this.lifeMin = 3;
        this.lifeMax = 6;
        this.strengthMin = 8;
        this.strengthMax = 15;
    }

    /**
     * toString
     *
     * @return name, hp, strengh
     */
    public String toString() {
        return
                "Nom du Magicien : " + this.name + " avec " +
                        +this.hp + " points de vie et avec " + this.strength + " de force";
    }
}
