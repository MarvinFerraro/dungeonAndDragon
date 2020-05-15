package com.dungeon_and_dragon.enemies;

public class Goblin extends Vilain {

    public Goblin() {
        this("Gobeblin", 6,1); //Appel le constructeur Goblin(full Parametre)
    }

    public Goblin(String name, int hp, int strength) {
        super(name,hp,strength, "Goblin"); // Appel le constructeur parent
    }
}
