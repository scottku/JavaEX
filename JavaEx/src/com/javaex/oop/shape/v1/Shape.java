package com.javaex.oop.shape.v1;
// 추상 클래스
// 	스스로 객체화 불가
// 	자식에게 물려주기 위한 설계도로만 존재
//	반드시 1개 이상의 추상 메서드를 가져야 한다
// 	특정 기능의 구현을 강제하는 측면이 강하다
public abstract class Shape {
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 & 일반 메서드를 가질 수 있지만 추상 메서드는 반드시 1개 이상
	public abstract void draw();
	public abstract double area();
	

}
