package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		
		System.out.println("p1 = " + p1);
		
		// 복제 테스트
		Point p2 = p1.getClone();
		System.out.println("p2 = " + p2);
		
		// 두 객체의 값이 같은가?
		System.out.println("p1.equals(p2)? : " + p1.equals(p2));
	}

}
