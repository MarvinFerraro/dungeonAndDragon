package com.dungeon_and_dragon.equipements.utilities;

public class MinorHealthPotion extends Decoction{

    public MinorHealthPotion() {
        super("Potion de vie mineur", 2 ,"PotionSmallHp");
    }
    public MinorHealthPotion(String name, int addHp, String type) {
            super(name,addHp,"PotionSmallHp");
    }
}
