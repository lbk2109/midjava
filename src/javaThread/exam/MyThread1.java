package javaThread.exam;

//자바에서 Thread를 만드는 방법은 크게 Thread클래스를 상속받는 방법과 Runnable인터페이스를 구현하는 방법이 있습니다.
// 1. Thread를 상속받는 방법
//    java.lang.Thread를 상속받는다. 그리고 Thread가 가지고 있는 run()메소드를 오퍼라이딩한다.
// 2. Runable 인터페이스를 구현하는 방법

public class MyThread1 extends Thread {
	String str;

	public MyThread1(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("[%d]%s%n", i, str);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
