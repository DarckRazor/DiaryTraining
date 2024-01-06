package com.rosenthal.diarytraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConects {
    private static final String URL = "jdbc:postgresql://localhost:5432/DairyTraining";

    private static final String USER = "postgres";
    private static final String PASSWORD = "World_is_wide01";

    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to database...");
            System.out.println("URL: " + URL);
            System.out.println("User: " + USER);

            Connection conn =  DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false);
            return  conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Failed to load the PostgreSQL JDBC driver.", e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Failed to connect to the database.", e);
        }
    }
}
