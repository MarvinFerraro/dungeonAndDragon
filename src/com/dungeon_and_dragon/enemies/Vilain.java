package com.dungeon_and_dragon.enemies;

public abstract class Vilain {

    protected String name;
    protected int hp, strength;

    public Vilain() {
        this("Inconnu",0,0);

    }

    public Vilain(String name, int hp, int strength) {

        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    /**
     * toString
     *
     * @return Object String
     */
    public String toString() {
        return "Nom : " + this.name + "\nPoints de vie : "+ this.hp + "\nForce d'attaque : " + this.strength;
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
        if (name != null && !name.isEmpty()){
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
