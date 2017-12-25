package javaUtil.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author 이병국 set은 중복이 없고, 순서도 업슨 자료구조 Hashset과 TreeSet이 있음.
 */
public class SetExam {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
	
		System.out.println(set.add("이병국"));
		System.out.println(set.add("강복희"));
		System.out.println(set.add("이병국")); //dup -> false

		System.out.println("Set의 크기 : " + set.size());
		
		System.out.println("iterator를 사용하여 전체값을 가져오기");	    
	    for (Iterator<String> e = set.iterator(); e.hasNext();) {
			String string = e.next();
			System.out.println(string);
		}
        System.out.println();
        
	    System.out.println("foreach를 사용하여 전체값가져오기");
	    for (String string : set) {
			System.out.println(string);
		}

        System.out.println();
        
	    System.out.println("Set은 중복을 허용하지 안음");
	    
	    
 	}
}
