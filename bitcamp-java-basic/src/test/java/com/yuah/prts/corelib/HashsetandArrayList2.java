package com.yuah.prts.corelib;

import java.util.ArrayList;

public class HashsetandArrayList2 {
    public static void main(String[] args) {

      String v1 = new String("aaa");
      String v2 = new String("bbb");
      String v3 = new String("ccc");
      String v4 = new String("ddd");

      ArrayList list = new ArrayList();
      list.add(v1);
      list.add(v2);
      list.add(v3);
      list.add(v4);
      list.add(v3);

      print(list);
    }

    static void print(ArrayList set) {
      Object[] values = set.toArray();
      for (Object value : values) {
        System.out.print(value + ", ");
      }
      System.out.println();
    }
}
