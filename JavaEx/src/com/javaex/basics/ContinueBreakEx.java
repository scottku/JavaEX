package com.javaex.basics;

public class ContinueBreakEx {

	public static void main(String[] args) {
		//continueEx();
		//guguDanFor();
		//guguDanWhile();
		breakEx();
	}
	private static void breakEx() {
		//6과 14로 동시에 나누어 떨어지는 수를 찾아보자
		//루프를 어디까지 돌려야 할 지 알기 힘들기 때문에 while문이 적합
		int i = 1;
		while (true) {
			if(i%6==0 && i%14==0) {
				break;
			}
			System.out.print(".");
			i++;
		}
		System.out.println("\n" + i);
	}
	
	private static void guguDanWhile() {
		int i = 1;
		int j = 1;
		while (i<10) {
			while (j<10) {
				System.out.println(i+" x "+j+" = "+i*j);
				j++;
			}
			j=1;
			i++;
		}
	}
	
	private static void guguDanFor() {
		for(int j = 1 ; j<10 ; j++) {
			for(int i = 1 ; i<10 ; i++) {
				System.out.println(j +" x "+i+" = " +j*i);
			}
		}
	}
	
	private static void continueEx() {
		//1~20까지 수 중에서 2와 3의 배수를 제외한 나머지 수를 출력
		for (int i = 1 ; i<21 ; i++) {
			if(i%2==0 || i%3==0) {
				continue; //2,3의 배수라면 출력은 실행되지 않고 루프 처음으로 돌아간다.
			}
			System.out.println(i);
		}
	}
}
