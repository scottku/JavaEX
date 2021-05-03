package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		//arithOperEx();
		//logicOper();
		bitOper();
	}
	
	//산술 연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		//부호 연산자: +, -
		System.out.println(-a);
		
		//사칙연산: +, - , * , /
		System.out.println(a + "/" + b + "=" + (a/b)); //정수 나눗셈의 몫
		System.out.println(a + "%" + b + "=" + (a%b)); //정수 나눗셈의 나머지
		//정수와 정수의 나눗셈은 정수
		
		//실제 나눗셈의 결과는?
		System.out.println((float)a / (float)b); //정수를 실수로 변환
		System.out.println((float)a / b); //하나만 바꿔줘도 알아서 바뀌어서 계산됨
		
		System.out.println("-------------------");
		
		//증감연산자 ++, --
		//위치에 따라 연산 순서가 다르다.
		a = 7;
		System.out.println("a : " + a);
		System.out.println("전위 증감 연산:" + (++a)); //출력 전 먼저 증가 발생
		System.out.println("최종 a : " + a);
		
		a = 7;
		System.out.println("a : " + a);
		System.out.println("후위 증감 연산:" + (a++)); //출력 이후 증가 발생
		System.out.println("최종 a" + a);
		
		//나눗셈 보충
		a = 7;
		// System.out.println(a / 0); -> 정수를 0으로 나누면 ArithmeticException
		System.out.println((float)a / 0); // Infinity
		//Infinity가 포함된 연산식은 항상 Infinity
		//Infinity check 필요
		System.out.println("7.0 / 0은 유한수인가? -> " +  Double.isFinite(7.0/0));
		System.out.println("0.0/0.0? -> " + (0.0/0.0)); //NAN -> Not A Number
		//NaN가 포함된 연산식은 항상 NaN
		//NaN check 필요
		System.out.println("0.0/0.0 is NaN? -> " + Double.isNaN(0.0/0.0));
		System.out.println(0.0/0.0+10);
	}
	
	//비교,논리 연산
	//결과로 boolean 반환, 논리값으로 프로그램의 흐름 제어
	private static void logicOper()	{
		//비교 연산자 >, >=, <, <=, ==, !=
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("n1이 n2와 같은가? -> " + (n1==n2));
		System.out.println("n1이 n2와 같지 않은가? -> " + (n1 != n2));
		
		//논리 연산 : And(&&), Or(||), Not(!)
		// -> 집합을 생각하면 된다
		
		int n3 = 5;
		boolean r1 = n3>0;
		boolean r2 = n3<10;
		boolean r1andr2 = r1&&r2;
		
		System.out.println(n3 + "가 0보다 크고 10보다 작은가? -> " + ((n3>0)&&(n3<10)));
		System.out.println(n3 + "가 0보다 크고 10보다 작은가? -> " + (r1&&r2));
		System.out.println(n3 + "가 0보다 크고 10보다 작은가? -> " + r1andr2);
		
		//n3는 0 이하이거나 10 이상의 값인가?
		System.out.println(n3 + "가 0 이하, 혹은 10 이상의 값인가? -> " + !r1andr2);
		
		r1 = n3<=0;
		r2 = n3>=10;
		boolean r1orr2 = r1 || r2;
		System.out.println(n3 + "가 0이하, 혹은 10 이상의 값인가? -> " + r1orr2);
		
		//not 논리 부정 -> true와 false 사이의 반전
		boolean rNot = !(n3 > 0 && n3 < 10);
		// -> n3 <= 0 or n3 >= 10 (여집합)
		System.out.println("위에서 3번째 것의 논리 부정: " + rNot);
	}
	
	//비트 연산자 -> 비트 단위로 미세한 조작 -> 하드웨어 제어, 이미지 프로세싱 시 주로 사용
	
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		int result = b1&b2; //둘다 1이어야 1로 출력
		System.out.println("b1&b2:" + Integer.toBinaryString(result));
		result = b1 | b2; //둘 중 하나만 1이어도 1로 출력
		System.out.println("b1|b2: " + Integer.toBinaryString(result));
		result = ~b1;
		System.out.println("~b1: " + Integer.toBinaryString(result)); //byte로 정의했지만 비트 연산을 수행할 때는 기본 단위인 int로 변환되어 수행된다. 따라서 00000000000000000000000000001101 -> 11111111111111111111111111110010
		
	}
}
