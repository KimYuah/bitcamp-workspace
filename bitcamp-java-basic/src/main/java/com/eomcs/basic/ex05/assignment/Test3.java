package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 
// - 다음 int 변수에 들어 있는 값을
//   다음과 같이 첫 바이트부터 끝 바이트까지 16진수로 순서대로 출력하라!
//실행 예)
//입력? 2864434397
//aa
//bb
//cc
//dd
//
public class Test3 {

  public static void main(String[] args) {
    // 코드를 완성하시오!
    int value = 0xaabbccdd; // [10101010_10111011_11011101_11001100]
    System.out.println(Integer.toHexString(value >> 24 & 0xff));
    System.out.println(Integer.toHexString(value >> 16 & 0xff));
    System.out.println(Integer.toHexString(value >> 8 & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));

  } 

}








