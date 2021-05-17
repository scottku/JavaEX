package com.javaex;

public class JavaTestEx {

	public static void main(String[] args) {
		//Test1();
		Test2();


	}
	
	private static void Test1() {
		int [][] scores = {
				{ 90, 70, 80, 75, 80 },
					{ 77, 90, 65, 80, 90 },
					{ 80, 75, 95, 80, 75 },
					{ 75, 80, 90, 85, 90 }
				};

//					2차원 배열 요소들의 총 합을 구하는 코드를 작성해 주세요

					int total = 0;
					for (int i = 0 ; i < scores.length ; i++) {
						for (int j = 0 ; j < scores[i].length ; j++) {
							total += scores[i][j];
						}
					}
					System.out.println("총 합: " + total);
	
	}
	
	private static void Test2() {
		int i=1;
		int total = 0;
		while(i <= 100) {
			if(i%2 == 1) {
				total += i;
			} 
			i++;
		}
		System.out.println("100 이하 홀수의 합: " + total);
	}
}
