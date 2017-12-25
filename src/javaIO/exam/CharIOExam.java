package javaIO.exam;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//char단위 입출력 클래스는 클래스 이름이 Readr나 Writer로 끝이 납니다.
//	1)char당위 입출력 클래스를 이용해서 키보드로 부터 한줄 입력 받아서 콘솔에 출력
//	System.in - 키보드를 의미(InputStream)
//	BufferedReader - 한줄씩 입력 밪기위한 클래스
//	BufferedReader 클래스의 생성자는 InmputStram을 입력밪는 생성자자 없다.
//	System.in은 InputStream 타입이므로 BufferedReader의 생성자에 바로 들어갈 수 없으므로 InputStreamReader 클래스를 이용해야함.

//  2)파일에서 한 줄씩 입력 받아서 파일에 출력 
//    파일에서 읽기위해서 FileReader 클래스 이용
//	     한 줄 읽어 들이기 위해서 BufferedReader 클래스 이용 
//      BufferedReader 클래스가 가지고 있는 readLine() 메소드가 한줄씩 읽게 해준다. 
//	 	readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 null을 리턴한다. 
//    파일에 쓰게하기 위해서 FileWriter 클래스 이용 
//    편리하게 출력하기 위해서 PrintWriter 클래스 이용 

public class CharIOExam {
	public static void main(String[] args) {

		// 1)
		System.out.println("char당위 입출력 클래스를 이용해서 키보드로 부터 한줄 입력 받아서 콘솔에 출력");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String line = br.readLine();
			System.out.println(line);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2)
		System.out.println("파일에서 한 줄씩 입력 받아서 파일에 출력 ");
		try (BufferedReader br = new BufferedReader(new FileReader("src/javaIO/exam/CharIOExam.java"));
				PrintWriter pw = new PrintWriter(new FileWriter("byte.txt"));) {
			String line = null;
			while((line = br.readLine()) != null)
				pw.println(line);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
