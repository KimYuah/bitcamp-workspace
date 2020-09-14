package com.eomcs.pms.handler;

// '/board/add' 명령을 처리할 커드 객체
public class HelloCommand implements Command {

  @Override
  public void execute() {
    System.out.println("안녕하세요!");
  }
}
