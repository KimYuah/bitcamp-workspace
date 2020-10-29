package com.eomcs.JDBC.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0110 {
  public static void main(String[] args) {
    try {
     java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();
     java.sql.Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
     java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();

     DriverManager.registerDriver(mariadbDriver);
     DriverManager.registerDriver(oracleDriver);
     DriverManager.registerDriver(mssqlDriver);

     System.out.println("JDBC 드라이버 로딩 및 등록 완료!");

     java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
     System.out.println(driver);
     java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
     System.out.println(driver2);
     java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
     System.out.println(driver3);


    } catch (SQLException e) {
      e.printStackTrace();
    }
 }
}
