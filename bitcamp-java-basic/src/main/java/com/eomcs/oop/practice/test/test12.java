package com.eomcs.oop.practice.test;

public class test12 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    System.out.println(v instanceof Sedan);
    System.out.println(v instanceof Car);
    System.out.println(v instanceof Vehicle);
    System.out.println(v instanceof Object);

    System.out.println(v instanceof Truck);
    System.out.println(v instanceof Bike);
  }

}
