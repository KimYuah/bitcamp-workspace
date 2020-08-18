package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Queue를 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) Queue에 값을 추가하는 offer를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
public class MyQueue04 extends MyLinkedList {

  public boolean offer(Object e) { // 값을 추가하는 것.
    return add(e);
  }

  public Object poll() { // 값을 꺼내는 것.
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public Object peek() { // 제일 앞에 뭐가 있는지 조사하는 것.
    if (size() == 0) {
      return null;
    }
    return get(0);
  }
}
