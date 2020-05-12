package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.model.Guerrier;
import com.dungeon_and_dragon.model.Magicien;

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
                    Guerrier g1 = (Guerrier) created(playerChoose);
                    break;

                case "Magicien":
                    System.out.println("Vous avez choisi le : " + "'" + playerChoose + "'" + " descendant d'ElChapo");
                    isReady = true;
                    Magicien m1 = (Magicien) created(playerChoose);
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

    public Object created(String charType) {

        if (charType.equals("Guerrier")) {
            Guerrier w1 = new Guerrier();

            /*
             * Set du Name
             **/
            Scanner inputName = new Scanner(System.in);
            System.out.print("Rentrez son nom : ");
            String nameChoose = inputName.nextLine();
            w1.setName(inputName.nextLine());

            /*
             * Set du Hp
             **/
            Scanner inputHp = new Scanner(System.in);
            System.out.print("Rentrez sa vie (5-10) : ");
            int hpChoose = inputHp.nextInt();
            w1.setHp(hpChoose);


            /*
             * Set du strength
             **/
            Scanner inputStrength = new Scanner(System.in);
            System.out.print("Rentrez sa force (5-10) : ");
            int strengthChoose = inputStrength.nextInt();
            w1.setStrength(strengthChoose);

            //Affichage des Infos Modifiées
            System.out.println(w1.toString());
            return w1;

        } else {

            Magicien w1 = new Magicien();

            /*
             * Set du Name
             **/
            Scanner inputName = new Scanner(System.in);
            System.out.print("Rentrez son nom : ");
            String nameChoose = inputName.nextLine();
            w1.setName(nameChoose);

            /*
             * Set du Hp
             **/
            Scanner inputHp = new Scanner(System.in);
            System.out.print("Rentrez sa vie (3-6) : ");
            int hpChoose = inputHp.nextInt();
            w1.setHp(hpChoose);


            /*
             * Set du strength
             **/
            Scanner inputStrength = new Scanner(System.in);
            System.out.print("Rentrez sa force (8-15) : ");
            int strengthChoose = inputStrength.nextInt();
            w1.setStrength(strengthChoose);

            //Affichage des Infos Modifiées
            System.out.println(w1.toString());
            return w1;
        }


    }
}
