package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "select no, name, email, password, photo, tel, cdt"
            + " from pms_member"
            + " order by no desc");
        ResultSet rs = stmt.executeQuery()) {

      System.out.println("번호, 이름, 이메일, 암호, 사진, 전화, 등록일");
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
            rs.getInt("no"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("password"),
            rs.getString("photo"),
            rs.getString("tel"),
            rs.getDate("cdt"));
      }
     } catch (Exception e) {
       System.out.println("회원 목록 조회 중 오류 발생!");
       e.printStackTrace();
     }
    }
}
