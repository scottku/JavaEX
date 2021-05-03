package com.javaex.basics;
import java.util.Scanner; //java.util 패키지의 Scanner 클래스를 로드하는 기능
public class ConsoleEx {

	public static void main(String[] args) {
	
		//consoleOutput();
		consoleInput();
	}
	
	private static void consoleInput() {
		// Class를 불러올 때 ctrl + shift + o 로 확인
		// 필요한 클래스 들어있는 패키지를 정확히 지정할 것
		// 자동 완성 기능 활용 : ctrl + space
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		System.out.println("이름 : ");
		
		String name = scanner.next();
		
		System.out.println("나이를 입력해 주세요.\n나이 : ");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은 " + name + " 이고 나이는 " + age + " 세 입니다.");
		
		scanner.close();
	}
	private static void consoleOutput() {
		// print -> 출력 후 개행 안함
		// println -> 출력 후 개행
		// printf -> 형식화된 출력 -> TODO : 뒤쪽 String 항목에서 정리
		System.out.print("Hello ");
		System.out.println("Java");
		
		//이스케이프 문자 : 특수한 의미를 가진 문자
		
		System.out.println("Hello\nJava"); // \n -> 강제 개행
		System.out.println("Hello\tJava"); // \t -> 탭문자
		System.out.println("Hello, \"Java\"");
		// \ 자체를 표기하고자 할 때
		String dir = "C:\\Windows\\System"; // \\ -> \ 출력
		System.out.println(dir);
		
		System.err.println("표준 에러 출력!");
	}
}
