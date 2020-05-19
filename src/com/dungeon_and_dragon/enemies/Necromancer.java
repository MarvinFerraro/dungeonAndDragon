package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;
import com.dungeon_and_dragon.engine.Menu;
import com.dungeon_and_dragon.engine.Play;

import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class Necromancer extends Vilain implements Event {

    public Necromancer() {
        this("Nécromancien", 9, 2);
    }

    public Necromancer(String name, int hp, int strength) {
        super(name, hp, strength, "Necromancer");
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        System.out.println("Il est moche, il est mort, il fait des trucs bizare, vous ne revez pas c'est bien un Nécromancien.");
        System.out.println(toString());


        boolean test = false;

        while (!test) {
            Scanner engage = new Scanner(System.in);
            System.out.print("Vous voulez engager le combat ?(oui)");
            String player = engage.nextLine();

            if (player.equals("oui")) {
                int turn = 1;
                System.out.println("Tour " + turn);
                System.out.println("Vous attaquez avec une force de : " + h.getStrength() + ".");
                this.hp -= h.getStrength();

                if (this.hp > 0) {
                    System.out.println("Il y lui reste : " + this.hp + " PV.");
                    System.out.println("---------------------------");
                    System.out.println("Le nécromancien contre attaque avec une force de : " + this.strength + ".");
                    h.setHp(h.getHp() - this.strength);
                    if (h.getHp() > 0) {
                        System.out.println("Il vous reste : " + h.getHp() + " PV.");
                    } else {
                        System.out.println("T'es mort et le nécromancien commence à vous manger...");
                        test = true;
                        System.exit(0);
                    }
                } else {
                    System.out.println("GG WP le nécromancien est retourné avec ces potes.");
                    test = true;
                }
                turn++;
            } else {
                int reverse = Play.randomNumber();
                currentPos -= reverse;
                h.setHp(h.getHp() - this.strength);
                System.out.println("Vous reculez de : "+ reverse +
                        "\nLOOSER !!!! Vous êtes maintenant sur la case : " + currentPos +
                        "\nMais vous avez un pris coup en partant, il vous reste : " + h.getHp());
                test = true;
            }
        }
    }
}
