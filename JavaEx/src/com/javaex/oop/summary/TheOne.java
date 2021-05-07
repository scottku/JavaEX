package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable {
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void Fly() {
		System.out.printf("%s: I believe I can fly!%n", name);
	}

	@Override
	public void Kungfu() {
		System.out.printf("%s: 도리야!%n", name);
	}

}
