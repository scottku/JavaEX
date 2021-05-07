package com.javaex.api.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(12,2);
		Rectangle c = new Rectangle(6,6);
		
		// 
		System.out.println("a.equals(b): " + a.equals(b)); // -> should be true -> Java에게 비교 기준을 알려주지 않아 false가 나옴, 면적 비교 로직 추가 필요
		System.out.println("a.equals(c): " + a.equals(c)); // -> should be false
	}

}
