package com.eomcs.oop.ex05.f;

public class A /*extends Object*/ {
  int v1;

  A() {
    // 수퍼 클래스의 어떤 생성자를 호출할지 지정하지 않으면 컴파일러는
    // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하라는 명령을 붙인다.
    //super(); // 즉 개발자가 붙이지 않으면 자동으로 붙인다.

    // 헐.. 강사님, A 클래스의 수퍼 클래스는 없는데요?
    // => 클래스를 정의할 때 수퍼 클래스를 지정하지 않으면,
    //    컴파일러는 자동으로 수퍼 클래스를 java.lang.Object 클래스로 지정한다.
    // => 그래서 자바의 모든 클래스는 반드시 수퍼 클래스가 있으며,
    //    자바의 모든 클래스는 java.lang.Object의 자손 클래스가 된다.

    System.out.println("A() 생성자!");
  }

  void m1() {
    System.out.println("A.m1()");
  }

}



