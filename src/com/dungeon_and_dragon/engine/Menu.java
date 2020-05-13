package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.model.Warrior;
import com.dungeon_and_dragon.model.Hero;
import com.dungeon_and_dragon.model.Wizard;

import java.util.Scanner;

public class Menu {

    public void choose() {
        boolean isReady = false;

        while (!isReady) {
            Scanner Charscanner = new Scanner(System.in);
            System.out.print("Veuillez choisir votre Personnage (Guerrier / Magicien) : ");
            String playerChoose = Charscanner.nextLine();

            switch (playerChoose) {
                case "Guerrier":
                    System.out.println("Vous avez choisi le : " + playerChoose + " qui va casser des bouches");
                    isReady = true;
                    Hero heroW = new Warrior();
                    createHero(heroW);
                    System.out.println(heroW.toString());
                    break;

                case "Magicien":
                    System.out.println("Vous avez choisi le : " + "'" + playerChoose + "'" + " descendant d'ElChapo");
                    isReady = true;
                    Hero heroM = new Wizard();
                    createHero(heroM);
                    System.out.println(heroM.toString());
                    break;

                case "Echap":
                    System.out.println("Vous avez quitté le jeu ! Noob");
                    isReady = true;
                    break;

                default:
                    System.out.println("Votre choix n'est pas possible.");
            }

            if (isReady) {
                Scanner startScanner = new Scanner(System.in);
                System.out.print("Veuillez rentrer 'START' pour commencer : ");

                String printStart = startScanner.nextLine().toUpperCase();
                System.out.println("\nLe jeu à débuté");
            }
        }
    }

    public Hero createHero(Hero hero) {

        /*
         * Set du Name
         **/
        Scanner inputName = new Scanner(System.in);
        System.out.print("Rentrez son nom : ");
        String nameChoose = inputName.nextLine();
        hero.setName(nameChoose);

        /*
         * Set du Hp
         **/
        Scanner inputHp = new Scanner(System.in);
        System.out.print("Rentrez sa vie (5-10) : ");
        int hpChoose = inputHp.nextInt();
        hero.setHp(hpChoose);

        /*
         * Set du strength
         **/
        Scanner inputStrength = new Scanner(System.in);
        System.out.print("Rentrez sa force (5-10) : ");
        int strengthChoose = inputStrength.nextInt();
        hero.setStrength(strengthChoose);

        /*
         * Set du RightHand
         **/
        Scanner inputRightHand = new Scanner(System.in);
        System.out.print("Rentrez une arme main droite : ");
        String RightHandChoose = inputRightHand.nextLine();
        hero.setRightHand(RightHandChoose);

        /*
         * Set du inputLeftHand
         **/
        Scanner inputLeftHand = new Scanner(System.in);
        System.out.print("Rentrez une arme main gauche : ");
        String LeftHandChoose = inputLeftHand.nextLine();
        hero.setLeftHand(LeftHandChoose);

        return hero;
    }

}
