package com.company;

public class Magicien {

    String name;
    String img;
    int hp;
    int strengh;

    public Magicien() {
        name = "Inconnu";
        img = "Inconnu";
        hp = 3;
        strengh = 8;
    }

    public Magicien(String nameChoose) {
        name = nameChoose;
        img = "Inconnu";
        hp = 3;
        strengh = 8;
    }

    public Magicien(String nameChoose, String imgChoose, int hpChoose, int strenghChoose) {
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
                "Nom du Magicien : " +  this.name+ " | " +
                        "l'image : " + this.img+ " | " +
                        "points de vie : " + this.hp + " | " +
                        "force : " + this.strengh + " | ";
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
