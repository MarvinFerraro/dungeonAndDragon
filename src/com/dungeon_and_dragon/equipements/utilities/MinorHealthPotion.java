package com.dungeon_and_dragon.equipements.utilities;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;

public class MinorHealthPotion extends Decoction implements Event {

    public MinorHealthPotion() {
        this("Potion de vie mineur", 2);
    }

    public MinorHealthPotion(String name, int addHp) {
        super(name, addHp, "PotionSmallHp");
    }

    @Override
    public void interact(Hero h) {
        System.out.println("Entre le Whisky et le Pastis, vous trouvez une petite popo de vie.");
        h.setHp(h.getHp() + 2);
        System.out.println("\nVos points de vie : " + h.getHp());
    }
}
