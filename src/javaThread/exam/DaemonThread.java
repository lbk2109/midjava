package javaThread.exam;

//데몬(Daemon)이란 보통 리눅스와 같은 유닉스계열의 운영체계에서 백그라운드로 동작하는 프로그램을 말한다.
//1.데몬쓰레드를 만드는 방법은 쓰레드에 데몬을 설정하면 된다.
//  이런 쓰레드는 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 처리하게 하는 용도로 만든다.
//2.데몬쓰레드는 일반 쓰레드(main등)가 모두 종료되면 강제적으로 종료되는 특징을 가지고 있다.

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// Runnable을 구현하는 DaemonThread를 실행하기 위하여 Thread 생성
		Thread thread = new Thread(new DaemonThread());
		System.out.println("메인 쓰레드를 시작합니다. ");

        // 데몬쓰레드로 설정
		thread.setDaemon(true);
        
		// 데몬쓰레드로 설정
		thread.start();

		// 메인 쓰레드가 1초뒤에 종료되도록 설정.
		// 데몬쓰레드는 다른 쓰레드가 모두 종료되면 자동종료.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}

}
