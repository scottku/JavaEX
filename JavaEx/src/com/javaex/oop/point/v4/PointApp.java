package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		/*
		Point p1 = new Point(10, 20);
		
		p1.draw();
		
		Point p2 = new Point(30, 40);
		
		p2.draw();
		
		// 오버로딩된 매서드 호출
		p1.draw(true);
		p1.draw(false);
		
		p2.draw(true);
		p2.draw(false);
		*/
		
		// 상속 받은 객체 사용
		ColorPoint cp1 = new ColorPoint(50,60,"red");
		cp1.draw(true); // Point가 가지고 있는 draw(boolean)을 그대로 사용 가능 -> 색상 정보를 그리는 기능이 부모에게는 없음 -> override 필요
		
		Point cp2 = new ColorPoint(100,200,"blue");
		cp2.draw(false);
	}

}
