package com.eomcs.JDBC.ex02;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam0320 {

  public static void main(String[] args) throws Exception {


    try (java.sql.Connection con = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board order by board_id desc");
        ResultSet rs = stmt.executeQuery()) {

      System.out.println("번호, 제목, 등록일, 조회수");
    while(rs.next()) {
        System.out.printf("%d, %s, %s, %d\n",
            rs.getInt("board_id"),
            rs.getString("title"),
            rs.getDate("created_date"),
            rs.getInt("view_count"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


