package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void connect(String path){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite" + path);
            System.out.println("Works!");
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
