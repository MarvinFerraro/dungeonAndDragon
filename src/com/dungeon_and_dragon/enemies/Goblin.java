package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.Event;
import com.dungeon_and_dragon.engine.Play;

import java.util.Scanner;

public class Goblin extends Vilain implements Event {

    public Goblin() {
        this("Gobeblin", 6, 1); //Appel le constructeur Goblin(full Parametre)
    }

    public Goblin(String name, int hp, int strength) {
        super(name, hp, strength, "Goblin"); // Appel le constructeur parent
    }

    /**
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos) {
        System.out.println("Vous ouvrez la porte, et un gobelin surgis de sous la table... Coquinou");
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
                    System.out.println("Le Gobeln contre attaque avec une force de : " + this.strength + ".");
                    h.setHp(h.getHp() - this.strength);
                    if (h.getHp() > 0) {
                        System.out.println("Il vous reste : " + h.getHp() + " PV.");
                    } else {
                        System.out.println("Après une attaque fulgurante le gobelin vous à tué, SHAME ON YOU !");
                        test = true;
                        System.exit(0);
                    }
                } else {
                    System.out.println("Voila une simple giffle suffisait.");
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