package com.dungeon_and_dragon.equipements.utilities;

public class MinorHealthPotion extends Decoction{

    public MinorHealthPotion() {
        this("Potion de vie mineur", 2);
    }
    public MinorHealthPotion(String name, int addHp) {
            super(name,addHp,"PotionSmallHp");
    }
}
