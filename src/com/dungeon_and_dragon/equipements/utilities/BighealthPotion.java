package com.dungeon_and_dragon.equipements.utilities;

public class BighealthPotion extends Decoction{
    public BighealthPotion() {
        this("Potion de Vie Majeur", 5);
    }
    public BighealthPotion(String name, int addHp) {
        super(name,addHp,"PotionBigHp");
    }

    public String toString() {
        return "Nom de la décoction : " + this.name +
                "\nNombre de PV rendu :" +this.addHp;
    }
}
