package com.javaex.oop.goods.v4;

// v4 this : 객체 자신을 지칭
//	  this() : 객체 자신의 다른 생성자를 지칭
// return type (x), 클래스 명과 같아야 함
// private : 현재 Goods 내부 클래스에서만 활용 가능
public class Goods {
	// 필드
	private String name;
	private int price;
	
	
	// 생성자
	// 1. 사용자가 정의한 생성자가 하나도 없을 경우, 컴파일러가 기본 생성자를 추가
	// 2. 사용자가 생성자를 선언했을 경우, 컴파일러는 기본 생성자를 추가하지 않음
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(String name, int price) {
		// 클래스 내부 다른 생성자를 호출할 때는 this()
		this(name);
		this.price = price;
	}
	// Getter
	// Setter가 없을 경우, 읽기 전용.
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 함.
// 사용자가 생성자를 아예 만들지 않았다 -> Java compiler가 기본 생성자를 추가해준다.
// 사용자가 생성자를 정의했다 -> Java compiler가 기본 생성자를 추가하지 않는다.