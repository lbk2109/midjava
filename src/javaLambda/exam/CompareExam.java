package javaLambda.exam;

//람다식 기본문법: (매개변수목록)->{실행문}
//1.2개의 값을 비교하여 어떤 값이 더큰지 구하는 CompareTo()라는 메소드를 가지고 있는 Compare인터페이스 생성
//  2개의 정수값을 받아들인후, 정수를 반환하는 메소드를 선언
//2.Compare인터페이스를 이용하는 클래스
//  Compare인터페이스를 받아들인후, 해당 인터페이스를 이용하는 exe메소드
//  CompareTo메소드가 어떻게 구현되어 있는냐에 따라서 출력되는 값이 다름.
//3.자바는 메소드만 인자로 전달하려면 반드시 객체를 만들어서 전달해야 했다.
//  Java8에 람다식이 생기면서, 마치 함수만 전달하는 것처럼 간편하게 문법을 사용할수 있게 된다.

public class CompareExam {

	public int exec(Compare compare) {
		int k = 10;
		int m = 20;
		int value = compare.CompareTo(k, m);
		return value;
	}

	public static void main(String[] args) {
		
	   int value = 0;
	   CompareExam compareExam = new CompareExam();
	   
       // 
	   value = compareExam.exec(new Compare() {
			@Override
			public int CompareTo(int value1, int value2) {
				return value1 - value2;
			}
		});
	    System.out.println(value);
	    
        // 람다식으로..
	   value = compareExam.exec((i, j) -> {
			return i * j;
		});
	   System.out.println(value);
	}

}
