package com.eomcs.context;

public interface ApplicationContextListener {

  // 발행자(애플리케이션)가 애플리케이션 시작을 알리기 위해 호출하는 메서드
  void contextInitialized();

  //발행자(애플리케이션)가 애플리케이션 종료를 알리기 위해 호출하는 메서드
  void contextDestroyed();
}
