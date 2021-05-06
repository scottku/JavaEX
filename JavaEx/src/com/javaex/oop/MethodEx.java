package com.javaex.oop;

// 메서드 관련 예제 정리
public class MethodEx {
	public static void main(String[] args) {
		printMessage();
		System.out.println("Square : " + square(2));
		System.out.println("4 + 5 = " + getSum(4,5));
		printDivide(7,3);
		printDivide(7,0); // 0으로 나누면 에러!
		
		System.out.println(getSumArr(new double[] { 1,2,3,4,5,6,7,8,9,10}));
		
		System.out.println(getSum(1,2,3,4,5,6,7,8,9,10));
		
		printSum("합계: ", 1,2,3,4,5,6,7,8,9); // 첫번째는 고정 인수, 뒤쪽은 가변 인수
	}
	
	// 입력이 없고, 반환이 없는 메서드 -> void로 return type 막아줌.
	private static void printMessage() {
		System.out.println("Message");
	}
	
	// 입력이 있고, 반환이 있는 메서드
	// 매개변수는 메서드를 벗어나면 효력이 없다.
	private static double square(double num) {
		return num*num; // return type이 있다면 type을 잘 맞춰야 함
	}
	
	// 매개변수의 개수는 필요한 만큼 제한 없이 만들 수 있다.
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	// return을 만나면 메서드 실행을 중단하고 호출한 쪽으로 돌아간다.
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return; //return type이 void 이므로 값 지정해줄 필요가 없음.
		}
		System.out.printf("%d / %d = %d%n" , num1, num2, num1/num2);
	}
	
	// 매개변수로 배열을 전달 ->
	private static double getSumArr(double[] values) {
		// 전달받은 배열의 요소값을 합산 반환
		double total = 0;
		for(double value: values) {
			total += value;
		}
		
		return total;
	}
	
	// 가변 인수 : ... -> 배열로 변환되어 전달 -> 정해지지 않은 개수의 매개변수
	private static double getSum(double ... values) {
		/*double total = 0;
		
		for (double value : values) {
			total += value;
		}
		return total; */
		return getSumArr(values);
	}
	
	// 고정 인수, 가변 인수는 같이 쓸 수는 있음
	// 고정 인수 먼저 선언 후 가변 인수를 선언해야 하는 제약 조건 존재
	private static void printSum(String message, double ... values) {
		System.out.println(message + ", " + getSum(values));
	}

}
