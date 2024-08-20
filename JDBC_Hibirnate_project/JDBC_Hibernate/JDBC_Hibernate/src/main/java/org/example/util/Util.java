package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD
import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

=======
>>>>>>> origin/main
public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url = "jdbc:mysql://localhost:3306/mysql";
    private static final String login = "root";
    private static final String password = "root";

<<<<<<< HEAD

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
=======
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
>>>>>>> origin/main
    }
}

