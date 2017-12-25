package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Byte단위 입추력 클래스는 클래스의 이름이 InpoutStream이나 OutputStream으로 끝납니다.
// -파일로 부터 512byte씩 읽어들여 파일에 512byte끽 저장하는 프로그램을 작성

public class ByteExam2 {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		String iname = "src/javaIO/exam/ByteExam2.java";
		String oname = "src/javaIO/exam/byte.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(iname);
			fos = new FileOutputStream(oname);
			byte[] readData = new byte[512];
			int readCount = -1;
			while ((readCount = fis.read(readData)) != -1)
				fos.write(readData, 0, readCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.printf(iname + "을\n" + oname + "로 정상적으로 복사 하였습니다.\n");

		long endTime = System.currentTimeMillis();
		System.out.println("소요시간:" + (endTime - startTime) + " millis");
	}
}
