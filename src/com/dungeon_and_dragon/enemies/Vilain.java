package com.dungeon_and_dragon.enemies;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.BoardEngine.BoardCase;
import com.dungeon_and_dragon.engine.BoardEngine.Event;
import com.dungeon_and_dragon.engine.PlayEngine.Play;

import java.util.Scanner;

public abstract class Vilain extends BoardCase implements Event {

    protected String name;
    protected int hp, strength;
    protected String type;

    /**
     * Constructor with no param
     */
    public Vilain() {
        this("Inconnu", 0, 0, "Vilain");
    }

    /**
     * The Constructor for the vilain. With all param !
     * @param name
     * @param hp
     * @param strength
     * @param type
     */
    public Vilain(String name, int hp, int strength, String type) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.type = "Vilain";
    }

    /**
     * This method returns a String that defines the object
     * @return Object String
     */
    public String toString() {
        return "Nom : " + this.name + "\nPoints de vie : " + this.hp + "\nForce d'attaque : " + this.strength;
    }

    /** Method Who override the interact method in Interface Event
     * @param h
     */
    @Override
    public void interact(Hero h, int currentPos, BoardCase array) {

        if ( array.getCase(currentPos) instanceof Goblin) {
            System.out.println("Un petit gobelin c'était cacher sous la table ! ");
        } else if (array.getCase(currentPos) instanceof Necromancer) {
            System.out.println("Il est moche, il est mort, et il fait des trucs chelou... C'est bien un Nécromancien");
        } else {
            System.out.println("Aie, voila un dragon...");
        }

        System.out.println(toString());
        boolean test = false;

        while (!test) {
            Scanner engage = new Scanner(System.in);
            System.out.print("Vous voulez continué le combat ? (oui)");
            String player = engage.nextLine();

            if (player.equals("oui")) {
                System.out.println("Vous attaquez avec une force de : " + h.getStrength() + ".");
                this.hp -= h.getStrength();

                if (this.hp > 0) {
                    System.out.println("Il y lui reste : " + this.hp + " PV.");
                    System.out.println("---------------------------");
                    System.out.println("Il contre attaque avec une force de : " + this.strength + ".");
                    h.setHp(h.getHp() - this.strength);
                    if (h.getHp() > 0) {
                        System.out.println("Il vous reste : " + h.getHp() + " PV.");
                    } else {
                        System.out.println("Vous avez succombé. YOU ARE NOT A TRUE HERO!");
                        test = true;
                        System.exit(0);
                    }
                } else {
                    System.out.println("WHAOU ! Quel héro !");
                    test = true;
                }
            } else {
                currentPos = Play.reverse(currentPos);
                h.setHp(h.getHp() - this.strength);
                System.out.println("LOOSER !!!! Vous êtes maintenant sur la case : " + currentPos +
                        "\nMais vous avez pris un coup en partant, il vous reste : " + h.getHp());
                if (h.getHp() <= 0 ) {
                    System.out.println("Vous avez succombé. YOU ARE NOT A TRUE HERO!");
                    test = true;
                    System.exit(0);
                } else {
                    test = true;
                }
            }
        }
    }

    /**
     * Return a the String name of the object
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method take a String in param, for set the name attribute.
     * @param name
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Pas de valeur nul!");
        }
    }

    /**
     *  Return a the Int hp of the object
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Method take a String in param, for set the hp attribute.
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Return a the Int strength of the object
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Method take a String in param, for set the strength attribute.
     * @param strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

}
