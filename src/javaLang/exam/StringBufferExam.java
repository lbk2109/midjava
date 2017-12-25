package javaLang.exam;

import java.util.Random;

public class StringBufferExam {
	public String randomName() {
		StringBuffer sb = new StringBuffer();
		String[] firstNames = { "Tod", "John", "Michael" };
		String[] lastNames = { "Smith", "Brown", "Davis" };

		// 0~3 사이의 임의의 숫자를 골라서
		int random1 = new Random().nextInt(3);
		// 랜덤하게 이름을 뽑는다.
		String firstName = firstNames[random1];

		// 0~3 사이의 임의의 숫자를 골라서
		int random2 = new Random().nextInt(3);
		// 랜덤하게 성을 뽑는다.
		String lastName = lastNames[random2];

		// sb에 이름(fistName) 공백(" ") 성(lastname) 순으로 append해 보세요.
		// 단 메소드 체이닝을 이용해야 합니다.
		return sb.append(firstName).append(" ").append(lastName).toString();
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// 메소드 체이닝 방식
		System.out.println(sb.append("111").append(" ").append("222").toString());

		StringBuilder sbd = new StringBuilder();

		System.out.println(sbd.append("aaa").append(",").append("bbb").toString());

		StringBuffer b2 = new StringBuffer();
		StringBuffer b3 = b2.append("hello");
		System.out.println(b2 == b3); // true

		StringBuilder bd2 = new StringBuilder();
		StringBuilder bd3 = bd2.append("hello");
		System.out.println(bd2 == bd3); // true
		
		//실습
		StringBufferExam ex = new StringBufferExam();
		System.out.println(ex.randomName());
      
        //성능관련 String 크래스사용 고려
		
        // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<100000;i++){
                str=str+"*";
        }
//        System.out.println(str);
        //종료시간을 기록합니다.(millisecond단위)
        long endTime1 = System.currentTimeMillis();

        // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)                
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<100000;i++){
                sb2.append("*");
        }
//        System.out.println(sb2.toString());
        //종료시간을 기록합니다.(millisecond단위)
        long endTime2 = System.currentTimeMillis();

        // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        
        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);		
		
	}
}
