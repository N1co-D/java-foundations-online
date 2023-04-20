package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.UsersDao;
import ru.itsjava.jdbc.dao.UsersJdbcImpl;

import java.sql.SQLException;

public class JdbcHW {

    public static void main(String[] args) throws SQLException {
        UsersDao dao = new UsersJdbcImpl();
        System.out.println("dao.getAgeByUserName(\"Tom\") = " + dao.getAgeByUserName("Tom"));
    }

}
