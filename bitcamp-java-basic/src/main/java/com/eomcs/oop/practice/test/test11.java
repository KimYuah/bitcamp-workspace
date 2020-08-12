package com.eomcs.oop.practice.test;

public class test11 {
  public static void printCar(Car car) {
    System.out.printf("모델명: %s\n", car.model);
    System.out.printf("cc: %d\n", car.cc);
    System.out.println("-------------------------");
  }

  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 800;

    Truck car2 = new Truck();
    car2.model = "타이탄II";
    car2.cc = 10000;

    // 또다른 해결책?
    // Sedan과 Truck을 모두 처리하는 메서드를 만들어 사용하라!
    printCar(car1); // OK! 왜? Sedan은 Car의 일종이다.
    printCar(car2); // OK! 왜? Truck도 Car의 서브클래스이다.

 }
}
