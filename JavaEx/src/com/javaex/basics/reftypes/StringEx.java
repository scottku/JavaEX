package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringBasic();
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