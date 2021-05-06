package com.javaex.oop.goods.v2;

// v2 정보 은닉
// private : 현재 Goods 내부 클래스에서만 활용 가능
// 정보에 접근 가능한 특수 메서드 : getter / setter 설정
public class Goods {
	// 필드
	private String name;
	private int price;
	
	// Getter / Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 함.
// 사용자가 생성자를 아예 만들지 않았다 -> Java compiler가 기본 생성자를 추가해준다.
// 사용자가 생성자를 정의했다 -> Java compiler가 기본 생성자를 추가하지 않는다.