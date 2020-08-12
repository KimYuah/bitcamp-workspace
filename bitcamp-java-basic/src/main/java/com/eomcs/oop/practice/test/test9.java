package com.eomcs.oop.practice.test;

public class test9 {

    public static void printSedan(Sedan sedan) {
      System.out.printf("모델명: %s\n", sedan.model);
      System.out.printf("cc: %d\n", sedan.cc);
      System.out.println("-------------------------");
    }

    public static void main(String[] args) {
      Sedan car1 = new Sedan();
      car1.model = "티코";
      car1.cc = 800;

      Truck car2 = new Truck();
      car2.model = "타이탄II";
      car2.cc = 10000;

      printSedan(car1);

      // printSedan()의 파라미터는 Sedan 객체의 주소만 받을 수 있다.
      // 그래서 Truck 객체를 전달할 수 없다.
      printTruck(car2); // 컴파일 오류!

 }
}