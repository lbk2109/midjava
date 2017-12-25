package javaUtil.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author 명훈 List는 데이타의 중복이 있을 수 있고, 순서도 있다.
 */
public class ListExam {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		System.out.println(list.add("이병국"));
		System.out.println(list.add("강복희"));
		System.out.println(list.add("이병국"));

		System.out.println("List의 크기는 " + list.size() + " 이며, 중복을 허용합니다.");

		System.out.println("List의 인덱스를 이용하여 전체 데이타 가져오기.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		System.out.println("Iterator를 이용하여 전체 데이타 가져오기.");
		for (Iterator<String> e = list.iterator(); e.hasNext();) {
			String string = e.next();
			System.out.println(string);
		}
		System.out.println();

		System.out.println("foreach를 이용하여 전체 데이타 가져오기.");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();

		String[] ary1 = { "홍길동", "임꺽정", "장희빈" };
		String[] ary2 = { "송일국", "대한", "민국", "만세" };

		System.out.println("Generic종합 테스트");
		for (String string : addArray(ary1, ary2)) {
			System.out.printf("%s ", string);
		}
	}

	/**
	 * 두개의 매개변수로 String배열 2개를 받아 순서대로 list저장해서반환하는 함수로 Generic을 종합적으로 테스트하기위함.
	 * 
	 * @param ary1
	 * @param ary2
	 * @return retList
	 */
	public static List<String> addArray(String[] ary1, String[] ary2) {
		List<String> retList = new ArrayList<>();
		for (String a : ary1) {
			retList.add(a);
		}
		for (String a : ary2) {
			retList.add(a);
		}
		return retList;
	}
}
