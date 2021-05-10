package com.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		dateEx();
		calendarEx();
	}
	
	private static void dateEx() {
		// 날짜 얻어오기
		Date now = new Date();
		
		System.out.println(now);
		
		// 형식화 출력 : DateFormat 객체
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + df.format(now));
		
		// SimpleDateFormat -> 포맷 문자열을 이용해 자유롭게 날짜를 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF: " + sdf.format(now));
	}
	
	private static void calendarEx() {
		// 캘린더 불러오기
		Calendar now = Calendar.getInstance();
		System.out.println("현재 날짜 : " + now);
		Calendar custom = Calendar.getInstance();
		custom.set(1999,11,31); // 1999년 12월 31일, 월 정보는 0부터 시작하므로 -1 값을 입력
		
		// 정보 받아오기 --> .get(캘린더 상수)
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n", now.get(Calendar.YEAR), now.get(Calendar.MONTH)+1, now.get(Calendar.DATE)); // 월 정보는 0부터! ★
		
		Calendar future = Calendar.getInstance(); // 현재 날짜
		// 100일 뒤로 이동
		future.add(Calendar.DATE, 100);
		System.out.printf("100일 후의 future: %d년 %d월 %d일%n", future.get(Calendar.YEAR),future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));
		// 이 날의 요일은?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100일 후의 요일 : " + dow);
		
		String dowStr = "?";
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
		dowStr = "월요일";
		break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		} //Sunday = 1 ~ Saturday = 7
		
		System.out.println(dowStr);
	}
}
