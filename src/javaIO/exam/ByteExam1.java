package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝납니다.
//•파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성 
//  -파일로 부터 읽어오기 위한 객체 - FileInputStream 
//  -파일에 쓸수 있게 해주는 객체 - FileOutputStream .
//•read()메소드가 ◦byte를 리턴한다면 끝을 나타내는 값을 표현할 수가 없기 때문에, byte가 아닌 int를 리턴한다.
//  -음수의 경우 맨 좌측 비트가 1이 된다. 
//  -읽어들일 것이 있다면 항상 양수를 리턴한다고볼 수 있다.
//•FileInputStream과 FileOutputStream을 이용하여, 1바이트씩 읽어들여 1바이트씩 저장 
//  -read()메소드가 리턴하는 타입은 정수인데, 정수 4바이트중 마지막 바이트에 읽어들인 1바이트를 저장한다.
//  -read()메소드는 더이상 읽어들일 것이 없을때 -1을 리턴한다. 

public class ByteExam1 {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		String iname = "D:\\PROJ\\workspace\\midjava\\src\\javaIO\\exam\\ByteExam1.java";
		String oname = "D:\\PROJ\\workspace\\midjava\\src\\javaIO\\exam\\byte.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(oname);
			fis = new FileInputStream(iname);
			int readData = -1;
			while ((readData = fis.read()) != -1)
				fos.write(readData);
		} catch (IOException e) {
			System.out.println("화일 처리(읽기/쓰기)시 오류가 발생하였습니다.");
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println("화일 닫기에 실패 하였습니다.");
				e.printStackTrace();
			}
		}
		System.out.printf(iname + "을\n" + oname + "로 정상적으로 복사 하였습니다.\n");
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간:"+(endTime-startTime)+" millis"); 
	}
}