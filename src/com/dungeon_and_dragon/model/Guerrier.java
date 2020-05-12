package com.dungeon_and_dragon.model;

public class Guerrier {

    private String name;
    private String img;
    private int hp;
    private int strength;

    public Guerrier() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 5;
        strength = 5;
    }

    public Guerrier(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 5;
        strength = 5;
    }

    public Guerrier(String nameChoose, String imgChoose, int hpChoose, int strengthChoose) {
        name = nameChoose;
        img = imgChoose;
        hp = hpChoose;
        strength = strengthChoose;
    }

    /**
     * toString
     * @return name,img,hp,strengh
     * */
    public String toString(){
        return
                "Nom du Guerrier : " +  this.name + " avec cette image " + this.img + " et " +
                        + this.hp + "points de vie : " + " avec " + this.strength + " de force";
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
     * getImg
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * setImg
     */
    public void setImg(String img) {
        this.img = img;
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
