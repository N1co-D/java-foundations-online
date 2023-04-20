package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UsersJdbcImpl implements UsersDao {
    public static final String DB_URL = "jdbc:MySql://127.0.0.1:3306/schema_java?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

//    @Override
//    public int getAgeByUserName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select age from schema_java.users where name = '" + name + "';");
//            resultSet.next();
//            return resultSet.getInt("age");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public int getAgeByUserName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_java.users where name = ?")
        ) {
            preparedStatement.setString(1, "Tom");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        }
    }

}