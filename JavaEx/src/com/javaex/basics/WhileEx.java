package com.javaex.basics;
import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		//whileEx();
		//whileEx2();
		//whileInfinity();
		//whileDo();
		forLoopEx();
	}
	private static void forLoopEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		
		int dan = scanner.nextInt();
		
		for(int num = 1 ; num <= 9 ; num++) {
			System.out.println(dan +" x "+ num +" = " + dan*num);
		}
		
		
		scanner.close();
	}
	
	private static void whileDo() {
		
		int num = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("숫자를 입력해 주세요. (0 입력 시 종료)");
			num = scanner.nextInt();
			total += num;
		} while(num != 0);
		
		System.out.println("지금까지의 합산 = " + total	);
		scanner.close();
	}
	
	private static void whileInfinity() {
		// 반복 조건을 개발자가 세팅 해주지 않으면 무한루프에 빠진다.
		while(true) {
			System.out.println("Ctrl + C to quit");
		}
	}
	
	
	private static void whileEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int dan = scanner.nextInt();
		int x=1;
		while (x<10) {
			System.out.println(dan+"x"+x+" = " + dan*x);
			x++;
		}
		
		scanner.close();
	}
	
	private static void whileEx() {
		int x = 1;
		int total = 0;
		
		while (x<=10) {
			total=total+x;
			x += 1; //x = x + 1;
		}
		System.out.println(total);
	}
}
