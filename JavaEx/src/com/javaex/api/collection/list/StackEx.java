package com.javaex.api.collection.list;

import java.util.Stack;

// Stack 자료형 : 입력과 출력이 한쪽 방향에서만 이루어짐
//			중간에 삽입, 삭제 불가
public class StackEx {

	public static void main(String[] args) {
		// Stack 선언
		Stack<Integer> stack = new Stack<>();
		
		// 10개 데이터 입력
		for (int i = 1; i<=10 ; i++) {
			// 스택에 데이터 입력 : push
			stack.push(i);
			System.out.println("Push : " + stack);
		}
		
		// 가장 위의 데이터 확인 : peek
		System.out.println("Peek : " + stack.peek());
		System.out.println(stack); // peek는 데이터 삭제 x
		
		// 데이터의 인출 : pop -> 객체를 추출 후 값 삭제
		System.out.println("Pop : " + stack.pop());
		System.out.println(stack);
		
		// stack이 비어있다면 pop 시 EmptyStackException 에러 발생
		while(!stack.empty()) { // 스택이 비어있지 않으면 실행
			System.out.println("Pop : " + stack.pop());
			System.out.println(stack);
		}
	}

}
