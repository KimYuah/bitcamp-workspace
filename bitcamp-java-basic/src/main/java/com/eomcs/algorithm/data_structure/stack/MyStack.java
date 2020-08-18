package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) Stack에 값을 추가하는 push() 메서드를 정의한다.
// 3) Stack에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
// 4) Stack에서 제일 마지막에 입력한 값을 조회하는 peek()을 정의한다.
public class MyStack extends MyLinkedList {

  public Object push(Object item) { // 값을 추가 하는 메서드
    add(item);
    return item;
  }

  public Object pop() { // 제일 마지막에 추가한 값을 꺼내는 메서드
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public Object peek() { // 제일 마지막에 입력한 값을 조회하는 메서드
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }
}
