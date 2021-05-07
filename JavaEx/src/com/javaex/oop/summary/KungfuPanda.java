package com.javaex.oop.summary;

//	상속(extends)는 오로지 1 부모로부터만
//	구현(implements)는 여러개의 인터페이스 가능
public class KungfuPanda extends Panda implements KungfuSkill{
	
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void Kungfu() {
		System.out.printf("%s: 아뵤~!%n", name);
		
	}
	

}
