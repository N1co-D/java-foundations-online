package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.EmployerDao;
import ru.itsjava.jdbc.dao.EmployerJdbcImpl;

import java.sql.SQLException;

public class JdbcPractice {
    //    public static final String DB_URL = "jdbc:MySql://127.0.0.1:3306/schema_java?serverTimezone=UTC";
//    public static final String DB_LOGIN = "root";
//    public static final String DB_PASSWORD = "";
//
    public static void main(String[] args) throws SQLException {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select name, age from schema_java.employers;");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age"));
//            }
//        }
        EmployerDao dao = new EmployerJdbcImpl();
        System.out.println("dao.findAgeByName(\"Tanya\") = " + dao.findAgeByName("Tanya"));
    }
}
