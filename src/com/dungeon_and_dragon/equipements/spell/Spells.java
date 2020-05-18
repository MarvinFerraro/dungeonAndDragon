package com.dungeon_and_dragon.equipements.spell;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Spells implements Event {

    protected String name;
    protected int addStrength;
    protected String type;

    public Spells() {
        this("Sort", 0, "Spells");
    }

    public Spells(String name, int addStrength, String type) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Spells";
    }

//    public String toString() {
//        return "Nom du sort : " + this.name +
//                "\nAugmentation du sort : " + this.addStrength + " d'attaque en plus.";
//    }

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
