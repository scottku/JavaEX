package com.javaex.exception;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionEx {

	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//nullPointerExceptionEx();
		//arrayExceptionEx();
		throwExceptEx();
	}
	
	private static void arithmeticExceptionEx() {
		// 스캐너로부터 정수를 입력받아 100을 입력받은 수로 나누기
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		// 예외가 있다 : try -> catch -> finally
		// 예외가 없다 : try -> finally
		// catch 블럭 순서 : 구체적인 예외 -> 마지막은 Exception으로 막는다
		try {
			// 예외 발생 가능 영역
			num = scanner.nextInt();
			result = 100/num;
		} catch (ArithmeticException e) {
			// 0으로 나눴을 때의 처리
			System.err.println("0으로는 나눌 수 없어요.");
			System.err.println("에러메시지: " + e.getMessage()); // Message = 'by zero'
		} catch (InputMismatchException e) {
			System.err.println("정수를 입력해 주세요!");
		} catch (Exception e) { // 모든 예외 처리 클래스의 부모
			e.printStackTrace(); // 에러 전체 메시지 출력
		} finally {
			System.out.println("예외 처리 종료");
		}
		
		System.out.println("값 : " + result);
		scanner.close();
		
	}
	
	private static void nullPointerExceptionEx() {
		String str = new String("Hello");
		str = null;
		
		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.err.println("널입니다.");
		}
		System.out.println("END OF CODE");
		
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error : " + e.getMessage());
			e.printStackTrace(); // 전체 에러 정보 출력
		} 
		System.out.println("END OF CODE");
		
	}
	
	private static void throwExceptEx() {
		ThrowExcept te = new ThrowExcept();
		try {
			
			te.divide(100, 0);
			te.executeRuntimeException();
			te.executeException(); // IOException => checked -> 반드시 예외 처리 필요
	
		} catch (CustomArithmeticException e) { 
			System.err.println("사용자 정의 예외:" + e.getMessage());
			// 상황 정보 확인
			System.err.println("num1: " + e.getNum1());
			System.err.println("num2: " + e.getNum2()); // 구체적인 사용자 정의 예외 ★
		} catch (IOException e) {
			System.err.println("예외 메시지 : " + e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("런타임 예외: " + e.getMessage());
		}
		
		System.out.println("End of Code");
	}
}
