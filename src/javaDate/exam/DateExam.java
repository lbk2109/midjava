package javaDate.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 날짜와 시간을 구하기 위한 클래스 Date 틀래스
 * 
 * @author 명훈 Date는 지역화에 대한 부분이 고려되지 않았다. 기본생성자료 Date인스턴스를 만들게 되면 현재 시간과 날짜 정보를
 *         Date인스튼스가 가지게 된다. toString()메소드를 이용하여 현재 시간을 문자열로 구한다.
 *         Jvautil.SimpleDatgeFormat클래스를 이용하여 원하는 형대로 출력하는 방법 .yyyy는 년, MM은 월,
 *         dd는 일을 표현한다. .hh는 시간,mm은 분,ss는 초를 표현하며 a는 오전/오후를 표현하다. .zzz는
 *         TimeZone를 나타낸다. 한국의 경우 한국표준시 KST가 TimeZone에 해당하는 값입니다. 현재 시간을 Long값으로
 *         구하는 방법
 */
public class DateExam {
	public static void main(String[] args) {

		//
		System.out.println("Date를 형변환 없이 String으로 출력");
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println();

		//
		System.out.println("Date형의 date를 String(yyyy년M월d일)으로 변환하여출력");
		String sDate = dateToStr(date);
		System.out.println(sDate);
		System.out.println();

		//
		System.out.println("String(yyyy년M월d일)의 date를 Date형으로 변환하여 출력");
		Date dDate;
		dDate = strToDate(sDate);
		System.out.println(dDate.toString());
	}

	public static String dateToStr(Date date) {
		String sdate = new SimpleDateFormat("yyyy년M월d일").format(date);
		return sdate;
	}

	public static Date strToDate(String sDate) {
		Date ddate = null;
		try {
			ddate = new SimpleDateFormat("yyyy년M월d일").parse(sDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ddate;
	}
}
