package javaDate.exam;

import java.util.Calendar;

/**
 * Date의 단정을 해력하고 등핮한 것이 Calendar클래스 .Calenar클래스 생성방법 - Calendar 클래스는 추상클래스이다. -
 * Candar클래스에 대한 인스턴스를 생성하려먼 Calendar가 가지고 있는 클래스 메소드 getInstance()를 사용해야한다. -
 * getInstance()메소드를 호출하면 내부적으로 java.util.GegorianCalendar인스터스를 마들어서 리턴한다. -
 * GregorianCalendar는 Calendar의 자식 클래스이다. .Calendar크래스를 이용해서 현재 날짜와 시간에 대한 정보를
 * 알아내는 방법 - Calendar는 현재 날짜와 시간에 대한 정보를 가진다. - Calendar가 가지고 있는 Get메소드에
 * Calendar의 상수를 어떤 것을 넣어주느냐에 따라서 다를 값이 나오게 됩니다. int yyyy = cal.(Calendar.YEAR);
 * int month - cal.get(Calendar.MONTH) + 1; // 월은 0부터 시작합니다. .Calendar클래스를 이용해서
 * 원하는 날짜나 시간에 대한 정보를 얻어오는 방법 - Cllendar가 가지고 있는 add메소드를 이용하면 쉽게 다음 날짜나 이전 날짜를
 * 구할 수 있습니다. - 현재 칼렌더에 시간을 5시간 더하는 방법. 5를 -5로 수저하면 5시간 전을 구할 수 있게 됩니다.
 * cal.add(Calendar.HOUR,5);
 * 
 * @author 명훈
 *
 */
public class CalendarExam {
	public static void main(String[] args) {
		System.out.println("Candar클래스에 대한 인스턴스를 생성하려먼 Calendar가 가지고 있는 클래스 메소드 getInstance()를 사용해야한다.");
		Calendar cal = Calendar.getInstance();
		System.out.println("현재Calendar정보출력");
		prtCalFields(cal);
		System.out.println();

		System.out.println("현재 날짜와 시간에 대한 정보를 변경하기");
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 0);
		cal.add(Calendar.DATE, -365);
		System.out.println("변경된Calendar정보출력");
		prtCalFields(cal);

	}

	/**
	 * Calendar크래스를 이용해서 현재 날짜와 시간에 대한 정보를 알아내기
	 * 
	 * @param cal
	 */
	public static void prtCalFields(Calendar cal) {
		System.out.println("yyyy :" + cal.get(Calendar.YEAR));
		System.out.println("month:" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("date :" + cal.get(Calendar.DATE));
		System.out.println("hour :" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("hour :" + cal.get(Calendar.HOUR));
		System.out.println("minute:" + cal.get(Calendar.MINUTE));
		System.out.println("second:" + cal.get(Calendar.SECOND));
	}
}
