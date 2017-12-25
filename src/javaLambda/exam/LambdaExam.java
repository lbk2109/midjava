package javaLambda.exam;

//람다식은 다른말로 익명 메소드라고도 한다.
//1.인터페이스 중에서 메소드 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.
//  쓰레드를 만들때 사용하는 Runnable인터페이스의 경우 run()메소드를 하나만 가지고 있다.
//2.Runnable을 이용하여 쓰레드를 만드는 방법
//  쓰레드를 실행하면 쓰레드 생성자 안에 넣은 Run()메소드가 실행된다.
//  자바는 메쏘드만 매개변수로 전달받는 방법이 없다. 인스턴스만 전달 할 수 있다.
//  그렇기 때문에 run()메소드를 가지고 있는 Runnable객체를 만들어서 전달한다.
//3.메소드만 전달할 수 있다면, 좀더 편리하게 프로그래밍할 수 있을텐데, 
//  자바는 메소드만 전달할 수 있는 방법은 없었기 때문에 매번 객체를 생성해서 매개변수로 전달해야 했다. 
//  이런부분을 해결한 것이 람다식표현식이다.
//------------
//•()->{ ..... } 부분이 람다식, 다른말로 익명 메소드 
//•JVM은 Thread생성자를 보고 ()->{} 이 무엇인지 대상을 추론한다. 
//•Thread생성자 api를 보면 Runnable인터페이스를 받아들이는 것을 알 수 있다. 
//•JVM은 Thread생성자가 Runnable인터페이스를 구현한 것이 와야 하는 것을 알게 되고 
// 람다식을 Runnable을 구현하는 객체로 자동으로 만들어서 매개변수로 넣어준디

public class LambdaExam {
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
						System.out.println("hello1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		new Thread(() -> {
			{
				for (int i = 0; i < 10; i++) {
						System.out.println("hello2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();


	}
}
