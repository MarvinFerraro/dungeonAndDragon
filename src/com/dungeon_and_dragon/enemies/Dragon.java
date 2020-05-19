package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;
import com.dungeon_and_dragon.engine.Menu;
import com.dungeon_and_dragon.engine.Play;

import java.util.Scanner;

public class Dragon extends Vilain implements Event {

    public Dragon() {
        this("Dragon", 15, 4);
    }

    public Dragon(String name, int hp, int strength) {
        super(name, hp, strength, "Dragon");
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        System.out.println("Aie, Voila un dragon...");
        System.out.println(toString());

/** TODO : Faire un random sur le choix de qui commence le combat pour plus de difficulté.
 *
 *
 */
        boolean test = false;

        while (!test) {
            Scanner engage = new Scanner(System.in);
            System.out.print("Vous voulez engager le combat ? (oui)");
            String player = engage.nextLine();

            if (player.equals("oui")) {
                int turn = 1;

                System.out.println("Tour " + turn);
                System.out.println("Vous attaquez avec une force de : " + h.getStrength() + ".");
                this.hp -= h.getStrength();


                if (this.hp > 0) {
                    System.out.println("Il y lui reste : " + this.hp + " PV.");
                    System.out.println("---------------------------");
                    System.out.println("Le dragon contre attaque avec une force de : " + this.strength + ".");
                    h.setHp(h.getHp() - this.strength);
                    if (h.getHp() > 0) {
                        System.out.println("Il vous reste : " + h.getHp() + " PV.");
                    } else {
                        System.out.println("Vous avez succombé au Dragon. YOU ARE NOT A DRAGON SLAYER !");
                    }

                } else {
                    System.out.println("WHAOU ! Quel héro !");
                    test = true;
                }
                turn++;
            } else {
                int reverse = Play.randomNumber();
                currentPos -= reverse;
                h.setHp(h.getStrength() - this.strength);
                System.out.println("LOOSER !!!! Vous avez instantanément perdu.");
                test = true;
            }
        }
    }
}
