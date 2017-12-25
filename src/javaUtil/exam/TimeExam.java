package javaUtil.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Java에서 제공하는 Date, Time API는 부족한 기능 지원을 포함한 여러가지 문제점을 가지고 있었다. 어런 문제점들을 해결하고 더
 * 좋은 직관적인 API들을 제공하기 위해 새롭게 재 디자인한 Date, Time API를 Java SE8부터 제공한다.
 */
public class TimeExam {

	/**
	 * 
	 * 새로운 API의 핵심 클래스는 오브젝트를 생성하기 위해 다양한 factory메서드를 사용한다. 오브젝트 자기 자신의 특정 요소를
	 * 가지고 오브젝크를 생성할 경우 of 메서드를 호출하면 되고, 다른 타입으로 변경할 경우에는 from 메서드를 호출하면 된다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("LocalDateTime 클래스를 이용해서 현재 시간 time객체 만드는 방법");
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		System.out.println();

		// 원하는 시간으로 time객체 생성하는 방법
		System.out.println("2012년 12월 12일의 시간에 대한 정보를 가지는 LocalDate객체를 만들기");
		// LocalDate ld = LocalDate.of(2012, 12, 12);
		LocalDate ld = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld);

		System.out.println("17시 18분에 대한 LocalTime객체 만들기.");

		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);

		System.out.println("10시 15분 30초라는 문자열에 대한 LocalTime객체를 구한다");
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		System.out.println();

		// 현재와 날짜와 시간정보를 getter메소들 이용하여 구하는 방법
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		LocalTime theTime = timePoint.toLocalTime();
		System.out.println(theTime);

		int year = timePoint.getYear();
		Month month = timePoint.getMonth();
		int day = timePoint.getDayOfMonth();
		int hour = timePoint.getHour();
		int minute = timePoint.getMinute();
		int second = timePoint.getSecond();
		// 달을 숫자로 출력한다 1월도 1부터 시작하는 것을 알 수 있습니다.
		System.out.println(year + "/" + month.getValue() + "/" + day + " " + hour + ":" + minute + ":" + second);

	}
}
