package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.UsersDao;
import ru.itsjava.jdbc.dao.UsersJdbcImpl;

public class JdbcHW {

    public static void main(String[] args) {
        UsersDao dao = new UsersJdbcImpl();
        System.out.println("dao.getAgeByUserName(\"Tom\") = " + dao.getAgeByUserName("Tom"));
    }

}
