package com.company;
import java.util.Scanner;

public class Menu {

    public void choose() {
        boolean isReady = false;

        while (!isReady) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez choisir votre Personnage (Guerrier / Magicien) : ");
            String playerChoose = scanner.nextLine();

            switch (playerChoose) {
                case "Guerrier":
                    System.out.println("Vous avez choisi le : " + playerChoose + " qui va casser des bouches");
                    isReady = true;
                    break;
                case "Magicien":
                    System.out.println("Vous avez choisi le : " + "'" + playerChoose + "'" + " elChapo");
                    isReady = true;
                    break;
                case "Echap":
                    System.out.println("Vous avez quitté le jeu ! Noob");
                    isReady = true;
                default:
                    System.out.println("Votre choix n'est pas possible.");
            }
        }
    }
}
