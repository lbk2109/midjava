package javaIO.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// try-with-resouce 블럭선언
//	-java io개체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 하지만,
//  -close메소드를 사용자가 호춣라지 않더라도, Exception이 발생하지 않았다면 자동으로 close()가 되게 할 수 이는 방법이다.
// 다양한 타입으로 저장할수 있는 DataInputStream
//		writeIint() - 정수값으로 저장
//		writeBoolean() - boolean값으로 저장
//      wrieteDouble() - double값으로 저장
public class ByteExam3 {
	public static void main(String[] args) {

		System.out.println("DataInputStream/DataOutputStream을 이용하여 화일복사하기");
		// try의 뒤에나오는 괄호()사이에서 만든 stream은 별도로 close하지 않아도 됩니다.
		try (DataInputStream dis = new DataInputStream(new FileInputStream("src/javaIO/exam/ByteExam3.java"));
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/javaIO/exam/byte.txt"));) {
			byte[] readBuffer = new byte[512];
			int readCount = -1;
			while ((readCount = dis.read(readBuffer)) != -1) {
				dos.write(readBuffer, 0, readCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		System.out.println("DataOutputStream을 이용하여 다양한 데이타 쓰기");
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/javaIO/exam/byte3.txt"));) {
			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeDouble(50.5);

		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		System.out.println("DataInputStream을 이용하여 다양한 데이타 읽기");
		try (DataInputStream ios = new DataInputStream(new FileInputStream("src/javaIO/exam/byte3.txt"));) {
			int i = ios.readInt();
			boolean b = ios.readBoolean();
			double d = ios.readDouble();
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
