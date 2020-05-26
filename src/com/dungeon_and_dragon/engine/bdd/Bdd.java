package com.dungeon_and_dragon.engine.bdd;

import java.sql.*;

public class Bdd {

    public Bdd() {
    }

    public void connectBdd() {

        String connectionUrl =
                "jdbc:sqlserver://localhost.database.windows.net:8080;"
                        + "database=dungeon_dragon;"
                        + "user=root;"
                        + "password=;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println("Connect");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
