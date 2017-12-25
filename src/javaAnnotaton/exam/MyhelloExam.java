package javaAnnotaton.exam;

import java.lang.reflect.Method;

public class MyhelloExam {
	public static void main(String[] args) {
		Myhello hello = new Myhello();
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if (method.isAnnotationPresent(Count100.class)) {
				System.out.println(method);
				for (int i = 0; i < 100; i++)
					System.out.println(i + ":" + hello.hello());
			} else {
				System.out.println(hello.hello());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
