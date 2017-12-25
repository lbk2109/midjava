package javaThread.exam;

//공유객체가 가진 메소드를 동시에 호출 되지않도록 하는 방법
// 1.메소드 앞에 Synchronized를 붙인다.
// 2.여러개의 Thread들이 공유객체의 메소드를 사용할 때 메소드에 synchronized 가 붙어 있을 경우
//    먼저 호출한 메소드가 객체의 사용권(Monitoring Lock)을 얻는다
// 3.메소드 앞에 synchronized를 붙여서 실행해 보면, 메소드 하나가 모두 실행된 후에 다음 메소드가 실행된다.
// 4.해당 모니터링 락은 메소드 실행이 종료되거나 wait()와 같은 메소드를 만나기 전까지 유지된다.
// 5.다른 쓰레드들은 모니터링 락을 놓을때까지 대기한다.
// 6.synchronized를 메소드에 붙혀서 사용 할 경우, 메소드의 코드가 길어지면, 
//   마지막 대기하는 쓰레드가 너무 오래 기다리는 것을 막기위해 메소드에 synchronized를 붙이지않고, 
//   문제가 있을거 같은 부분만 synchronized블록을 사용한다.
public class MusicBox {

	public synchronized void playMusicA(int mtype) {
		for (int i = 0; i < 4; i++) {
			System.out.println("\t" + mtype + " 신나는음약...");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicB(int mtype) {

		// synchronized (this) {
		for (int i = 0; i < 4; i++) {
			System.out.println("\t" + mtype + " 슬픈음악...");
		}
		try {
			Thread.sleep((long) (Math.random() * 100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// }
	}

	public synchronized void playMusicC(int mtype) {
		for (int i = 0; i < 4; i++) {
			// synchronized (this) {
			System.out.println("\t" + mtype + " 카페음악...");
			// }
		}
		try {
			Thread.sleep((long) (Math.random() * 100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
