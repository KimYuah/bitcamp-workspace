package com.eomcs.JDBC.ex01;

import java.sql.DriverManager;

public class Exam0350 { //업데이트

  public static void main(String[] args) throws Exception {


    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();

      ) {


      int count = stmt.executeUpdate(
          "update x_board set view_count = view_count + 1"
          + " where board_id = 4");
       System.out.printf("%d 개 변경 성공!", count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


