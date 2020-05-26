package com.dungeon_and_dragon.equipements.utilities;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.engine.BoardCase;
import com.dungeon_and_dragon.engine.Event;

public class BighealthPotion extends Decoction {

    public BighealthPotion() {
        this("Potion de Vie Majeur", 5);
    }

    public BighealthPotion(String name, int addHp) {
        super(name, addHp, "PotionBigHp");
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos, BoardCase array) {
        System.out.println("LA PUTAIN DE BIG POPO CA FAIS ZIZIR ! PSERTEK ! ");
        h.setHp(h.getHp() + this.addLife);
        System.out.println("\nVos points de vie : " + h.getHp());
    }
}
