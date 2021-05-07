package com.javaex.oop.summary;

public class SummaryApp {
	
	static KungfuSkill dojang[];
	
	public static void main(String[] args) {
		Human h1 = new Human("고길동",50);
		Human h2 = new TheOne("네오", 40);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("푸",20);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		// Kungfu가 가능한 객체를 dojang으로
		dojang = new KungfuSkill[] {
//				(KungfuSkill)h1, //구현하지 않아도 문제는 없다고 표시되지만 컴파일 시 에러 발생
				(KungfuSkill)h2, 
//				(KungfuSkill)p1, 
				(KungfuSkill)p2
		};
		
		for (KungfuSkill actor : dojang) {
			actor.Kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		if (actor instanceof KungfuSkill) {//KungfuSkill이 구현되었는가?
			((KungfuSkill)actor).Kungfu();
		} else {
			System.out.println(actor.name + ": 쿵푸 못해요오...");
		}
	}
	
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).Fly();
		} else {
			System.out.println(actor.name + ": 하늘 못 날아요...");
		}
	}
}
