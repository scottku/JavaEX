package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// 자식 타입의 객체를 부모 타입 클래스로 참조할 수 있다.
		Dog d1 = new Dog("스누피");
		
		d1.eat();
		d1.walk();
		d1.bark();
		
		// 자식 객체를 부모 타입으로 참조하기 > Upcasting
		Animal d2 = new Dog("두기");
		
		d2.eat();
		d2.walk();
		// d2.bark(); -> Animal 내에 bark가 없으므로 실행 불가 -> Downcasting 필요
		if (d2 instanceof Dog) {
			((Dog)d2).bark(); // 설계도를 Animal에서 Dog로 변경
		}
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		pet = new Cat("야옹이");
		pet.eat();
		pet.walk();
		
		// ★ 중요 : Downcasting 시 실제 객체를 확인해야 할 필요 -> instanceof
		if (pet instanceof Dog) { //pet이 Dog 클래스에서 파생된 인스턴스인가?
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}

	}
}