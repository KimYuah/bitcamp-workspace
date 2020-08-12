package com.eomcs.oop.practice.test;

public class test2 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    Bike b2 = null;

    b2 = (Bike) v;

    b2.engine = true;


}
}
