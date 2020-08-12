package com.eomcs.oop.practice.test;

public class test13 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    System.out.println(v.getClass() == Sedan.class);
    System.out.println(v.getClass() == Car.class);
    System.out.println(v.getClass() == Vehicle.class);
    System.out.println(v.getClass() == Truck.class);
    System.out.println(v.getClass() == Bike.class);
  }
}
