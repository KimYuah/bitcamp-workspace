package com.yuah.prts.corelib;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Iterator0240 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayBlockingQueue stack = new ArrayBlockingQueue(100);
    stack.offer(s1);
    stack.offer(s2);
    stack.offer(s3);
    stack.offer(s4);
    stack.offer(s5);

    Iterator 컬렉션에서값을꺼내주는객체 = stack.iterator();
    while (컬렉션에서값을꺼내주는객체.hasNext()) {
      System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
    }
    System.out.println();

  }
}
