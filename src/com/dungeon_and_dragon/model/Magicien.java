package com.dungeon_and_dragon.model;

public class Magicien {

    private String name;
    private String img;
    private int hp;
    private int strength;

    public Magicien() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 3;
        strength = 8;
    }

    public Magicien(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 3;
        strength = 8;
    }

    public Magicien(String nameChoose, String imgChoose, int hpChoose, int strengthChoose) {
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
                "Nom du Magicien : " +  this.name+ " | " +
                        "l'image : " + this.img+ " | " +
                        "points de vie : " + this.hp + " | " +
                        "force : " + this.strength + " | ";
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
