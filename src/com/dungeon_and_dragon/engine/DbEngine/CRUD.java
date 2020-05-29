package com.dungeon_and_dragon.engine.DbEngine;


import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.characters.Warrior;
import com.dungeon_and_dragon.characters.Wizard;

import java.sql.*;
import java.util.Scanner;

public class CRUD {

    private Connection connect;

    public CRUD() {
        this.connect = Bdd.getInstance().getConnect();
    }

    private void closeSql(Statement state, ResultSet result) {
        try {
            if (state != null ) {
                state.close();
            }
            if (result != null ) {
                result.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to get all Heroes in the table hero
     */
    public void getHeroes() {
        Statement state = null;
        ResultSet result = null;
        try {
            state = this.connect.createStatement();
            String query = "SELECT * FROM hero;";
            result = state.executeQuery(query);

            while (result.next()) {
                int id = result.getInt(1);
                String type = result.getString(2);
                String name = result.getString(3);
                int life = result.getInt(4);
                int strength = result.getInt(5);

                String output = "User Id: %s: Type: %s - Nom: %s - Vie: %s - Force: %s";
                System.out.println(String.format(output, id, type, name, life, strength));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            closeSql(state,result);
        }
    }

    /**
     * Method to take a param String name to get a hero by name
     * Take param String name
     *
     * @param nameChoice
     */
    public void getHeroe(String nameChoice) {
        Statement state = null;
        ResultSet result = null;
        try {
            state = this.connect.createStatement();
            String query = "SELECT * FROM hero WHERE Nom = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setString(1, nameChoice);
            result = prepare.executeQuery();

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
        } finally {
            closeSql(state,result);
        }
    }

    /**
     * Method to create a hero in the Table Hero
     */
    public void saveHero(Hero hero) {
        Scanner save = new Scanner(System.in);
        System.out.println("Vous voulez sauvegarder cet Hero ? (oui)");
        String saveAnswer = save.nextLine();
        Statement state = null;
        ResultSet result = null;

        if (saveAnswer.equals("oui")) {
            String type = hero.getType();
            String name = hero.getName();
            int life = hero.getHp();
            int strength = hero.getStrength();

            try {
                 state = this.connect.createStatement();
                String query = "INSERT INTO `hero` (`id`, `Type`, `Nom`, `NiveauVie`, `NiveauForce`) VALUES (NULL,? ,? ,? ,? );";
                PreparedStatement prepare = this.connect.prepareStatement(query);
                prepare.setString(1, type);
                prepare.setString(2, name);
                prepare.setInt(3, life);
                prepare.setInt(4, strength);
                prepare.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                closeSql(state,result);
            }
        } else {
            System.out.println("Votre Hero ne sera pas sauvegardé");
        }
    }

    /**
     * method to update a Hero by his name
     * Take param String nameChoice for refer to the Bdd
     * And take Object Hero in param for uptade the hero
     *
     * @param hero
     */
    public void updateHero(Hero hero) {
        Statement state = null;
        ResultSet result = null;
        try {
            state = this.connect.createStatement();
            String query = "UPDATE `hero` SET `NiveauVie` = ?, `NiveauForce` = ? WHERE `hero`.`Nom` = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setInt(1, hero.getHp());
            prepare.setInt(2, hero.getStrength());
            prepare.setString(3, hero.getName());
            prepare.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSql(state,result);
        }

    }

    /**
     * Method to delete a Hero by his name
     * Take param String name
     *
     * @param nameChoice
     */
    public void deleteHero(String nameChoice) {
        Statement state = null;
        ResultSet result = null;
        try {
            state = this.connect.createStatement();
            String query = "DELETE FROM `hero` WHERE `hero`.`Nom` = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setString(1, nameChoice);
            prepare.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSql(state,result);
        }
    }

    public Hero dbToHero(String nameChoice) {
        Statement state = null;
        ResultSet result = null;
        Hero hero = null;
        try {
            state = this.connect.createStatement();
            String query = "SELECT * FROM hero WHERE Nom = ?;";
            PreparedStatement prepare = this.connect.prepareStatement(query);
            prepare.setString(1, nameChoice);
            result = prepare.executeQuery();

            while (result.next()) {
                if( result.getString(3).equals("Warrior")) {
                    hero = new Warrior();
                } else {
                    hero = new Wizard();
                }
                hero.setName(result.getString(3));
                hero.setHp(result.getInt(4));
                hero.setStrength(result.getInt(5));
                System.out.println("Chargement de votre Hero");
                System.out.println("Nom : " + hero.getName() + "|  Vie : " + hero.getHp() + "| Force : " + hero.getStrength());
            }
            return hero;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSql(state,result);
        }
        return hero;
    }
}
