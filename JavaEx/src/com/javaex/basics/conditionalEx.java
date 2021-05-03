package com.javaex.basics;

import java.util.Scanner;

public class conditionalEx {

	public static void main(String[] args) {
		
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		switchEx3();
	}
	
	private static void switchEx3() {
		// 코드 값을 문자열로 전달하는 경우, 오타 발생 가능성, 원하지 않는 입력이 넘어오는 경우 존재
		// 코드의 집합을 별도로 선언하여 입력값을 제한해 주는 것이 좋다.
		// TODO: enum 열거형으로 재작성 예정
		String day = "MONDAY";
		String act = "";
		
		switch (day) {
		case "MONDAY" :
		case "TUESDAY" :
		case "WEDNESDAY" :
		case "THURSDAY" :
			act = "열공";
			break;
		case "FRIDAY" :
			act = "불금";
			break;
		case "SATURDAY" :
			act = "주말";
			break;
		case "SUNDAY" :
			act = "휴식";
			break;
		default :
			act = "?";	
		}
		
		System.out.println(day + "에는 " + act);
	}
	
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("일 수를 확인 할 달을 입력하세요(숫자)");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월의 일 수는 31일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월의 일 수는 30일 입니다.");
			break;
		default :
			System.out.println(month + "월의 일 수는 28일 입니다.");
		}
		
		/*switch (month) {
		case 2 :
			System.out.println(month + "월의 일 수는 28일 입니다.");
			break;
			
		default :
			if (month <= 7) {
				if (month%2 == 1) {
					System.out.println(month + "월의 일 수는 31일 입니다.");
				} else {
					System.out.println(month + "월의 일 수는 30일 입니다.");
				}
			} else {
				if (month%2 == 1) {
					System.out.println(month + "월의 일 수는 30일 입니다.");
				} else {
					System.out.println(month + "월의 일 수는 31일 입니다.");
				}
			}
		}
		*/
		scanner.close();
		
	}
	
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 번호를 입력하세요.\n 1. Java   2. C   3. C++   4. Python");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1: //subject == 1
			System.out.println("R101호 입니다.");
			break;
		case 2: //subject == 2
			System.out.println("R202호 입니다.");
			break;
		case 3:
			System.out.println("R303호 입니다.");
			break;
		case 4:
			System.out.println("R404호 입니다.");
			break;
		default: //else
			System.out.println("관리자에게 문의 부탁드립니다.");
		}
		
		scanner.close();
	}
	
	
	private static void ifElseEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 번호를 입력하세요.\n 1. Java   2. C   3. C++   4. Python");
		int num = scanner.nextInt();
		if (num == 1)	{
			System.out.println("R101호 입니다.");
		} else if (num == 2) {
			System.out.println("R202호 입니다.");
		} else if (num == 3) {
			System.out.println("R303호 입니다.");
		} else if (num == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의해 주세요.");
		}
		
		scanner.close();
	}
	
	private static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int num = scanner.nextInt();
		if (num > 0) {
			if (num%2 == 0) {
				System.out.println("양수이며 짝수입니다.");
			} else {
				System.out.println("양수이며 홀수입니다.");
			}
		} else if (num < 0) { 
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		scanner.close();
	}
	
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요. : ");
		int num = scanner.nextInt();
		
		/*if (num > 0) { //조건 1
			System.out.println(num + "은(는) 양수입니다.");
		} else if (num < 0) { //조건 2
			System.out.println(num + "은(는) 음수입니다.");
		} else { //조건 3
			System.out.println(num + "은 0 입니다.");
		}
		*/
		
		// 중첩 if
		if (num == 0) {
			System.out.println("0 입니다만?");
		}	else {	// 0이 아닌 값이라면?
			if (num>0) {
				System.out.println("양수네요~");
			}
			else {
				System.out.println("음수네요~");
			}
		}
		
		scanner.close(); //다 쓰고 꼭 close 할 것.
}
}