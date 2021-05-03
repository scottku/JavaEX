package com.javaex.basics;

public class Types {
	public static void main (String[] args) {
		//integerTypes();
		//floatTypes();
		//booleanEX();
		//charEX();
		//constantEX();
		//implicitCasting();
		explicitCasting();
	}
	private static void constantEX() {
		final float PI = 3.141592f;
		final int SPEED_LIMIT = 110;
		/* 변경되면 안되는 값 보호
		   코드 가독성 높아짐
		 */
		
		System.out.println("PI = " + PI);
		System.out.println("SPPED_LIMIT = " + SPEED_LIMIT);
		
		int speed = 105;
		
		boolean overspeed = speed > SPEED_LIMIT;
		System.out.println(overspeed);
		
		// SPEED_LIMIT = 80; // SPEED_LIMIT은 상수이므로 값 변경 불가
		overspeed = speed > SPEED_LIMIT;
		System.out.println(overspeed);
		// 내부에서 고의로든 실수로든 값이 변경되면 안되는 값은 상수로 표시해야 함
	}
	private static void charEX() {
		char ch1 = '구';
		char ch2 = 'B';
		System.out.println(ch1);
		System.out.println(ch1 + ch2);
		
		String str = "Java";
		System.out.println(str + str);
	}
	private static void booleanEX() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 -> " + b1);
		System.out.println("b2 -> " + b2);
		
		int var1 = 8;
		int var2 = 5;
		
		boolean result = var1 > var2;
		System.out.println("8 > 5 ? =" + result);
	}
	
	private static void floatTypes() {
		float floatVar = 3.12345f;
		double doubleVar = 3.12345;
		
		System.out.println("floatVar: " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
		
		// 지수 표기법 m*10의 n승
		int intVar = 3000000;
		floatVar = 3E6f;	// 3.0*10^6
		doubleVar = 3E-6;	// 3.0*10^-6
		
		// 주의 : float, double -> 정밀도를 포기, 표현 범위를 넓힘 -> 오차 존재
		System.out.println(0.1 * 3); 
	}
	private static void integerTypes() {
		//선언
		int intVar1;
		int intVar2;
		//초기화
		intVar1 = 2021;
		// intVar2 = 12345678901234; -> 범위 초과
		
		System.out.println(intVar1);
		long longVar1;
		long longVar2;
		
		longVar1 = 2021;
		longVar2 = 12345678901234L; //int가 정수의 기본형이라 L을 붙혀서 long형 임을 알려줌
		
		System.out.println("longVar1: " + longVar1);
		System.out.println("longVar2: " + longVar2);
		
		//2진수, 8진수, 16진수 형태로 입력 가능
		int bin = 0b1101; 	// 0b -> 2진수
		int oct = 072; 		// 0 -> 8진수
		int hex = 0xF00;		// 0x -> 16진수
		
		System.out.println("0b1101 -> " + bin);
		System.out.println("072 -> " + oct);
		System.out.println("0xFF -> " + hex);
	}
	//암묵적 형 변환
	//표현의 범위가 좁은 -> 범위가 넓은, 자료 유실 x, 자동으로 변환 가능
	private static void implicitCasting() {
		byte b = 10; //1바이트 정수형
		System.out.println("byte = " + b);
		int i = b; //4바이트 정수형
		System.out.println("int = " + i);
		long l = i; //8바이트 정수형
		System.out.println("long = " + l);
		
		float f = l; //byte는 long보다 작아도 표현 범위가 넓어 괜찮음.
		System.out.println("long -> float:" + f);
		double d = f; //8바이트 실수형
		System.out.println("float -> double:" + d);
	}
	//명시적 형 변환 -> 표현 범위가 넓은 자료형에서 좁은 자료형으로
	//자료 유실 가능성 농후
	private static void explicitCasting() {
		byte b;
		int i=2021;
		float f =123.456f;
		
		System.out.println(Integer.toBinaryString(i));
		
		b = (byte)i; //강제 casting 필요
		
		System.out.println("int " + i + " -> byte " + b);
		
		i = (int)f;
		System.out.println("float " + f + " -> int" + i);
	}
}
