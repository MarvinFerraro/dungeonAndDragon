package com.dungeon_and_dragon.enemies;

public class Dragon extends Vilain{

    public Dragon() {
        this("Dragon",14,4);
    }

    public Dragon(String name,int hp, int strength) {
        super(name,hp,strength, "Dragon");
    }
}
