package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample {
    public static void main(String[] args) {

        //接続文字列
        String url = "jdbc:postgresql://localhost:5432/sample";
        String user = "postgres";
        String password = "postgres";
        String sql = "SELECT * FROM users";

        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String first_name = rs.getString("first_name");
                System.out.println(first_name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}