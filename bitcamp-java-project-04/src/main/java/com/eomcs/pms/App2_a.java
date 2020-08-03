package com.eomcs.pms;

import java.util.Scanner;

public class App2_a {

  public static void main(String[] args) {

    Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[프로젝트]");

    final int MAX_LENGTH = 7;
    int[] no = new int[MAX_LENGTH];
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    String[] startDate = new String[MAX_LENGTH];
    String[] endDate = new String[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];


    long currentMillis = 0;
    int count = 0;

    for(int i = 0; i < 7; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();


      System.out.print("프로젝트명? ");
      title[i]  = keyInput.nextLine();


      System.out.printf("내용? ");
      content[i]  = keyInput.nextLine();


      System.out.printf("시작일? ");
      startDate[i] = keyInput.nextLine();


      System.out.printf("종료일? ");
      endDate[i] = keyInput.nextLine();

      System.out.printf("만든이? ");
      owner[i] = keyInput.nextLine();


      System.out.println("계속 입력하시겠습니까? (y/n)");
      String response = keyInput.nextLine();

      if(response.equalsIgnoreCase("y") == false) {
        break;
      }


    }

    keyInput.close();

    System.out.println("-----------------------------------");

    for (int i = 0; i < count; i++ ) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s,\n",
        no[i], title[i], content[i], startDate[i], endDate[i], owner[i]);
    }


//    System.out.println("-----------------------------------");
//    System.out.printf("번호: %d/n ", no);
//    System.out.printf("프로젝트명: %s\n", title);
//    System.out.printf("내용: %s\n", content);
//    System.out.printf("시작일: %s\n", startDate.toString());
//    System.out.printf("종료일: %s\n", endDate.toString());
//    System.out.printf("만든이: %s\n", owner);
//    System.out.printf("팀: %s\n", members);
//
  }

}

