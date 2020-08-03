// 반복문 for
package com.eomcs.basic.ex06;

import java.util.ArrayList;
import java.util.Date;

public class Exam0410 {
  public static void main(String[] agrs) {
    // for(변수선언 및 초기화; 조건; 증감문) 문장;
    // for(변수선언 및 초기화; 조건; 증감문) {문장; 문장; ...}
    ArrayList scores = new ArrayList();
    scores.add(100);
    scores.add(3.14f);
    scores.add("오호라");
    scores.add(true);
    scores.add('헐');
    scores.add(new Date());


    for (Object value : scores) {
      System.out.println(value);
     }

  }
}

