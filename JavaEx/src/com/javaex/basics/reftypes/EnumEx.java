package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		//enumBasic();
		enumEx();
	}
	private static void enumEx() {
		// conditionalEx.switchEx() -> enum 버전으로 만들어보기
		
		Week today = Week.TUESDAY;
		String act = "";
		
		switch (today) { //열거 상수로 들어가 있으므로 내부 내용도 전부 열거 상수로 바꿔줄 것
		case MONDAY :
		case TUESDAY :
		case WEDNESDAY :
		case THURSDAY :
			act = "열공";
			break;
		case FRIDAY :
			act = "불금";
			break;
		case SATURDAY :
			act = "주말";
			break;
		case SUNDAY :
			act = "휴식";
			break;
		default :
			act = "?";	
		}
		System.out.printf("%s에는 %s%n", today.name(), act);
	}
	
	
	private static void enumBasic()	{
		// enum의 메서드들 SUNDAY~SATURDAY
		Week today = Week.TUESDAY;
		
		System.out.printf("Today is %s(%d)%n.", today.name(), today.ordinal()); 
		//today에 들어가있는 메서드의 이름, today에 들어가있는 메서드의 순번
		// Week에서 enum(배열) 내부에 넣어둔 Tuesday와 연결됨. 0번~6번 중 2번인 Tuesday.
		
		String dayStr = "FRIDAY";
		Week other = Week.valueOf(dayStr); // 문자열 -> 열거상수로 변환
		
		System.out.printf("Other is %s(%d).%n",
							other.name(),
							other.ordinal());
		
		// 순번 비교
		int diff = today.compareTo(other);
		System.out.println("today와 other의 순번 차이 : " + diff); // - 의미는 앞이라는 뜻
	}

}
