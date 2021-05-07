package com.javaex.oop.shape.v2;
// 추상 클래스 상속 시 부모 클래스의 추상 메서드는 반드시 구현(강제)
public class Rectangle extends Shape implements Drawable {
	//필드
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d, h=%d, area=%.2f]%n", x,y,width,height,area());
		
	}

	@Override
	public double area() {
		
		return width * height;
	}

}
