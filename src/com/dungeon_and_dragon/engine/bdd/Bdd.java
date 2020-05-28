package com.dungeon_and_dragon.engine.bdd;

import java.sql.*;

public class Bdd {

    private Connection connect;
    private static Bdd bdd;

    private Bdd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Ok");
            this.connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dungeon_dragon?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false","root","");
            System.out.println("Connected");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bdd getInstance() {
        if (bdd == null) {
            System.out.println("Instantiation de la connexion.");
            bdd = new Bdd();
        }
        return bdd;
    }

    public Connection getConnect(){
        return this.connect;
    }

}
