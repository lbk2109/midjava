package javaUtil.exam;

/**
 * 
 * @author 명훈
 * BoxExam프로그램과 비교해볼껏!
 */
public class GenericExam {

	public static void main(String[] args) {
		
		Generic<Object> g1 = new Generic<>();
		g1.setObj(new Object());
		System.out.println(g1.getObj().getClass().getSimpleName()+" : "+g1.getObj());

		Generic<String> g2 = new Generic<>();
		g2.setObj("hello");
		System.out.println(g2.getObj().getClass().getSimpleName()+" : "+g2.getObj());
		
		Generic<Integer> g3 = new Generic<>();
		g3.setObj(1234);
		System.out.println(g3.getObj().getClass().getSimpleName()+" : "+g3.getObj());

		Generic<Long>   g4 = new Generic<>();
		g4.setObj(123L);
		System.out.println(g4.getObj().getClass().getSimpleName()+" : "+g4.getObj());
		
		
	}
}
