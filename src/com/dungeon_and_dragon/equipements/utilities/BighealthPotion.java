package com.dungeon_and_dragon.equipements.utilities;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.Event;

public class BighealthPotion extends Decoction implements Event {
    public BighealthPotion() {
        this("Potion de Vie Majeur", 5);
    }

    public BighealthPotion(String name, int addHp) {
        super(name, addHp, "PotionBigHp");
    }

    public String toString() {
        return "Nom de la décoction : " + this.name +
                "\nNombre de PV rendu :" + this.addHp;
    }

    @Override
    public void interact(Hero h) {
        System.out.println("LA PUTAIN DE BIG POPO CA FAIS ZIZIR ! PSERTEK ! ");
        h.setHp(h.getHp() + 5);
        System.out.println("\nVos points de vie : " + h.getHp());
    }
}
