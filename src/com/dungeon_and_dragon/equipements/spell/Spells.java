package com.dungeon_and_dragon.equipements.spell;

public abstract class Spells {

    protected String name;
    protected int addStrength;
    protected String type;

    public Spells() {
        this("Sort", 0,"Spells");
    }

    public Spells(String name, int addStrength, String type) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Spells";
    }

    public String toString() {
        return "Nom du sort : " + this.name +
                "\n Augmentation du sort : " + this.addStrength + " d'attaque en plus.";
    }

    /**
     * getName
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getAddStrength
     *
     * @return addStrength
     */
    public int getAddStrength() {
        return addStrength;
    }

    /**
     * getType
     *
     * @return type
     */
    public String getType() {
        return type;
    }
}
