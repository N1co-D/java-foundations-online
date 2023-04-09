package ru.itsjava.jdbc.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDao {
    public static final String DB_URL = "jdbc:MySql://127.0.0.1:3306/schema_java?serverTimezone=UTC";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "";

//    @Override
//    public int findAgeByName(String name) throws SQLException {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select age from schema_java.employers where name = '" + name + "';");
//            resultSet.next();
//            return resultSet.getInt("age");
//        }
//    }

    @Override
    public int findAgeByName(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_java.employers where name = ?")
        ) {
            preparedStatement.setString(1, "Tanya");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        }
    }

}

