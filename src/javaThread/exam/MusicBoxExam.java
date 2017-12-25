package javaThread.exam;

//쓰레드가 3개가 있다면 JVM은 시간을 잘게 쪼갠 후에 한번은 쓰레드1을, 한번은 쓰리드 2를, 한번은 쓰레드 3을 실행합니다.
//이것이 빠르게 일어나다 보니 쓰레드가 모두 동작하는 것처럼 보이는 것입니다.
//1.쓰레드는 실행가능상태인 Runnable과 실행상태인 Running상태로 나뉩니다.
//2.실행되는 쓰레드 안에서 Thread.sleep()이나 Object가 가지고 있는 wait()메소드가 호출되면 쓰레드가 블록상태가 된다.
//3.Thread.sleep()은 특정시간이 지나면 자신이 스스로 블록상태에서 빠져나와 Running상태나 Runable상태가 된다.
//4.Object가 가지고 있는 wait()메소드는 다른 쓰레드가 notify()나 notifyAll()메소드를 호출하기 전에는 블럭상태에서 해제되지 않는다.
//5.wait()메소드는 호출이 되면 모니터링 락을 놓게된다. 그래서 대기중인 다른 메소드가 실행된다.
//6.쓰레드의 run메소드가 종료되면,쓰레드는 종료된다. 즉 Dead상태가 된다.
//7.Thread의 yeild메가 호출되면, 해당 쓰레드는 다른 쓰레드에게 자원을 양보하게 된다.
//8.Thread가 가지고 있는 join메소드를 호출하게 되면 해당 쓰레드가 종료될 때까지 기다리게 된다.
public class MusicBoxExam {

	public static void main(String[] args) {

		MusicBox mBox = new MusicBox();

		MusicPlayer mPlayer1 = new MusicPlayer(1, mBox);
		MusicPlayer mPlayer2 = new MusicPlayer(2, mBox);
		MusicPlayer mPlayer3 = new MusicPlayer(3, mBox);

		Thread mpThread1 = new Thread(mPlayer1);
		Thread mpThread2 = new Thread(mPlayer2);
		Thread mpThread3 = new Thread(mPlayer3);

		System.out.println("음악1시작..");
		mpThread1.start();		
		System.out.println("음악2시작..");
		mpThread2.start();
		System.out.println("음악3시작..");
		mpThread3.start();
		
		try {
			// 해당 쓰레드가 멈출때까지 멈춤
			mpThread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("음악1종료");
		
	}
}
