package com.dungeon_and_dragon.engine.bdd;


import com.dungeon_and_dragon.characters.Hero;
import java.sql.*;
import java.util.Scanner;

public class CRUD {

    private Connection connect;

    public CRUD() {
        this.connect = Bdd.getInstance().getConnect();
    }


    /**
     * Method to get all Heroes in the table hero
     */
    public void getHeroes() {
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM hero;";
            ResultSet result = state.executeQuery(query);

            while (result.next()) {
                int id = result.getInt(1);
                String type = result.getString(2);
                String name = result.getString(3);
                int life = result.getInt(4);
                int strength = result.getInt(5);

                String output = "User Id: %s: Type: %s - Nom: %s - Vie: %s - Force: %s";
                System.out.println(String.format(output, id, type, name, life, strength));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to take a param String name to get a hero by name
     * Take param String name
     *
     * @param nameChoice
     */
    public void getHeroe(String nameChoice) {
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM hero WHERE Nom = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setString(1, nameChoice);
            ResultSet result = prepare.executeQuery();

            while (result.next()) {
                int id = result.getInt(1);
                String type = result.getString(2);
                String name = result.getString(3);
                int life = result.getInt(4);
                int strength = result.getInt(5);

                String output = "User Id: %s: Type: %s - Nom: %s - Vie: %s - Force: %s";
                System.out.println(String.format(output, id, type, name, life, strength));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to create a hero in the Table Hero
     */
    public void createHero(Hero hero) {
        Scanner save = new Scanner(System.in);
        System.out.println("Vous voulez sauvegarder cet Hero ? (oui)");
        String saveAnswer = save.nextLine();

        if (saveAnswer.equals("oui")) {
            String type = hero.getType();
            String name = hero.getName();
            int life = hero.getHp();
            int strength = hero.getStrength();

            try {
                Statement state = this.connect.createStatement();
                String query = "INSERT INTO `hero` (`id`, `Type`, `Nom`, `NiveauVie`, `NiveauForce`) VALUES (NULL,? ,? ,? ,? );";
                PreparedStatement prepare = this.connect.prepareStatement(query);
                prepare.setString(1, type);
                prepare.setString(2, name);
                prepare.setInt(3, life);
                prepare.setInt(4, strength);
                prepare.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Votre Hero ne sera pas sauvegardé");
        }
    }

    /**
     * method to update a Hero by his name
     * Take param String nameChoice for refer to the Bdd
     * And take newName, newLife, newStrength for uptade the hero
     *
     * @param nameChoice
     * @param newLife
     * @param newStrength
     */
    public void updateHero(String nameChoice, int newLife, int newStrength) {
        try {
            Statement state = this.connect.createStatement();
            String query = "UPDATE `hero` SET `NiveauVie` = ?, `NiveauForce` = ? WHERE `hero`.`Nom` = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setInt(1, newLife);
            prepare.setInt(2, newStrength);
            prepare.setString(3, nameChoice);
            prepare.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Method to delete a Hero by his name
     * Take param String name
     *
     * @param nameChoice
     */
    public void deleteHero(String nameChoice) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM `hero` WHERE `hero`.`Nom` = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setString(1, nameChoice);
            prepare.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
