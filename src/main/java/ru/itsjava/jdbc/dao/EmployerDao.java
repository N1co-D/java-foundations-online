package ru.itsjava.jdbc.dao;

import java.sql.SQLException;

public interface EmployerDao {
    int findAgeByName(String name) throws SQLException;
}
