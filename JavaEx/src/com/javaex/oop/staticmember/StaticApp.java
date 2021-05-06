package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		// 호출 순서 : static 블록 -> 생성자 / 2번째 부터는 static은 생성 x
		StaticEx s1 = new StaticEx();
		System.out.println("참조 카운트: " + StaticEx.refCount); // s1.refCount 와 동일
		// static 멤버는 객체를 생성하지 않아도 접근 가능
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트: " + StaticEx.refCount);
		
		// 참조 해제
		s1 = null;
		System.out.println("s1 해제!");
		System.out.println("참조 카운트 : " + StaticEx.refCount);
		
		// 강제로 garbage collector 호출
		// 주의 : Java가 객체를 관리하는 순서를 확인하기 위한 코드, 강제로 gc를 호출하지는 말자!
		System.gc();
		try {
			Thread.sleep(3000); // 3초 대기
			System.out.println("참조 카운트 : " + StaticEx.refCount);
		} catch(Exception e) {
			
		}
	}

}
