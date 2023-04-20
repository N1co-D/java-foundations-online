package ru.itsjava.jdbc.dao;

import java.sql.SQLException;

public interface UsersDao {
    int getAgeByUserName(String name) throws SQLException;

}
