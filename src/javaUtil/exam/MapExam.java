package javaUtil.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * MapExam
 * 
 * @author 명훈 Map은 key와 value를 쌍으로 저장하는 자료구조 키는 중복될 수 없고,값은 중복될 수 있다.
 */
public class MapExam {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		System.out.println(m.put(1, "대한"));
		System.out.println(m.put(2, "민국"));
		System.out.println(m.put(3, "만세"));
		System.out.println(m.put(1, "맹세")); // null 아닌 중복된 value를 return함."대한"

		System.out.println("Map의 크기 : " + m.size());
		System.out.println();

		System.out.println("Map 데이타를 가져오기 위해서는 먼저 key를 구하고 이를 이용해서 value를 가져온다");
		Set<Integer> keys = m.keySet();

		System.out.println("iterator를 사용하여 전체값을 가져오기");
		for (Iterator<Integer> e = keys.iterator(); e.hasNext();) {
			Integer key;
			key = e.next();
			String value = m.get(key);
			System.out.println("key:" + key + ",value:" + value);
		}
		System.out.println();

		System.out.println("foreach를 사용하여 전체값가져오기");
		for (Integer key : keys) {
			String value = m.get(key);
			System.out.println("key:" + key + ",value:" + value);
		}
		System.out.println();

		System.out.println("Map종합테스트");
		Map<String, Integer> mt = makeMap();
		Set<String> pkeys = mt.keySet();

		System.out.println("foreach를 사용하여 전체값가져오기");
		for (String key : pkeys) {
			Integer value = mt.get(key);
			System.out.println("key:" + key + ",value:" + value);
		}
		System.out.println();

	}

	/**
	 * Map종합테스트
	 * 
	 * @return Map<String, Integer>
	 */
	public static Map<String, Integer> makeMap() {
		Map<String, Integer> products = new HashMap<>();
		// 상품의 이름과 값을 products에 추가해 보세요.
		products.put("가위", 2500);
		products.put("크래파스", 5000);
		return products;
	}
}
