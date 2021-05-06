package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	// 부모로부터 필드와 메서드를 물려받음
	
	private String color;
	//생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y); // 부모에게서 기본 생성자 가져와야 하는데 부모에 기본 생성자가 없음 -> 따로 생성자 만들어 줘야함
		this.color = color;
	}
	
	// 물려받은 멤버를 무시하고 자체적으로 재구현
	@Override
	public void draw() {
		/* 방법 1. 부모의 메서드 호출
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", super.getX(), super.getY(), color); // 그냥 x, y 하면 private여서 가져올 수 없음
		*/
		
		// 방법 2. 부모의 접근 제한자를 protected로 변경
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", x, y, color);
	}

	@Override
	public void draw(boolean show) {
		String message = String.format("색상점[x=%d, y=%d, color=%s]을 ", x, y, color);
		message += show ? "그렸습니다" : "지웠습니다." ;
		System.out.println(message);
		
		// Override를 해도 부모의 메서드가지워지진 않음
		// 명시적으로 super 키워드를 이용해 부모의 메서드에 접근할 수 있음
		System.out.println("부모의 메서드 호출 : ");
		super.draw(show);
	}
}