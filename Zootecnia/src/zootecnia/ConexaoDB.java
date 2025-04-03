package zootecnia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_zootecnia";
    private static final String USER = "root"; // substitua pelo seu usuário
    private static final String PASSWORD = "6642lgk66"; // substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}