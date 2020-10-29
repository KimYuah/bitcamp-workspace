package com.eomcs.JDBC.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0210 {
  public static void main(String[] args) {

    java.sql.Connection con = null;

    try {
      // DB 연결
       con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb", // jdbcURL
          "study", // username
          "1111" // password
          );

      System.out.println("DBMS와 연결됨!");
      System.out.println(con.getClass().getName());

    } catch (SQLException e) {
      e.printStackTrace();

    } finally {
      try {
        con.close();
      } catch (Exception e) {

      }
    }
 }
}
