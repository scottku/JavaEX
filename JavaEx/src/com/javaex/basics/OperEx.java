package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		arithOperEx();
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
}
