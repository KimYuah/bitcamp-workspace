// Executors 태스크 프레임워크 - 스레드풀 종료 : shutdown()
package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0410 {
  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행중 ...",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(2000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(4000));

    executorService.shutdown();

    // shutdown()을 한다음 execute를 호출하면 예외가 발생한다.
    executorService.execute(new MyRunnable(4000));

    System.out.println("main() 종료!");
  }
}

