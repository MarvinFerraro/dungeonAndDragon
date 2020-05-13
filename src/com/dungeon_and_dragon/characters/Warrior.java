package com.dungeon_and_dragon.characters;

public class Warrior extends Hero{

    public Warrior() {
        super("Inconnu",5,5);
    }

    public Warrior(String nameChoose) {
        super(nameChoose,5,5);
    }

    public Warrior(String nameChoose, int hpChoose, int strengthChoose) {
        super();
    }

    /**
     * toString
     * @return name,img,hp,strengh
     * */
    public String toString(){
        return
                "Nom du Guerrier : " +  this.name + " avec " +
                        + this.hp + " points de vie et avec " + this.strength + " de force"+
                        " qui se bat avec " + rightHand + " et " + leftHand;

    }
}
