package com.dungeon_and_dragon.characters;

public class Wizard extends Hero {

    public Wizard() {
        super("Inconnu",3,8);
    }

    public Wizard(String nameChoose) {
        super(nameChoose,3,8);
    }

    public Wizard(String nameChoose, int hpChoose, int strengthChoose) {
        super();
    }

    /**
     * toString
     * @return name, img, hp, strengh
     */
    public String toString() {
        return
                "Nom du Magicien : " + this.name + " avec " +
                        +this.hp + " points de vie et avec " + this.strength + " de force"+
                        " qui se bat avec " + rightHand + " et " + leftHand;
    }
}
