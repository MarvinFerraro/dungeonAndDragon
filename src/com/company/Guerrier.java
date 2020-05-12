package com.company;

public class Guerrier {

    String name;
    String img;
    int hp;
    int strengh;

    public Guerrier() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 5;
        strengh = 5;
    }

    public Guerrier(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 5;
        strengh = 5;
    }

    public Guerrier(String nameChoose, String imgChoose, int hpChoose, int strenghChoose) {
        name = nameChoose;
        img = imgChoose;
        hp = hpChoose;
        strengh = strenghChoose;
    }

    /**
     * toString
     * @return name,img,hp,strengh
     * */
    public String toString(){
        return
                "Nom du Guerrier : " +  this.name + " avec cette image " + this.img + " et " +
                        + this.hp + "points de vie : " + " avec " + this.strengh + " de force";
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
     * @return strengh
     */
    public int getStrengh() {
        return strengh;
    }

    /**
     * setStrengh
     */
    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }
}
