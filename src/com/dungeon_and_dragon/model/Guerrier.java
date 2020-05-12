package com.dungeon_and_dragon.model;

public class Guerrier {

    private String name;
    private int hp;
    private int strength;

    public Guerrier() {
        name = "Inconnu";
        hp = 5;
        strength = 5;
    }

    public Guerrier(String nameChoose) {
        name = nameChoose;
        hp = 5;
        strength = 5;
    }

    public Guerrier(String nameChoose, int hpChoose, int strengthChoose) {
        name = nameChoose;
        hp = hpChoose;
        strength = strengthChoose;
    }

    /**
     * toString
     * @return name,img,hp,strengh
     * */
    public String toString(){
        return
                "Nom du Guerrier : " +  this.name + " avec " +
                        + this.hp + " points de vie et avec " + this.strength + " de force";
    }

    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getHp
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
