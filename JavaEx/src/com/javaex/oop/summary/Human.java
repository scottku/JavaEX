package com.javaex.oop.summary;

public class Human extends Animal{
	public Human(String name, int age) {
		super(name, age);
	}
	//override 필요
	@Override
	public void say() {
		System.out.printf("안녕, 나는 %s야.%n", name);
		
	}
	
	
	
}
