package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		
		//stringBasic();
		stringFormatEx();
	}
	private static void stringFormatEx()	{
		//형식화된 문자열
		// %s(문자열), %d(정수), %f(실수), %n(줄 띄우기), %%(%)
		// ~개의 ~ 중에서 ~개를 먹었다. -> 문자열 생성
		String food = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + food + " 중에서 " + eat + "개를 먹었다."); //-> 너무 쓰기 불편
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n",total,food,eat);
		
		// %d, %f 등의 포맷 문자에는 부가 정보를 담을 수 있다.
		float rate = 1.234f;
		// 현재 이자율은 ~% 입니다.
		
		System.out.printf("현재 이자율은 %f%% 입니다.%n",rate);
		System.out.printf("현재 이자율은 %.2f%% 입니다.%n", rate); //소수점 둘째 자리 까지만 표시 가능.
		
		//포맷 형식은 String.format 메서드를 이용, 문자열 생성 시 활용 가능
		String fmt = "%d개의 %s 중에서 %d개를 먹었다.%n"; // 포멧을 미리 만들어 둔 후,
		String result = String.format(fmt, 5, "바나나", 2); // 데이터를 연결하여 필요한 문자 생성 가능 ★
		System.out.println(result);
		
	}
	
	
	private static void stringBasic() {
		// 문자열 선언
		String str; // 선언 = null
		str = "Java"; //할당 -> Literal (코드에 직접 입력, 기존에 존재하는 String pool 메모리 객체에 저장)
		String str2 = "Java";
		
		String str3 = new String("Java"); // 'String'이라는 새로운 객체 생성
		
		//참조 변수는 객체의 주소를 가지고 있음
		//참조 변수의 ==, !=는 주소를 비교하는 것
		
		System.out.println("str == str2 ? : " + (str==str2));
		
		System.out.println("str == str3 ? : " + (str3==str));
		
		//참조 변수의 값 자체가 같은지 비교
		
		System.out.println("str과 str2의 값이 같은가? : " + str.equals(str2));
		System.out.println("str과 str3의 값이 같은가? : " + str.equals(str3));
	}
}


//Scanner sc = new Scanner(System.in);