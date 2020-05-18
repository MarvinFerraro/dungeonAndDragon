package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Vilain extends BoardCase implements Event {

    protected String name;
    protected int hp, strength;
    protected String type;

    public Vilain() {
        this("Inconnu", 0, 0, "Vilain");

    }

    public Vilain(String name, int hp, int strength, String type) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.type = "Vilain";
    }

    /**
     * toString
     *
     * @return Object String
     */
    public String toString() {
        return "Nom : " + this.name + "\nPoints de vie : " + this.hp + "\nForce d'attaque : " + this.strength;
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
     * setName
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     * getHp
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * setHp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * getStrengh
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * setStrength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

}
