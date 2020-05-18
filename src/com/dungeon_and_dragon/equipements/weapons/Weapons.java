package com.dungeon_and_dragon.equipements.weapons;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Weapons implements Event {

    protected String name;
    protected int addStrength;
    protected String type;

    public Weapons() {
        this("Arme",0,"Weapon");
    }

    public Weapons(String name, int addStrength, String type) {
        this.name = name;
        this.addStrength = addStrength;
        this.type = "Weapon";
    }

//    public String toString() {
//        return "Nom de l'arme : " + this.name +
//                "\nAugmentation de l'arme : " + this.addStrength + " d'attaque en plus.";
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
