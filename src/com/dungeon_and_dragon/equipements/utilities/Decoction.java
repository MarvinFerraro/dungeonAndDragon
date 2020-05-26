package com.dungeon_and_dragon.equipements.utilities;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Decoction implements Event {
    protected String name;
    protected int addLife;
    protected String type;

    public Decoction() {
        this("Potion", 0, "Potion");
    }

    public Decoction(String name, int addLife, String type) {
        this.name = name;
        this.addLife = addLife;
        this.type = type;
    }

//    public String toString() {
//        return "Nom de la décoction : " + this.name +
//                "\nNombre de PV rendu :" +this.addLife;
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
     * getaddLife
     *
     * @return addLife
     */
    public int getaddLife() {
        return addLife;
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
