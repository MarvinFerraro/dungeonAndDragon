package com.dungeon_and_dragon.engine.MenuEngine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.engine.BoardEngine.BoardCase;
import com.dungeon_and_dragon.engine.DbEngine.CRUD;
import com.dungeon_and_dragon.engine.PlayEngine.Play;

import java.util.Scanner;

public class SuperMenu {
    CRUD db = new CRUD();
    Scanner menu = new Scanner(System.in);
    Play game = new Play();

    public void menu(Hero hero, BoardCase c) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Voici le menu que voulez vous faire ?");
        System.out.println("------- Continuer '1' -------");
        System.out.println("------- Sauvegarder '2' -------");
        System.out.println("------- Quitter et sauvegarder '3' -------");
        System.out.println("------- Quitter '4' -------");
        System.out.println("------- Afficher la liste des Heros existants '5' -------");

        String inputPlayer = menu.nextLine();
        boolean inMenu = true;
        while (inMenu) {
            switch (inputPlayer) {
                case "1":
                    inMenu = false;
                    break;

                case "2":
                    saveHeroMenu(hero);
                    inMenu = false;
                    break;

                case "3":
                    exitAndSave(hero);
                    break;

                case "4":
                    exitWithoutSave();
                    break;

                case "5":
                    displayAllHeroes();
                    inMenu = false;
                    break;

                default:
                    inMenu = false;
                    System.out.println("Ce choix n'est pas possible.");
            }
        }
    }

    public void saveHeroMenu(Hero hero) {
        db.updateHero(hero);
        System.out.println("Personnage bien sauvegarder.");
    }

    public void exitAndSave(Hero hero) {

        System.out.print("Vous êtes sur de vouloir quitter le jeux ? (oui)");
        String exitSaveString = menu.nextLine();
        if (exitSaveString.equals("oui")) {
            db.updateHero(hero);
            System.out.println("Personnage bien sauvegarder.");
            System.exit(0);
        } else {
            System.out.println("Arrète de faire n'importe quoi par contre ! ");
        }
    }

    public void exitWithoutSave() {
        System.out.print("Vous êtes sur de vouloir quitter le jeux ? (oui)");
        String exitString = menu.nextLine();
        if (exitString.equals("oui")) {
            System.exit(0);
        } else {
            System.out.println("Arrète de faire n'importe quoi par contre ! ");
        }
    }

    public void displayAllHeroes() {
        db.getHeroes();
        System.out.println("Tu veux supprimer des infos ?");
        String inputMenuDisplay = menu.nextLine();

        if (inputMenuDisplay.equals("oui")) {
            System.out.println("Saisi le nom du Hero à supprimer.");
            String heroDelete = menu.nextLine();
            db.deleteHero(heroDelete);
            db.getHeroes();
        } else {
            System.out.println("T'es venu ici pour espionner ?");
        }
    }

    public Hero takeExistingHero(Hero hero) {
        db.getHeroes();
        System.out.println("Choisissez le nom du Hero à charger.");
        String nameChoice = menu.nextLine();
        hero = db.dbToHero(nameChoice);
        return hero;
    }
}
