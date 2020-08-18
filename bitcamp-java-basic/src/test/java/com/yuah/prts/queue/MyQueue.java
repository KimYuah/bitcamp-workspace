package com.yuah.prts.queue;

import com.yuah.prts.linkedlist.MyLinkedList;

public class MyQueue extends MyLinkedList {

  public boolean offer(Object e) {
    return add(e);
  }

  public Object poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public Object peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }
}
