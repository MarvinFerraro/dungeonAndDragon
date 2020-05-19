package com.dungeon_and_dragon.equipements.utilities;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Decoction implements Event {
    protected String name;
    protected int addHp;
    protected String type;

    public Decoction() {
        this("Potion", 0, "Potion");
    }

    public Decoction(String name, int addHp, String type) {
        this.name = name;
        this.addHp = addHp;
        this.type = type;
    }

//    public String toString() {
//        return "Nom de la décoction : " + this.name +
//                "\nNombre de PV rendu :" +this.addHp;
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
     * getAddHp
     *
     * @return addHp
     */
    public int getAddHp() {
        return addHp;
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
