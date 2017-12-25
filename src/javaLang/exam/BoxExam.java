package javaLang.exam;
/**
 * 
 * @author 명훈
 * GenericExam프로그램과 비교해볼껏!
 */
public class BoxExam {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setObj(new Object());
		Object obj = box.getObj();  // object형을 반환하므로 unboxing 필요없음
		System.out.println(obj);
		
		box.setObj("스트링");
		String str= (String)box.getObj(); // unboxsing
		System.out.println(str);
		
		box.setObj(123);
		int value = (int)box.getObj();   // unboxing 
		System.out.println(value);
		
	}

}
