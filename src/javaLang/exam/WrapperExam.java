package javaLang.exam;

public class WrapperExam {
	public static void main(String[] args) {
		
		//
		int i = 5;
		
		Integer i2 = new Integer(5);
		Integer i3 = 5; //auto boxing : 참조형으로...
		Integer i4 = new Integer(5);
		
		System.out.println(i==i2);		
		System.out.println(i==i2.intValue());
		
		System.out.println(i2.intValue() == i3);
		System.out.println(i2 == i3.intValue());
		
		System.out.println(i3 == i4.intValue());
		
		int i5 = i4; // auto unboxing :기본형으로...
		System.out.println(i5 == i4);

		Integer i6 = i; // auto boxing :참조형으로...
        System.out.println(i6.intValue() == i);		
        
        //
        long l = 100L;
        //auto boxing :참조형으로...
        Long l1 = 100L;
        System.out.println(l1 ==l);
        l1 = l;
        System.out.println(l1 ==l);      
        System.out.println(l1.longValue() == l);
        
        //auto unboxing:기본형으로... 
        Long l2 = new Long(100);
        long l3 = l2;
        
        System.out.println(l2 == l3);
        System.out.println(l2.longValue() == l3);
		
	}
}
