package javaThread.exam;

//자바에서 Thread를 만드는 방법은 크게 Thread클래스를 상속받는 방법과 Runnable인터페이스를 구현하는 방법이 있습니다.
//1) Runnable인터페이스를 구현해서 쓰레드를 만드는 방법 
//   Runable 인터페이스가 가지고 있는 run()메소드를 구현한다. 
//2) Runable 인터페이스를 구현한 MyThread2 사용하는 방법 
//	 MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니다. 
//	 Thread를 생성하고, 해당 생성자에 MyThread2를 넣어서 Thread를 생성한다. 
//	 Thread 클래스가 가진 start()메소드를 호출한다. 

public class MyThread2 extends Car implements Runnable {
	String str;

	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		Car c = new Car();
		c.Start();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("[%d]%s%n", i, str);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		c.Stop();
	}
}
