package javaThread.exam;

public class ThreadExam {

	public static void main(String[] args) {
		
		//Thread를 상속받는 방법
		MyThread1 t11 = new MyThread1("*");
		MyThread1 t12 = new MyThread1("-");
		t11.start();
		t12.start();
		System.out.println("MyThread1 END--!");
		
		//Runable 인터페이스를 구현하는 방법
		MyThread2 t21 = new MyThread2("#");
		MyThread2 t22 = new MyThread2("$");		
		Thread rt21 = new Thread(t21);
		Thread rt22 = new Thread(t22);		
		// 이건 쓰레드로 실행되지 않음.
        // t21.run();
        // t22.run();		
		rt21.start();
		rt22.start();       
		
		System.out.println("MyThread2 END--!");
	}

}
