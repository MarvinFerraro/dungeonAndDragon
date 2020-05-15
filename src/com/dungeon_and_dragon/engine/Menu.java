package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.*;

import java.util.Scanner;
import java.util.regex.*;

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
        String type = hero.getType();
        Pattern pattern = Pattern.compile("[a-zA-Z]");

        /*
         * Set du Name
         **/
        boolean inputNameBool = false;
        while(!inputNameBool) {
            Scanner inputName = new Scanner(System.in);
            System.out.print("Rentrez son nom : ");
            String nameChoose = inputName.nextLine();

            if (nameChoose != null && !nameChoose.isEmpty()) {
                hero.setName(nameChoose);
                inputNameBool = true;
            } else {
                System.out.println("Le nom n'est pas valide");
            }
        }

        /*
         * Set du Hp
         **/
        boolean inputHpBool = false;

        while (!inputHpBool) {
            if (type.equals("Warrior")) {
                Scanner inputHp = new Scanner(System.in);
                System.out.print("Rentrez sa vie (5-10) : ");
                int hpChoose = inputHp.nextInt();

                if (hpChoose >= hero.getLifeMin() && hpChoose <= hero.getLifeMax()) {
                    hero.setHp(hpChoose);
                    inputHpBool = true;

                } else if (hpChoose < hero.getLifeMin()) {
                    hero.setHp(hero.getLifeMin());
                    System.out.println("Attribution de la vie minimum 5");
                    inputHpBool = true;

                } else {
                    hero.setHp(hero.getLifeMax());
                    System.out.println("Attribution de la vie maximum 5");
                    inputHpBool = true;
                }

            } else {
                Scanner inputHp = new Scanner(System.in);
                System.out.print("Rentrez sa vie (3-6) : ");
                int hpChoose = inputHp.nextInt();

                if (hpChoose >= hero.getLifeMin() && hpChoose <= hero.getLifeMax()) {
                    hero.setHp(hpChoose);
                    inputHpBool = true;

                } else if (hpChoose < hero.getLifeMin()) {
                    hero.setHp(hero.getLifeMin());
                    System.out.println("Attribution de la vie minimum 3");
                    inputHpBool = true;

                } else {
                    hero.setHp(hero.getLifeMax());
                    System.out.println("Attribution de la vie maximum 6");
                    inputHpBool = true;
                }
            }
        }

        /*
         * Set du strength
         **/
        boolean inputStrengthBool = false;

        while (!inputStrengthBool) {
            if (type.equals("Warrior")) {
                Scanner inputStrength = new Scanner(System.in);
                System.out.print("Rentrez sa force (5-10) : ");
                int strengthChoose = inputStrength.nextInt();

                if (strengthChoose >= hero.getStrengthMin() && strengthChoose <= hero.getStrengthMax()) {
                    hero.setStrength(strengthChoose);
                    inputStrengthBool = true;

                } else if (strengthChoose < hero.getStrengthMin()) {
                    hero.setStrength(hero.getStrengthMin());
                    System.out.println("Attribution de la force minimum : 5");
                    inputStrengthBool = true;

                } else {
                    hero.setStrength(hero.getStrengthMax());
                    System.out.println("Attribution de la force maximum : 10");
                    inputStrengthBool = true;
                }

            } else {
                Scanner inputStrength = new Scanner(System.in);
                System.out.print("Rentrez sa force (8-15) : ");
                int strengthChoose = inputStrength.nextInt();

                if (strengthChoose >= hero.getStrengthMin() && strengthChoose <= hero.getStrengthMax()) {
                    hero.setStrength(strengthChoose);
                    inputStrengthBool = true;

                } else if (strengthChoose < hero.getStrengthMin()) {
                    hero.setStrength(hero.getStrengthMin());
                    System.out.println("Attribution de la force minimum : 8");
                    inputStrengthBool = true;

                } else {
                    hero.setStrength(hero.getStrengthMax());
                    System.out.println("Attribution de la force maximum : 15");
                    inputStrengthBool = true;
                }
            }
        }

        /*
         * Set du RightHand
         **/
        boolean inputRightHandBool = false;
        while (!inputRightHandBool) {
            Scanner inputRightHand = new Scanner(System.in);
            System.out.print("Rentrez une arme main droite : ");
            String rightHandChoose = inputRightHand.nextLine();
//
//            if (Pattern.matches("[a-zA-z]", rightHandChoose)) {
                hero.setRightHand(rightHandChoose);
                inputRightHandBool = true;
//            } else {
//                System.out.print("Ce n'est pas une arme\n");
//            }
        }

        /*
         * Set du inputLeftHand
         **/
        boolean inputLeftHandBool = false;
        while (!inputLeftHandBool) {
            Scanner inputLeftHand = new Scanner(System.in);
            System.out.print("Rentrez une arme main gauche : ");
            String leftHandChoose = inputLeftHand.nextLine();

//            if (Pattern.matches("[a-zA-z]", leftHandChoose)) {
                hero.setLeftHand(leftHandChoose);
                inputLeftHandBool = true;
//            } else {
//                System.out.print("Ce n'est pas une arme\n");
//            }
        }
        return hero;
    }
}
