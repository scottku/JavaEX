package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	protected int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, radius=%d, area=%.2f]을 그렸습니다.%n",x,y,r,area());
		
	}

	@Override
	public double area() {
		
		return Math.PI * r * r;
	}
	
	
}
