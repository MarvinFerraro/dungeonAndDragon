package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public abstract class Vilain extends BoardCase implements Event {

    protected String name;
    protected int hp, strength;
    protected String type;

    /**
     * Constructor with no param
     */
    public Vilain() {
        this("Inconnu", 0, 0, "Vilain");
    }

    /**
     * The Constructor for the vilain. With all param !
     * @param name
     * @param hp
     * @param strength
     * @param type
     */
    public Vilain(String name, int hp, int strength, String type) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.type = "Vilain";
    }

    /**
     * This method returns a String that defines the object
     * @return Object String
     */
    public String toString() {
        return "Nom : " + this.name + "\nPoints de vie : " + this.hp + "\nForce d'attaque : " + this.strength;
    }

    /**
     * Return a the String name of the object
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method take a String in param, for set the name attribute.
     * @param name
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     *  Return a the Int hp of the object
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Method take a String in param, for set the hp attribute.
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Return a the Int strength of the object
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Method take a String in param, for set the strength attribute.
     * @param strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

}
