package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	// 입력 방향과 출력 방향이 정 반대
	// First In, First Out
	public static void main(String[] args) {
		// 실체 클래스 없음
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터의 제공
		for(int i = 1 ; i <= 10 ; i++) {
			queue.offer(i);
			System.out.println("Offer : " + queue);
		}
		
		System.out.println("Peek : " + queue.peek());
		System.out.println("Queue : " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println("Poll : " + queue.poll());
			System.out.println("Queue: "+ queue);
		}
	}

}
