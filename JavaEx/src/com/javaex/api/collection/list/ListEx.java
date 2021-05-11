package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
//		List<String> lst = new LinkedList<>();
//		 (참조 타입)				(실체 클래스)
		List<String> lst = new ArrayList<>(); // 다형성
		// 객체 추가
		lst.add("Java"); // add -> 맨 뒤에 새 노드 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println(lst);
		
		// 객체의 삽입(중간에 객체 삽입)
		lst.add(2, "C#"); // 2번 인덱스 위치에 C#을 추가
		
		lst.add("Java"); // 중복 데이터 허용
		System.out.println(lst);
		
		// 요소의 갯수 확인
		System.out.println("요소의 갯수 : " + lst.size()); // capacity 확인 x -> 버퍼 기반이 아님
		
		// 요소의 삭제
		lst.remove(2); // 인덱스를 이용한 삭제
		lst.remove("Python"); // 주어진 객체 값으로 삭제
		System.out.println(lst);
		
		// TODO : 루프
		// List, Set -> Iterator 이용
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.print(item + " ");
		} System.out.println();
		
		// 비우기
		lst.clear();
		System.out.println(lst);

	}

}
